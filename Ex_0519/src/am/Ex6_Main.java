package am;

public class Ex6_Main {

	public static void main(String[] args) {
	//원하는 객체 생성
	Ex6_Child child = new Ex6_Child();
	int money = child.getMoney();//자식클래스가 상속받았기 때문에 자식클래스의 자신이 가진 것처럼 사용할 수 있다. 
	System.out.printf("%d조원", money);							

	}

}
