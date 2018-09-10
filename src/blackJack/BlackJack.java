package blackJack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class BlackJack extends JFrame {
	
	JButton b1;


	public BlackJack() {
		// 제목 설정
		setTitle("BlackJack");
		// X버튼 눌렀을 때 닫히도록 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 프레임 크기 지정
		setSize(1000, 650);
		// JPanel 객체 설정
		JPanel panel = new JPanel();
		// 배치관리자를 null로 설정
		panel.setLayout(null);
		// Jbutton 객체 설정
		b1 = new JButton("Start");
		// Panel 추가
		panel.add(b1);
		// 프레임 보이도록 설정
		setVisible(true);
		// 버튼 위치 설정
		b1.setBounds(450, 480, 100, 60); // b.setBounds(x, y, w, h);
		// 패널 추가
		add(panel);
	}
}


