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

class Room extends JFrame implements ActionListener {

	public Room() {

		super("BlackJack");

		setBounds(130, 0, 1015, 690);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		JPanel catting = new JPanel();
		JPanel gameRoom = new JPanel();

		// 패널 위치 지정 및 화면 배경색 지정
		gameRoom.setBounds(0, 0, 1000, 500);
		gameRoom.setBackground(Color.white);
		catting.setBounds(0, 500, 1000, 140);
		catting.setBackground(Color.GRAY);
		

		Container cp = getContentPane();
		cp.add(gameRoom);
		cp.add(catting);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		dispose();
	}

}

