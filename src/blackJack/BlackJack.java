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
		setBounds(130, 0, 1015, 690);

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
		
		// 아이디 가져오기
		String getId = tf.getText();

		
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

		private Room room1;
		private Method method;
		private RoomMake roomMake;
		
		ImageIcon roomImage1 = new ImageIcon("C:\\Users\\user\\eclipse-workspace\\BlackJack\\방1사진.jpg");
		ImageIcon roomImage2 = new ImageIcon("C:\\Users\\user\\eclipse-workspace\\BlackJack\\방2사진.jpg");
		ImageIcon roomImage3 = new ImageIcon("C:\\Users\\user\\eclipse-workspace\\BlackJack\\방3사진.jpg");
		ImageIcon roomImage4 = new ImageIcon("C:\\Users\\user\\eclipse-workspace\\BlackJack\\방4사진.jpg");
		
		// Button을 위한 변수 생성 ( 방 목록 버튼 )
		private JButton button1;
		private JButton button2;
		private JButton button3;
		private JButton button4;
		private JButton button5;
		private JButton button6;
		private JButton button7;
		private JButton button8;
		

		// Button을 위한 변수 생성 ( 유저 목록 버튼 )
		private JButton userButton1;
		private JButton userButton2;
		private JButton userButton3;
		private JButton userButton4;
		
		// Button을 위한 변수 생성( 개발자의 한 마디 )
		private JButton make;
		// Button을 위한 변수 생성 ( 게임 하는 법 )
		private JButton help;

		// BlackJack2 메소드 생성
		public BlackJack2() {

			// 2번쨰 화면의 제목과, 크기 등을 설정
			super("BlackJack");

			setBounds(130, 0, 1015, 690);
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
			panel.setLayout(null);

			button1 = new JButton("방1",roomImage1);
			button1.setBounds(0, 0, 370, 155);
			panel.add(button1);
			button1.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent arg0) {
	                new Room();
	            }
	        }); 

			button2 = new JButton("방2",roomImage2);
			button2.setBounds(370, 0, 370, 155);
			panel.add(button2);
			button2.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent arg0) {
	                new Room();
	            }
	        }); 

			button3 = new JButton("방3",roomImage3);
			button3.setBounds(0, 155, 370, 155);
			panel.add(button3);
			button3.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent arg0) {
	                new Room();
	            }
	        }); 

			button4 = new JButton("방4",roomImage4);
			button4.setBounds(370, 155, 370, 155);
			panel.add(button4);
			button4.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent arg0) {
	                new Room();
	            }
	        }); 

			button5 = new JButton("방5",roomImage1);
			button5.setBounds(0, 310, 370, 155);
			panel.add(button5);
			button5.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent arg0) {
	                new Room();
	            }
	        }); 

			button6 = new JButton("방6",roomImage2);
			button6.setBounds(370, 310, 370, 155);
			panel.add(button6);
			button6.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent arg0) {
	                new Room();
	            }
	        }); 
			
			button7 = new JButton("방7",roomImage3);
			button7.setBounds(0, 465, 370, 155);
			panel.add(button7);
			button7.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent arg0) {
	                new Room();
	            }
	        }); 
			
			button8 = new JButton("방8",roomImage4);
			button8.setBounds(370, 465, 370, 155);
			panel.add(button8);
			button8.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent arg0) {
	                new Room();
	            }
	        }); 
			
			help = new JButton("게임 하는 법");
			help.setBounds(0, 620, 370, 29);
			panel.add(help);
			help.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent arg0) {
	                new Method();
	            }
	        }); 
			
			make = new JButton("방 만들기");
			make.setBounds(370, 620, 370, 29);
			panel.add(make);
			make.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent arg0) {
	                new RoomMake();
	            }
	        });

			userButton1 = new JButton("유저목록");
			userButton1.setBounds(740, 0, 261, 30);
			userButton1.setBackground(Color.gray);
			panel.add(userButton1);

			userButton2 = new JButton("홍길동");
			userButton2.setBounds(740, 30, 261, 30);
			panel.add(userButton2);

			userButton3 = new JButton("김영곤");
			userButton3.setBounds(740, 60, 261, 30);
			panel.add(userButton3);
			
			userButton4 = new JButton("정형일(개발자)");
			userButton4.setBounds(740, 90, 261, 30);
			panel.add(userButton4);
			
			setVisible(true);
			
			// 유저목록, 채팅창, 방목록 화면 분할을 위한 JPanel 객체 생성
			JPanel userList = new JPanel();
			JPanel catting = new JPanel();

			// 패널 위치 지정
			panel.setBounds(0, 0, 1000, 650);
			// 패널 위치 지정 및 화면 배경색 지정
			userList.setBounds(740, 0, 260, 450);
			userList.setBackground(Color.WHITE);
			/*
			// 패널 위치 지정 및 화면 배경색 지정
			catting.setBounds(0, 450, 1000, 200);
			catting.setBackground(Color.GRAY);
			// 정확한 위치를 잡기 위한 객체 생성
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
*/
class Method extends JFrame implements ActionListener {
	
	
	public Method() {
		setTitle("game Method");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(130, 0, 1015, 690);
		
//		JPanel gameRoom = new JPanel();
//		// 패널 위치 지정 및 화면 배경색 지정
//		gameRoom.setBounds(0, 0, 1000, 750);
//		gameRoom.setBackground(Color.white);
//		Container cp = getContentPane();
//		cp.add(gameRoom);
		
		ImageIcon methodImage = new ImageIcon("C:\\Users\\user\\eclipse-workspace\\BlackJack\\게임방법.jpg");
		
		JPanel jp = new JPanel();
		jp.setLayout(null);

		JLabel jl = new JLabel(methodImage);
		jl.setFont(new Font("맑은고딕", Font.BOLD, 13));
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



