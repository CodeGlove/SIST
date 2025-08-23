package am;

public class Ex1_Main {

	public static void main(String[] args) {
		// 원하는 객체 Ex1_Test를 생성하자!
		
		Ex1_Test t1 = new Ex1_Test();
		t1.setName("SiST");
		t1.setAge(30);
		
		Ex1_Test t2 = new Ex1_Test("마루치", 17);
		
		
		
		System.out.printf("t1.name:%s, t1.age:%d\r\n", t1.getName(), t1.getAge());
		System.out.printf("t2.name:%s, t2.age:%d\r\n", t2.getName(), t2.getAge());
		
		
	}

}
