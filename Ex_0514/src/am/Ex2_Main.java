package am;

public class Ex2_Main {

	public static void main(String[] args) {
		// 멤버 생성
		Ex2_Member[] ar = new Ex2_Member[3];
		
		ar[0] = new Ex2_Member();
		ar[1] = new Ex2_Member();
		ar[2] = new Ex2_Member();
		
		ar[0].setName("마루치");
		ar[0].setPhone("010-1234-5678");
		
		ar[1].setName("아라치");
		ar[1].setPhone("010-0123-5678");
		
		ar[2].setName("파란해골");
		ar[2].setPhone("010-0123-1212");

	}

}
