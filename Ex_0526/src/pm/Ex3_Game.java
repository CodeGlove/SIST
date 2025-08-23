package pm;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex3_Game extends JFrame {

	JPanel p;
	Image background, gunship, missile;
	
	int bgY; //0
	int bgHeight;
	int shipX = 250;
	int shipY = 600;
	
	ArrayList<Ex3_Missile> al = new ArrayList<>();
	
	
	//배경을 움직이게 하는 스레드
	Thread t = new Thread() {

		@Override
		public void run() {
			while(true) {
				p.repaint(); // paintComponent가 호출되며, 여기서 bgY가 증가한다.
				
				// 배경 위치 업데이트
				bgY += 2;
				if(bgY >= bgHeight) //화면 아래에 도달한 경우
					bgY = 0; //다시 초기값 0을 넣어서 위로 올린다.
				try {
					Thread.sleep(30);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}//무한반복
		}
		
	};
	
	public Ex3_Game() {
		
		background = new ImageIcon("src/images/space.jpg").getImage();
		gunship = new ImageIcon("src/images/gunship.png").getImage();
		missile = new ImageIcon("src/images/missile.png").getImage();
		
		p = new JPanel() {

			@Override
			protected void paintComponent(Graphics g) {
				Image buf = createImage(this.getWidth(), this.getHeight());
				
				Graphics buf_g = buf.getGraphics();
				
				//배경 그리기
				bgHeight = background.getHeight(this);//배경이미지의 높이값
				buf_g.drawImage(background, 0, bgY, getWidth(), bgHeight, null);
				buf_g.drawImage(background, 0, bgY-bgHeight, getWidth(), bgHeight, null);
				
				//비행기 그리기
				buf_g.drawImage(gunship, shipX, shipY, 60, 60, null);
				
				//총알 그리는 반복문
				for(int i=0; i<al.size(); i++) {
					Ex3_Missile m = al.get(i);
					
					buf_g.drawImage(missile, m.m_x, m.m_y, m.m_w, m.m_h, this);
				}
				
				
				//화면에 나타내기 위해 이미지를 패널에 붙여넣는다.
				g.drawImage(buf, 0, 0, this);
			}
			
		};
		
		add(p);
		p.setFocusable(true);//패널을 활성화
		
		setBounds(300, 100, 600, 800);
		setVisible(true);
		
		t.start();// 배경 움직이는 스레드 시작!!
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);//프로그램 종료
			}
		});
		
		p.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				// 선택한 키의 코드값을 얻어낸다.
				int keyCode = e.getKeyCode();
				int step = 5;
				switch(keyCode) {
					case KeyEvent.VK_LEFT:
						/*shipX -= step;
						if(shipX < 0)
							shipX = 0;*/
						shipX = Math.max(shipX - step, 0);
						break;
					case KeyEvent.VK_RIGHT:
						shipX = Math.min(shipX + step, p.getWidth() - 60);
						break;
					case KeyEvent.VK_UP:
						shipY = Math.max(shipY - step, 0);
						break;
					case KeyEvent.VK_DOWN:
						shipY = Math.min(shipY + step, p.getHeight() - 60);
						break;
					case KeyEvent.VK_SPACE:
						Ex3_Missile m = new Ex3_Missile(
								Ex3_Game.this, shipX+(gunship.getWidth(p)/2 - (19/2)), shipY);
						
						al.add(m);// ArrayList에 추가
						m.start();
						break;
				}//switch문의 끝
				p.repaint();// 비행선의 좌표가 변경되었으니 그림을 다시 그린다.
			}
		});
		
	}//생성자의 끝
	
	
	public static void main(String[] args) {
		// 프로그램 시작
		new Ex3_Game();
	}

}
