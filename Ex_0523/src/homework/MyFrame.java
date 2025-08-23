package homework;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {

	int x = 220;
	int y = 170;
	int cmd;
	
	int[] ar = {KeyEvent.VK_RIGHT, KeyEvent.VK_LEFT, KeyEvent.VK_UP, KeyEvent.VK_DOWN};
	
	Thread t1;
	
	JPanel p = new JPanel() {
		// JPanel을 상속받는 익명의 내부클래스 정의

		@Override
		protected void paintComponent(Graphics g) {
			// 현재 JPanel과 같은 크기의 이미지를 생성한다.
			Image buf = createImage(this.getWidth(), this.getHeight());
			
			//buf에만 그림을 그릴 수 있는 붓을 얻어낸다.
			Graphics buf_g = buf.getGraphics();
			buf_g.fillRect(x, y, 40, 40);//buf이미지에 그림을 그린다.
			
			//그림을 그린 이미지를 JPanel에 붙여넣는다.
			g.drawImage(buf, 0, 0, this);
		}		
	};
	
	public MyFrame() {
		this.add(p);
		
		createThread();
		
		setBounds(300, 100, 500, 400);
		setVisible(true);	
		
		//이벤트 감지자 등록
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);//프로그램 종료
			}
			
		});
		addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				// 스페이스 키만 선별하자
				int keyCode = e.getKeyCode();
				
				switch(keyCode) {
					case KeyEvent.VK_SPACE:
						int idx = (int)(Math.random()*ar.length);
						cmd = ar[idx];
						if(!t1.isAlive()) { // 스레드가 이미 소멸되었다면
							createThread();//다시 스레드 생성
							t1.start(); //스레드 구동
						}else
							t1.start();//스레드 구동
						break;
					case KeyEvent.VK_UP:
						cmd = KeyEvent.VK_UP;
						break;
					case KeyEvent.VK_DOWN:
						cmd = KeyEvent.VK_DOWN;
						break;
					case KeyEvent.VK_LEFT:
						cmd = KeyEvent.VK_LEFT;
						break;
					case KeyEvent.VK_RIGHT:
						cmd = KeyEvent.VK_RIGHT;
						break;
				}
			}
		});
	}
	
	public void createThread() {
		t1 = new Thread() {

			@Override
			public void run() {
				// 해당 스레드가 해야할 일
				bk:while(true) {
					
					switch(cmd) {
						case KeyEvent.VK_RIGHT:
							x += 5;
							if(x > p.getWidth()-40) {
								x = p.getWidth()-40;
								break bk;//무한반복 탈출
							}
							break;
						case KeyEvent.VK_LEFT:
							x -= 5;
							if(x < 0) {
								x = 0;
								break bk;//무한반복 탈출
							}
							break;
						case KeyEvent.VK_DOWN:
							y += 5;
							if(y > p.getHeight()-40) {
								y = p.getHeight()-40;
								break bk;//무한반복 탈출
							}
							break;
						case KeyEvent.VK_UP:
							y -= 5;
							if(y < 0) {
								y = 0;
								break bk;//무한반복 탈출
							}
							break;					
					}//switch문 끝
					
					try {
						Thread.sleep(30);
						p.repaint();//그림 다시 그리기
					} catch (Exception e) {
						// TODO: handle exception
					}
				}//무한반복의 끝
			}
			
		};
	}
	public static void main(String[] args) {
		// 프로그램 시작
		new MyFrame();
	}

}
