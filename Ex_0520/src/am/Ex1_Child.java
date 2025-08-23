package am;

public class Ex1_Child extends Ex1_Parent{

	public Ex1_Child() {
		super(10);

	}

	@Override
	public void myData() {
		System.out.println("Child myData");
	}

}
 