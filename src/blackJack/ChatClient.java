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
        send = new JButton("������");
        JPanel p = new JPanel();

        JScrollPane pane = new JScrollPane(output);
        getContentPane().add("Center", pane);
        output.setEditable(false); // �����Ұ���

        p.setLayout(new BorderLayout());
        p.add("Center", input);
        p.add("East", send);

        this.add("South", p);

        // Frame
        setBounds(996, 0, 288, 686);
        setTitle("ä��â");
        setVisible(true);
        // setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.addWindowListener(new WindowAdapter() {// �͸� Inner Class
            public void windowClosing(WindowEvent e) {// Override
                pw.println("quit"); // ���� ������
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
        // �̺�Ʈ
        input.addActionListener(this);
        send.addActionListener(this);

        // ����(IO)����
        String serverIP = JOptionPane.showInputDialog(this, "������ IP�� �Է��ϼ���",
                "����IP", JOptionPane.QUESTION_MESSAGE);
        if (serverIP == null || serverIP.equals(""))
            System.exit(0);
        String name = JOptionPane.showInputDialog(this, "��ȭ���� �Է��ϼ���", "��ȭ��",
                JOptionPane.QUESTION_MESSAGE);
        if (name == null || name.equals(""))
            name = "�湮��";
        try {
            socket = new Socket(serverIP, 9500);// ����IP, ��Ʈ��ȣ

            // IO
            br = new BufferedReader(new InputStreamReader(
                    socket.getInputStream()));
            pw = new PrintWriter(new OutputStreamWriter(
                    socket.getOutputStream()));

            // ���� ������ - ��ȭ��
            pw.println(name);
            pw.flush();// ���� ����
            t = new Thread(this);// ������ ����
            t.start();// ������ ����->������ ����(run())
        } catch (UnknownHostException e) {
            System.out.println("��Ĺ������ error : " + e.toString());
        } catch (IOException io) {
            System.out.println("��Ĺ������ IO error : " + io.toString());
        }
    }// init()

    public void actionPerformed(ActionEvent e) {
        String data = input.getText();
        pw.println(data);
        pw.flush();
        input.setText("");
    }// actionPerformed()

    public void run() {// ������ ����
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

            int position = output.getText().length();// ��ġ�� ���
            output.setCaretPosition(position);
        }// while
    }

}