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
	// ��, ����, ä��â ����� �����ִ� ȭ���� ���� BlackJack2 ���� ����
	BlackJack2 blackJack2;
	// �̹����� ���� icon ���� ����
	private ImageIcon icon;
	// private JPanel background;
	private JButton button;

	// BlackJack �޼ҵ� ����
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
		// ���̵� �Է��� ���� ��ü�� ����
		JLabel Id = new JLabel("���̵� : ");
		Id.setFont(new Font("�������", Font.BOLD, 13));
		JTextField tf = new JTextField(10);
		// background = new JPanel();

		// ��� �̹��� ����
		// ImageIcon BackGround = new ImageIcon("C:\\Users\\user\\Desktop\\����2.png");

		// ��ġ�����ڸ� null�� ����
		panel.setLayout(null);

		// ��ư �̹��� ����
		ImageIcon normalicon = new ImageIcon("C:\\Users\\user\\eclipse-workspace\\BlackJack\\���۹�ư.jpg");
		// Jbutton ��ü ����
		button = new JButton("", normalicon);
		button.addActionListener(this);

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

	// ��â�� ���� ���� �޼ҵ� ����
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

	// ��, ����, ä��â ȭ���� �����ֱ� ���� BlackJack2 Ŭ���� ����
	class BlackJack2 extends JFrame implements ActionListener {
		// Button�� ���� ���� ���� ( �� ��� ��ư)
		private JButton button1;
		private JButton button2;
		private JButton button3;
		private JButton button4;
		private JButton button5;
		private JButton button6;
		
		// Button�� ���� ���� ���� ( ���� ��� ��ư)
		private JButton button7;
		private JButton button8;
		private JButton button9;
		

		// BlackJack2 �޼ҵ� ����
		public BlackJack2() {

			// 2���� ȭ���� �����, ũ�� ���� ����
			super("BlackJack");

			setSize(1000, 650);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
			

			// 2���� ȭ���� ���ȭ�� ����
			icon = new ImageIcon("C:\\Users\\user\\eclipse-workspace\\BlackJack\\�ϴ�.jpg");
			// ȭ����ȯ�� ���� JPanel ��ü ����
			JPanel panel = new JPanel() {
				public void paintComponent(Graphics g) {
					g.drawImage(icon.getImage(), 0, 0, null);
					setOpaque(false);
					super.paintComponent(g);
				}
			};
			panel.setLayout(null);
			
			button1 = new JButton("���� : ����ؿ�~~");
			button1.setBounds(0, 0, 370, 150);
			panel.add(button1);
			
			button2 = new JButton("�� ��� Ŀ�� ����ؿ�!!");
			button2.setBounds(370, 0, 370, 150);
			panel.add(button2);
			
			button3 = new JButton("��3");
			button3.setBounds(0, 150, 370, 150);
			panel.add(button3);
			
			button4 = new JButton("��4");
			button4.setBounds(370, 150, 370, 150);
			panel.add(button4);
			
			button5 = new JButton("��5");
			button5.setBounds(0, 300, 370, 150);
			panel.add(button5);
			
			button6 = new JButton("��6");
			button6.setBounds(370, 300, 370, 150);
			panel.add(button6);
			
			button7 = new JButton("�������");
			button7.setBounds(740, 0, 240, 30);
			button7.setBackground(Color.gray);
			panel.add(button7);
			
			
			
			button8 = new JButton("�������");
			button8.setBounds(740, 30, 240, 30);
			//button8.setBackground(Color.gray);
			panel.add(button8);
			
			button9 = new JButton("�迵��");
			button9.setBounds(740, 60, 240, 30);
			//button9.setBackground(Color.gray);
			panel.add(button9);
			
			
			// �������, ä��â, ���� ȭ�� ������ ���� JPanel ��ü ����
			JPanel userList = new JPanel();
			JPanel catting = new JPanel();
		
			
			// �г� ��ġ ����
			panel.setBounds(0, 0, 1000, 650);
			// �г� ��ġ ���� �� ȭ�� ���� ����
			userList.setBounds(740, 0, 260, 450);
			userList.setBackground(Color.WHITE);
			// �г� ��ġ ���� �� ȭ�� ���� ����
			catting.setBounds(0, 450, 1000, 200);
			catting.setBackground(Color.GRAY);
			// ��Ȯ�� ��ġ�� ��� ���� ��ü ����
			Container cp = getContentPane();
			cp.add(catting);
			cp.add(panel);

			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			dispose();

		}
	}
}
