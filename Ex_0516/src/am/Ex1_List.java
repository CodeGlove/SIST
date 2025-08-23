package am;

import java.util.ArrayList;

public class Ex1_List {

	public static void main(String[] args) {
		// List구조는 배열과 같이 index로 요소를 접근하고
		// 중복을 허용한다.
		
		ArrayList<String> list = new ArrayList<>();
		String s = new String("SiST");
		String s1 = "SiST";
		//저장기능
		list.add(s1);
		list.add("123");
		list.add("abc");
		list.add(s);
		list.add("SiST");
		System.out.printf("list.size():%d\n", list.size());// 5
		
		//변수 s1와 같은 객체가 어디에 저장되었는지? 알아보는 반복문
		for(int i=0; i<list.size(); i++) {
			String v1 = list.get(i);// ArrayList에서 하나씩 얻어낸다.
			if(v1 == s1) {
				System.out.printf("찾으시는 s1가 index %d에 있습니다.\n",i);
			}
		}
		System.out.println("------------------------------");
		if(list.contains(s1)) {
			int idx = list.indexOf(s1);
			System.out.printf("s1이 list에 %d번지에 존재합니다.", idx);
			
		}else
			System.out.println("s1이 list에 존재하지 않습니다.");
	}

}
