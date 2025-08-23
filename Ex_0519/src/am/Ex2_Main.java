package am;

public class Ex2_Main {

	public static void main(String[] args) {
		Ex2_Ref b = new Ex2_Ref();
		int[] ar = {100, 200, 300};
		
		//b객체가 가지는 test함수를 호출하면서
		//인자로 ar을 전달하자!
		b.test(ar);
		System.out.printf("%d, %d, %d", ar[0], ar[1], ar[2]);
	}

}
