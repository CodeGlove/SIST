package pm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Emp extends JFrame implements ActionListener {

	JPanel south_p, north_p;
	JTextArea ta;
	JButton[] bt_ar;

	public Emp() {
		south_p = new JPanel();
		north_p = new JPanel();
		bt_ar = new JButton[4];
	
		
	}


	public static void main(String[] args) {
		//프로그램 시작
		new Emp(); 

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// 

	}
}
