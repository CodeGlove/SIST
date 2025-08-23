package pm;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

public class Ex4_Dialog extends JDialog implements WindowListener, ActionListener{

	JButton red_bt, green_bt, blue_bt;
	JPanel p;
	Ex4_Frame f;
	
	public Ex4_Dialog(Ex4_Frame n) {
		f = n;// *******
		
		//화면구성
		p = new JPanel();
		p.add(red_bt = new JButton("Red"));
		p.add(green_bt = new JButton("Green"));
		p.add(blue_bt = new JButton("Blue"));
		
		this.add(p); //현재창 가운데에 p추가
		
		setBounds(400, 150, 250, 160);
		setVisible(true);
		
		//종료 이벤트
		this.addWindowListener(this);
		red_bt.addActionListener(this);
		green_bt.addActionListener(this);
		blue_bt.addActionListener(this);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// 종료버튼 클릭할 때 호출되는 곳
		this.dispose();//현재 대화창 객체만 메모리에서 삭제
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 이벤트가 발생한 버튼객체 얻어내기
		Object obj = e.getSource();
		if(obj == red_bt)
			f.center_p.setBackground(Color.RED);
		else if(obj == green_bt)
			f.center_p.setBackground(Color.GREEN);
		else 
			f.center_p.setBackground(Color.BLUE);
	}
	
}
