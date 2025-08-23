package pm;

public class Ex3_Missile extends Thread {

	int m_x, m_y;
	int m_w = 19;
	int m_h = 88;
	
	Ex3_Game f;
	
	public Ex3_Missile(Ex3_Game f, int x, int y) {
		m_x = x;
		m_y = y;
		this.f = f;
	}

	@Override
	public void run() {
		while(true) {
			m_y -= 5;
			
			f.p.repaint();
			
			try {
				Thread.sleep(20);
			} catch (Exception e) {
				// TODO: handle exception
			}
			if(m_y < 0)
				break;//무한반복 탈출
		}//while의 끝
		f.al.remove(this);
		f.p.repaint();
	}
	
	
}
