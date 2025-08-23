package am;

public class Ex1_Main {

	public static void main(String[] args) {
		//원하는 객체 생성
		Ex1_Value a = new Ex1_Value();
		int value = 100;//인자로 전달할 값
		
		a.test(value);//value값을 넣어서 a의 test함수 호출
		System.out.println(value);//100
	}

}
