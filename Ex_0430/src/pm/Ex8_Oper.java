package pm;

public class Ex8_Oper {

	public static void main(String[] args) {
		// 프로그램 시작
		
		int a = 10;
		int b = 7;
					// a=a+2
//		boolean res = ((a+=2)>10) && ((b+=2)>10);
		boolean res = ((a+=2)>10) || ((b+=2)>10);
		
		System.out.println("a="+a);//12
		System.out.println("b="+b);//9
		System.out.println("res="+res);//false
		System.out.println("----------------------------");
		
//		res = ((a+=2)>15) && ((b+=2)>15);
		res = ((a+=2)>15) || ((b+=2)>15);
		System.out.println("a="+a);//14
		System.out.println("b="+b);//?
		System.out.println("res="+res);//false

	}

}
