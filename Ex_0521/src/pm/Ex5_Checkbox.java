package pm;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex5_Checkbox extends JFrame implements ActionListener, ItemListener {

	JPanel north_p, center_p;
	JButton bt;
	JCheckBox ch1, ch2, ch3;
	GridLayout grid;
	FlowLayout flow;
	
	public Ex5_Checkbox() {
		flow = new FlowLayout(FlowLayout.RIGHT);
		north_p = new JPanel(flow);
		center_p = new JPanel();
		
		//flow = new FlowLayout(FlowLayout.RIGHT);
		//north_p.setLayout(flow);
		
		grid = new GridLayout(3,1);//3행1열
		center_p.setLayout(grid);
		bt = new JButton("확인");
		north_p.add(bt);
		bt.setEnabled(false);//비활성화
		
		//center_p에 들어갈 체크박스 객체 생성
		ch1 = new JCheckBox("항목1");
		ch2 = new JCheckBox("항목2");
		ch3 = new JCheckBox("항목3");
		center_p.add(ch1);
		center_p.add(ch2);
		center_p.add(ch3);
		
		//각 패널들을원하는 위치에 배치
		this.add(north_p, BorderLayout.NORTH);
		this.add(center_p);//CENTER
		
		this.setBounds(300, 100, 400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		//이벤트 감지자 등록
		/*c	ch1.addActionListener(this);
		  	ch2.addActionListener(this);
		  	ch3.addActionListener(this);
		*/
			ch1.addItemListener(this);
			ch2.addItemListener(this);
			ch3.addItemListener(this);
			
		
		
	}
	
	public static void main(String[] args) {
		//프로그램 시작
		new Ex5_Checkbox();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//이벤트를 발생시킨 객체의 문자열을 얻어낸다.
		String str = e.getActionCommand();
		Object obj = e.getSource();
		boolean ch = false;
				if(obj == ch1) 
					ch = ch1.isSelected();
				
				else if(obj == ch2) 
					ch = ch2.isSelected();
				
				else
					ch = ch3.isSelected();
		
				if(ch) 
					this.setTitle(str);
		
				else
					this.setTitle("");//제목 지우기
				  //this.setTitle(str);
		

		if(ch)
			this.setTitle(String.valueOf(ch));
		else
			this.setTitle("");//제목 지우기
		}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			//이벤트를 발생시킨 객체가 뭔지는 모르지만 현재 이벤트를 감지하는
			//객체는 ch1, ch2, ch3가 되므로
			//그냥 이벤트발생 객체의 문자열 얻어낸다.
			Object obj =e.getSource();
			JCheckBox ch =(JCheckBox) obj;
			String str = ch.getActionCommand();
			setTitle(str);//제목변경
		}else
			setTitle("");
							
	}

}