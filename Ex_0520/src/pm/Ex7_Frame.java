package pm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Ex7_Frame extends JFrame implements ActionListener{

	//현재창에 필요한 모든 객체들을 멤버변수로 선언한다.
	   JPanel north_p, center_p;
	   JButton bt1, bt2, bt3;
	 
	   public Ex7_Frame() {
		   north_p = new JPanel();
		   center_p = new JPanel();
		      bt1 = new JButton("Red");
		      bt2 = new JButton("Green");
		      bt3 = new JButton("Blue");
		      
		      //각 객체들 배치 - 버튼들은 north_p에 추가
		      north_p.add(bt1);
		      north_p.add(bt2);
		      north_p.add(bt3);
		      //버튼 3개를 모두 가지고 있는north_p를 현재 창 north영역에추가.
		      this.add(north_p, BorderLayout.NORTH);
		   
		      //현재 창 가운데에 center_p를 추가
		      this.add(center_p);
		      //setSize(500, 400);
		      //setLocation(300,100);
		      setBounds(300, 100, 500, 400);//setSize와 setLocation을 합친 것
		      setVisible(true);
		      setDefaultCloseOperation(EXIT_ON_CLOSE);
		      
		     //이벤트 감지자 등록
		      bt1.addActionListener(this);//현재 객체가 액션리스너를 구현하고 있으니까 this를 쓴다.
		      bt2.addActionListener(this);
		      bt3.addActionListener(this);
	   }
	
	public static void main(String[] args) {
	
		//Ex7_Frame f = new Ex7_Frame();//f가 영역안에서 한번밖에 안쓰였기 때문에 밑에처럼 적어도 된다.
		new Ex7_Frame();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//이벤트가 발생할 때마다 수행하는 곳!
		//이벤트를 발생시킨 객체를 알아낸다.
		Object obj = e.getSource();
		if(obj == bt1)
			center_p.setBackground(Color.RED);
		else if(obj == bt2)
		center_p.setBackground(Color.GREEN);
		else
			center_p.setBackground(Color.BLUE);
	}

}
