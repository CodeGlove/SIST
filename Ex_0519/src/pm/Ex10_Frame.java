package pm;

import javax.swing.JFrame;

public class Ex10_Frame extends JFrame {

	public static void main(String[] args) {
		//프로그램 시작
		
		//현재객체 생성
		Ex10_Frame frame = new Ex10_Frame();
		frame.setSize(500, 400);//창 크기설정
		frame.setLocation(800, 300);//창 위치설정
		frame.setVisible(true);//창 보여주기
	}

}
