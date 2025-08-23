package am;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Formatter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Ex1_GuguDan extends JFrame implements ActionListener {
	//현재 창에서 필요한 객체들을 모두 멤버로 선언
	JPanel north_p;
	JButton[] bt_ar;
	JTextArea ta;
	
	public Ex1_GuguDan(){
		//화면 모양 -- 창틀(JFrame)은 기본 레이아웃이 BorderLayout이다.
		north_p = new JPanel();//패널의 기본 레이아웃이 FlowLayout(추가하는 순서대로 배치)이다.
		bt_ar = new JButton[8];
		for(int i=0; i<bt_ar.length; i++) {
			String v1 = String.valueOf(i+2);
			bt_ar[i] = new JButton(v1);
			north_p.add(bt_ar[i]);//north_p에 생성된 버튼 추가
			//생성된 버튼객체 각각에 이벤트 감지자 등록
			bt_ar[i].addActionListener(this);//현재 객체가 ActionListener를 구현하고 있기 때문에 this를 넣어준다.
		}//for의 끝
 		 //현재 창 north영역에 north_p를 추가한다.
		this.add(north_p, BorderLayout.NORTH);
		
		//현재 창 가운데에 ta를 추가한다. 이때 스크롤도 적용해야함
		JScrollPane jp = new JScrollPane(ta = new JTextArea());
		this.add(jp);
		
		setBounds(300, 100, 500, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		//프로그램 시작\
		new Ex1_GuguDan();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//각 버튼을 클릭할때마다 수행하는 곳
		//현재 이벤트를 발생시킨 객체의 문자열을 얻어낸다.
		String str = e.getActionCommand();
		int dan = Integer.parseInt(str);
		StringBuffer sb = new StringBuffer(str);
		sb.append("단\r\n");
		sb.append("-----------------\r\n");
		Formatter fm = new Formatter(sb);
		for(int i=1; i<10; i++) {
			fm.format("%d*%d=%d\r\n", dan, i, dan*i);
		}
		/*
		for(int i=1; i<10; i++) {
			sb.append(str);
			sb.append("*");
			sb.append(i);
			sb.append("=");
			sb.append(dan*i);
			sb.append("\r\n");
		}//for의끝
		*/
		ta.setText(sb.toString());
		
		/*
		ta.setText(str);
		ta.append("단\r\n");
		ta.append("-------------\r\n");
		for(int i=1; i<10; i++) {
			ta.append(str);
			ta.append("*");
			ta.append(String.valueOf(i));
			ta.append("=");
			ta.append(String.valueOf(dan*i));
			ta.append("\r\n");
		}
		*/
	}
}
