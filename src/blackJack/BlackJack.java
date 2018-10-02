package blackJack;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javax.swing.JLabel;

class BlackJack extends JFrame implements ActionListener {
	// 방, 유저, 채팅창 목록을 보여주는 화면을 위해 BlackJack2 변수 생성
	BlackJack2 blackJack2;
	// 이미지를 위한 icon 변수 생성
	private ImageIcon icon;
	// private JPanel background;
	private JButton button;

	// BlackJack 메소드 생성
	public BlackJack() {

		icon = new ImageIcon("C:\\Users\\user\\eclipse-workspace\\BlackJack\\블랙잭배경화면.jpg");

		// 제목 설정
		setTitle("BlackJack");

		// X버튼 눌렀을 때 닫히도록 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 프레임 크기 지정
		setSize(1000, 650);

		// JPanel 객체 설정
		JPanel panel = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		// 아이디 입력을 위한 객체들 생성
		JLabel Id = new JLabel("아이디 : ");
		Id.setFont(new Font("맑은고딕", Font.BOLD, 13));
		JTextField tf = new JTextField(10);
		// background = new JPanel();

		// 배경 이미지 설정
		// ImageIcon BackGround = new ImageIcon("C:\\Users\\user\\Desktop\\사진2.png");

		// 배치관리자를 null로 설정
		panel.setLayout(null);

		// 버튼 이미지 삽입
		ImageIcon normalicon = new ImageIcon("C:\\Users\\user\\eclipse-workspace\\BlackJack\\시작버튼.jpg");
		// Jbutton 객체 설정
		button = new JButton("", normalicon);
		button.addActionListener(this);

		// Panel 추가
		panel.add(button);
		panel.add(Id);
		panel.add(tf);

		// 프레임 보이도록 설정
		setVisible(true);

		// 버튼 위치 설정
		button.setBounds(470, 480, 100, 60); // b.setBounds(x, y, w, h);
		Id.setBounds(430, 400, 150, 100);
		tf.setBounds(480, 440, 120, 20);

		// 패널 추가
		add(panel);

	}

	// 새창을 띄우기 위해 메소드 생성
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (blackJack2 == null) {
			blackJack2 = new BlackJack2();
		} else {
			blackJack2.dispose();
			blackJack2 = new BlackJack2();
		}

	}

	// 방, 유저, 채팅창 화면을 보여주기 위해 BlackJack2 클래스 생성
	class BlackJack2 extends JFrame implements ActionListener {
		// Button을 위한 변수 생성
		private JButton button;

		// BlackJack2 메소드 생성
		public BlackJack2() {

			// 2번쨰 화면의 제목과, 크기 등을 설정
			super("BlackJack");

			setSize(1000, 650);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);

			// 2번쨰 화면의 배경화면 설정
			icon = new ImageIcon("C:\\Users\\user\\eclipse-workspace\\BlackJack\\하늘.jpg");
			// 화면전환을 위한 JPanel 객체 설정
			JPanel panel = new JPanel() {
				public void paintComponent(Graphics g) {
					g.drawImage(icon.getImage(), 0, 0, null);
					setOpaque(false);
					super.paintComponent(g);
				}
			};

			// 유저목록, 채팅창, 방목록 화면 분할을 위한 JPanel 객체 생성
			JPanel userList = new JPanel();
			JPanel catting = new JPanel();
			//
			setLayout(null);
			// 패널 위치 지정
			panel.setBounds(0, 0, 1000, 650);
			// 패널 위치 지정 및 화면 배경색 지정
			userList.setBounds(750, 0, 250, 450);
			userList.setBackground(Color.WHITE);
			// 패널 위치 지정 및 화면 배경색 지정
			catting.setBounds(0, 450, 1000, 200);
			catting.setBackground(Color.GRAY);
			// 정확한 위치를 잡기 위한 객체 생성
			Container cp = getContentPane();
			cp.add(catting);
			cp.add(userList);
			cp.add(panel);

		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			dispose();

		}
	}
}
