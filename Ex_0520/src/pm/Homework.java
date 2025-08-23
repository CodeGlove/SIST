package pm;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Homework extends JFrame implements ActionListener{

	JPanel north_p, center_p;
	JButton bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8;
	JTextArea ta; //여러 줄을 입력할 수 있는 텍스트 상자
	public Homework() {
		
		 north_p = new JPanel();
		 center_p = new JPanel();
		 
		 for(int i=0; i<9; i++) {
		
			 
			 
			 
		 }
		 
		 
		 bt1 = new JButton("2");
		 bt2 = new JButton("3");
		 bt3 = new JButton("4");
		 bt4 = new JButton("5");
		 bt5 = new JButton("6");
		 bt6 = new JButton("7");
		 bt7 = new JButton("8");
		 bt8 = new JButton("9");
		 ta = new JTextArea();
		 
		 north_p.add(bt1);
		 north_p.add(bt2);
		 north_p.add(bt3);
		 north_p.add(bt4);
		 north_p.add(bt5);
		 north_p.add(bt6);
		 north_p.add(bt7);
		 north_p.add(bt8);
		this.add(north_p, BorderLayout.NORTH);
		this.add(center_p);
		
		
		
		
		//이벤트 감지자 등록
	      bt1.addActionListener(this);//현재 객체가 액션리스너를 구현하고 있으니까 this를 쓴다.
	      bt2.addActionListener(this);
	      bt3.addActionListener(this);
	      bt4.addActionListener(this);
	      bt5.addActionListener(this);
	      bt6.addActionListener(this);
	      bt7.addActionListener(this);
	      bt8.addActionListener(this);

	      
	      
	
	}
	public static void main(String[] args) {
		new Homework();//기본생성자

	}






	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object obj = e.getSource();
		ArrayList<String> ar = new ArrayList<String>(bt)
				
		for(int i = 2; i<10; i++) {
			if(obj == bt) {
				
			}
			else if(obj == bt3) {
				
			}
			else if(obj == bt4) {
				
			}
		}
		
		
	}

}
