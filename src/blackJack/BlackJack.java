package blackJack;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;


class BlackJack extends JFrame {
	
	private ImageIcon icon;
	private JPanel background;
	private JButton button;

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
		
		JLabel Id = new JLabel("아이디 : ");
		Id.setFont(new Font("맑은고딕", Font.BOLD, 13));
		JTextField tf = new JTextField(10);
		background = new JPanel();

		// 배경 이미지 설정
		ImageIcon BackGround = new ImageIcon("C:\\Users\\user\\Desktop\\사진2.png");

		// 배치관리자를 null로 설정
		panel.setLayout(null);

		// Jbutton 객체 설정
		button = new JButton("Start");

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

}
