package am;

public class Ex3_Impl implements Ex3_Inter {

	@Override
	public void print() {
		System.out.println("Ex3_Impl의 프린트");

	}

	@Override
	public void testValue() {
		System.out.println("Ex3_Impl의 테스트벨류");

	}
	
	//Ex3_Impl의 독단적 기능들
	public void getValue() {
		System.out.println("Ex3_Impdml 의 겟벨류");
	}
	
	
	

}
