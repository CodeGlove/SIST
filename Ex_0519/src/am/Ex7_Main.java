package am;

public class Ex7_Main {

	public static void main(String[] args) {
	//원하는 세단클래스를 생성하자!
		Ex7_Sedan gr1 = new Ex7_Sedan();
		gr1.setModel("그랜져300");
		gr1.setMin_price(2700);
		gr1.setSunroof(true);
		
		Ex7_Sedan g80 = new Ex7_Sedan();
		g80.setModel("G80");
		g80.setMin_price(5900);
		g80.setSunroof(false);
		if(gr1.equals(g80))
			System.out.println("서로내용이 같다");
		else 
			System.out.println("서로 내용이 다르다");
	}

}
