package blackJack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class BlackJack extends JFrame {
	
	JButton b1;


	public BlackJack() {
		// ���� ����
		setTitle("BlackJack");
		// X��ư ������ �� �������� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ������ ũ�� ����
		setSize(1000, 650);
		// JPanel ��ü ����
		JPanel panel = new JPanel();
		// ��ġ�����ڸ� null�� ����
		panel.setLayout(null);
		// Jbutton ��ü ����
		b1 = new JButton("Start");
		// Panel �߰�
		panel.add(b1);
		// ������ ���̵��� ����
		setVisible(true);
		// ��ư ��ġ ����
		b1.setBounds(450, 480, 100, 60); // b.setBounds(x, y, w, h);
		// �г� �߰�
		add(panel);
	}
}


