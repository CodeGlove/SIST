package pm;

public class Ex3_Gugudan {

	private int dan;

	public int getDan() {
		return dan;
	}

	public void setDan(int dan) {
		this.dan = dan;
	}
	
	public void print() {
		
		System.out.println(dan+"단");
		System.out.println("------------------");		
		for(int i=1; i<10; i++)
			System.out.printf("%d*%d=%d\r\n",dan, i, dan*i);
		
		/*
		 * System.out.printf("%d*1=%d\r\n",dan, dan*1);
		 * System.out.printf("%d*2=%d\r\n",dan, dan*2);
		 * System.out.printf("%d*3=%d\r\n",dan, dan*3);
		 * System.out.printf("%d*4=%d\r\n",dan, dan*4);
		 * System.out.printf("%d*5=%d\r\n",dan, dan*5);
		 * System.out.printf("%d*6=%d\r\n",dan, dan*6);
		 * System.out.printf("%d*7=%d\r\n",dan, dan*7);
		 * System.out.printf("%d*8=%d\r\n",dan, dan*8);
		 * System.out.printf("%d*9=%d\r\n",dan, dan*9);
		 */
	}
	
	
}//클래스의 끝






