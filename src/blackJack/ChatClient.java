package blackJack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;

public class ChatClient extends JFrame implements ActionListener, Runnable {
    JTextArea output;
    JTextField input;
    JButton send;
    Socket socket;
    BufferedReader br;
    PrintWriter pw;
    Thread t;

    public void init() {
        output = new JTextArea();
        input = new JTextField();
        send = new JButton("보내기");
        JPanel p = new JPanel();

        JScrollPane pane = new JScrollPane(output);
        getContentPane().add("Center", pane);
        output.setEditable(false); // 편집불가능

        p.setLayout(new BorderLayout());
        p.add("Center", input);
        p.add("East", send);

        this.add("South", p);

        // Frame
        setBounds(996, 0, 288, 686);
        setTitle("채팅창");
        setVisible(true);
        // setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.addWindowListener(new WindowAdapter() {// 익명 Inner Class
            public void windowClosing(WindowEvent e) {// Override
                pw.println("quit"); // 서버 보내기
                pw.flush();
                try {
                    br.close();
                    pw.close();
                    socket.close();
                } catch (IOException io) {
                    io.printStackTrace();
                }

                System.exit(0);
            }
        });
        // 이벤트
        input.addActionListener(this);
        send.addActionListener(this);

        // 소켓(IO)생성
        String serverIP = JOptionPane.showInputDialog(this, "서버의 IP를 입력하세요",
                "서버IP", JOptionPane.QUESTION_MESSAGE);
        if (serverIP == null || serverIP.equals(""))
            System.exit(0);
        String name = JOptionPane.showInputDialog(this, "대화명을 입력하세요", "대화명",
                JOptionPane.QUESTION_MESSAGE);
        if (name == null || name.equals(""))
            name = "방문자";
        try {
            socket = new Socket(serverIP, 9500);// 서버IP, 포트번호

            // IO
            br = new BufferedReader(new InputStreamReader(
                    socket.getInputStream()));
            pw = new PrintWriter(new OutputStreamWriter(
                    socket.getOutputStream()));

            // 서버 보내기 - 대화명
            pw.println(name);
            pw.flush();// 버퍼 비우기
            t = new Thread(this);// 쓰레드 생성
            t.start();// 쓰레드 시작->쓰레드 실행(run())
        } catch (UnknownHostException e) {
            System.out.println("소캣생성시 error : " + e.toString());
        } catch (IOException io) {
            System.out.println("소캣생성시 IO error : " + io.toString());
        }
    }// init()

    public void actionPerformed(ActionEvent e) {
        String data = input.getText();
        pw.println(data);
        pw.flush();
        input.setText("");
    }// actionPerformed()

    public void run() {// 쓰레드 구현
        String data = null;
        while (true) {
            try {
                data = br.readLine();
                if (data == null || data.toLowerCase().equals("quit")) {
                    br.close();
                    pw.close();
                    socket.close();
                    System.exit(0);
                }// if
            } catch (IOException io) {
                io.printStackTrace();
            }

            output.append(data + "\n");

            int position = output.getText().length();// 위치값 얻기
            output.setCaretPosition(position);
        }// while
    }

}