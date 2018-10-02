package blackJack;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
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

	BlackJack2 blackJack2;
	
	private ImageIcon icon;
	// private JPanel background;
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
        if(blackJack2 == null){
        	blackJack2 = new BlackJack2();
        }else{
        	blackJack2.dispose();
        	blackJack2 = new BlackJack2();
	}
	
	

}

class BlackJack2 extends JFrame implements ActionListener {

	private JButton button;

	public BlackJack2() {
		
		
		super("BlackJack");
		setSize(1000, 650);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		icon = new ImageIcon("C:\\Users\\user\\eclipse-workspace\\BlackJack\\�ϴ�.jpg");
		
		JPanel panel = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		
		add(panel);
	}

	@Override
	 public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        dispose();
		
		}
	}
}
