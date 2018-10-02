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
		// Button�� ���� ���� ����
		private JButton button;

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

			// �������, ä��â, ���� ȭ�� ������ ���� JPanel ��ü ����
			JPanel userList = new JPanel();
			JPanel catting = new JPanel();
			//
			setLayout(null);
			// �г� ��ġ ����
			panel.setBounds(0, 0, 1000, 650);
			// �г� ��ġ ���� �� ȭ�� ���� ����
			userList.setBounds(750, 0, 250, 450);
			userList.setBackground(Color.WHITE);
			// �г� ��ġ ���� �� ȭ�� ���� ����
			catting.setBounds(0, 450, 1000, 200);
			catting.setBackground(Color.GRAY);
			// ��Ȯ�� ��ġ�� ��� ���� ��ü ����
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
