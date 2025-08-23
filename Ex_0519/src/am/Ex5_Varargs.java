package am;

public class Ex5_Varargs {

	//Varargs개념
	public void test(int ... n) {

		System.out.println("Varargs개념의 지역변수(n)는 배열개념이된다.");
		System.out.println(n.length);
		
		for(int i=0; i<n.length; i++) {
			System.out.println(n[i]);
		}
	}
}
