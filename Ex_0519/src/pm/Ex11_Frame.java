package pm;

import javax.swing.JFrame;

public class Ex11_Frame extends JFrame {
	public Ex11_Frame() {
		this.setTitle("내가만든 창");
		//현재객체(this)가 상속받아서 가지고있는 setSize호출
		this.setSize(500, 400);
		this.setLocation(400, 400);
		this.setVisible(true);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); 
	}
	public static void main(String[] args) {
		// 프로그램 시작
		Ex11_Frame f = new Ex11_Frame();

	}

}
