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
		
		icon = new ImageIcon("C:\\Users\\user\\eclipse-workspace\\BlackJack\\������ȭ��.jpg");
		
		
		// ���� ����
		setTitle("BlackJack");

		// X��ư ������ �� �������� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ������ ũ�� ����
		setSize(1000, 650);

		// JPanel ��ü ����
		JPanel panel = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		
		JLabel Id = new JLabel("���̵� : ");
		Id.setFont(new Font("�������", Font.BOLD, 13));
		JTextField tf = new JTextField(10);
		background = new JPanel();

		// ��� �̹��� ����
		ImageIcon BackGround = new ImageIcon("C:\\Users\\user\\Desktop\\����2.png");

		// ��ġ�����ڸ� null�� ����
		panel.setLayout(null);

		// Jbutton ��ü ����
		button = new JButton("Start");

		// Panel �߰�
		panel.add(button);
		panel.add(Id);
		panel.add(tf);

		// ������ ���̵��� ����
		setVisible(true);

		// ��ư ��ġ ����
		button.setBounds(470, 480, 100, 60); // b.setBounds(x, y, w, h);
		Id.setBounds(430, 400, 150, 100);
		tf.setBounds(480, 440, 120, 20);

		// �г� �߰�
		add(panel);
		
		

	}

}
