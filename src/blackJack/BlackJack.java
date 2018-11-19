package blackJack;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
//import javax.sound.sampled.AudioInputStream;
//import javax.sound.sampled.AudioSystem;
//import javax.sound.sampled.Clip;

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
		setBounds(130, 0, 1015, 690);

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
		
		// ���̵� ��������
		String getId = tf.getText();

		
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

		private Room room1;
		private Method method;
		private RoomMake roomMake;
		
		ImageIcon roomImage1 = new ImageIcon("C:\\Users\\user\\eclipse-workspace\\BlackJack\\��1����.jpg");
		ImageIcon roomImage2 = new ImageIcon("C:\\Users\\user\\eclipse-workspace\\BlackJack\\��2����.jpg");
		ImageIcon roomImage3 = new ImageIcon("C:\\Users\\user\\eclipse-workspace\\BlackJack\\��3����.jpg");
		ImageIcon roomImage4 = new ImageIcon("C:\\Users\\user\\eclipse-workspace\\BlackJack\\��4����.jpg");
		
		// Button�� ���� ���� ���� ( �� ��� ��ư )
		private JButton button1;
		private JButton button2;
		private JButton button3;
		private JButton button4;
		private JButton button5;
		private JButton button6;
		private JButton button7;
		private JButton button8;
		

		// Button�� ���� ���� ���� ( ���� ��� ��ư )
		private JButton userButton1;
		private JButton userButton2;
		private JButton userButton3;
		private JButton userButton4;
		
		// Button�� ���� ���� ����( �������� �� ���� )
		private JButton make;
		// Button�� ���� ���� ���� ( ���� �ϴ� �� )
		private JButton help;

		// BlackJack2 �޼ҵ� ����
		public BlackJack2() {

			// 2���� ȭ���� �����, ũ�� ���� ����
			super("BlackJack");

			setBounds(130, 0, 1015, 690);
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

			button1 = new JButton("��1",roomImage1);
			button1.setBounds(0, 0, 370, 155);
			panel.add(button1);
			button1.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent arg0) {
	                new Room();
	            }
	        }); 

			button2 = new JButton("��2",roomImage2);
			button2.setBounds(370, 0, 370, 155);
			panel.add(button2);
			button2.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent arg0) {
	                new Room();
	            }
	        }); 

			button3 = new JButton("��3",roomImage3);
			button3.setBounds(0, 155, 370, 155);
			panel.add(button3);
			button3.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent arg0) {
	                new Room();
	            }
	        }); 

			button4 = new JButton("��4",roomImage4);
			button4.setBounds(370, 155, 370, 155);
			panel.add(button4);
			button4.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent arg0) {
	                new Room();
	            }
	        }); 

			button5 = new JButton("��5",roomImage1);
			button5.setBounds(0, 310, 370, 155);
			panel.add(button5);
			button5.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent arg0) {
	                new Room();
	            }
	        }); 

			button6 = new JButton("��6",roomImage2);
			button6.setBounds(370, 310, 370, 155);
			panel.add(button6);
			button6.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent arg0) {
	                new Room();
	            }
	        }); 
			
			button7 = new JButton("��7",roomImage3);
			button7.setBounds(0, 465, 370, 155);
			panel.add(button7);
			button7.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent arg0) {
	                new Room();
	            }
	        }); 
			
			button8 = new JButton("��8",roomImage4);
			button8.setBounds(370, 465, 370, 155);
			panel.add(button8);
			button8.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent arg0) {
	                new Room();
	            }
	        }); 
			
			help = new JButton("���� �ϴ� ��");
			help.setBounds(0, 620, 370, 29);
			panel.add(help);
			help.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent arg0) {
	                new Method();
	            }
	        }); 
			
			make = new JButton("�� �����");
			make.setBounds(370, 620, 370, 29);
			panel.add(make);
			make.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent arg0) {
	                new RoomMake();
	            }
	        });

			userButton1 = new JButton("�������");
			userButton1.setBounds(740, 0, 261, 30);
			userButton1.setBackground(Color.gray);
			panel.add(userButton1);

			userButton2 = new JButton("ȫ�浿");
			userButton2.setBounds(740, 30, 261, 30);
			panel.add(userButton2);

			userButton3 = new JButton("�迵��");
			userButton3.setBounds(740, 60, 261, 30);
			panel.add(userButton3);
			
			userButton4 = new JButton("������(������)");
			userButton4.setBounds(740, 90, 261, 30);
			panel.add(userButton4);
			
			setVisible(true);
			
			// �������, ä��â, ���� ȭ�� ������ ���� JPanel ��ü ����
			JPanel userList = new JPanel();
			JPanel catting = new JPanel();

			// �г� ��ġ ����
			panel.setBounds(0, 0, 1000, 650);
			// �г� ��ġ ���� �� ȭ�� ���� ����
			userList.setBounds(740, 0, 260, 450);
			userList.setBackground(Color.WHITE);
			/*
			// �г� ��ġ ���� �� ȭ�� ���� ����
			catting.setBounds(0, 450, 1000, 200);
			catting.setBackground(Color.GRAY);
			// ��Ȯ�� ��ġ�� ��� ���� ��ü ����
			 */
			Container cp = getContentPane();
			// cp.add(catting);
			cp.add(panel);

		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (room1 == null) {
				room1 = new Room();
			} else {
				room1.dispose();
				room1 = new Room();
			}
			if (method == null) {
				method = new Method();
			} else {
				method.dispose();
				method = new Method();
			}
		}
		/*
		 * @Override public void actionPerformed(ActionEvent e) { // TODO Auto-generated
		 * method stub dispose();
		 */
	
	}
}
/*
class Room extends JFrame implements ActionListener {

	public Room() {

		super("BlackJack");

		setBounds(130, 0, 1015, 690);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		JPanel catting = new JPanel();
		JPanel gameRoom = new JPanel();
		
		// �г� ��ġ ���� �� ȭ�� ���� ����
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
*/
class Method extends JFrame implements ActionListener {
	
	
	public Method() {
		setTitle("game Method");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(130, 0, 1015, 690);
		
//		JPanel gameRoom = new JPanel();
//		// �г� ��ġ ���� �� ȭ�� ���� ����
//		gameRoom.setBounds(0, 0, 1000, 750);
//		gameRoom.setBackground(Color.white);
//		Container cp = getContentPane();
//		cp.add(gameRoom);
		
		ImageIcon methodImage = new ImageIcon("C:\\Users\\user\\eclipse-workspace\\BlackJack\\���ӹ��.jpg");
		
		JPanel jp = new JPanel();
		jp.setLayout(null);

		JLabel jl = new JLabel(methodImage);
		jl.setFont(new Font("�������", Font.BOLD, 13));
		jl.setBounds(0, 0, 980, 620);
		jp.add(jl);
		
		add(jp);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		dispose();
	}
	
}
class RoomMake extends JFrame implements ActionListener {

	public RoomMake() {
		setTitle("RoomMake");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 249, 300, 200);
		
		JPanel jp = new JPanel();
		jp.setLayout(null);
		
		add(jp);
		setVisible(true);

	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		dispose();
		
	}

}



