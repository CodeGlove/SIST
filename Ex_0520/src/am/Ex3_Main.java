package am;

public class Ex3_Main {
	public void test(Ex3_Inter n) {
		n.print();
		n.testValue();
		//n.getValue();//오류! 이유는 현재 메서드로 들어오면서
		//사용범위가 Ex3_Inter로 변경되어 getValue는 없기때문이다.
	}
	public static void main(String[] args) {
		
		Ex3_Class t1 = new Ex3_Class();
		Ex3_Impl t2 = new Ex3_Impl();
		
		//현재 클래스가 가지고 있는 test함수를 호출하기 위해
		// 현재 객체생성
		Ex3_Main main = new Ex3_Main();
		main.test(t1);
		main.test(t2);

	}

}
