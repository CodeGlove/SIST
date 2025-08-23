package pm;

import java.util.ArrayList;

public class Ex3_List {

	public static void main(String[] args) {
		// 배열과 같은 List구조 생성
		ArrayList<Integer> al = new ArrayList<>(3);
		
		// 현재 List구조의 사이즈를 얻어내자!
		int size = al.size();
		System.out.printf("al.size():%d\n", size);//0
		
		al.add(100);
		size = al.size();
		System.out.printf("al.size():%d\n", size);//1
		
		for(int i=1; i<11; i++)//10번 반복해서 i값 추가
			al.add(i);
		
		size = al.size();
		System.out.printf("al.size():%d\n", size);//11
		
		//List구조에 저장된 요소들을 하나씩 얻어내어 출력하는 반복문
		for(int i=0; i<al.size(); i++) {
			// List구조에 저장된 요소들을 하나씩 얻어낼 때는
			// 반드시 저장된 요소의 자료형을 알아야 한다.
			int v1 = al.get(i);
			System.out.printf("%-4d", v1);
		}//for의 끝
		System.out.println();//줄바꿈
		
		al.remove(1);  // ArrayList에서 1번지, 즉 두번째 요소를 삭제한다.
		for(int i=0; i<al.size(); i++) {
			int v1 = al.get(i);
			System.out.printf("%-4d", v1);
		}//for의 끝
		System.out.println("\n삭제후 al.size():"+al.size());// 10
		
		// 원하는 위치에 추가하기 - insert
		al.add(3,400);
		for(int i=0; i<al.size(); i++) {
			int v1 = al.get(i);
			System.out.printf("%-4d", v1);
		}//for의 끝
		System.out.println();//줄바꿈
		
		// 현재 ArrayList에 99가 있는지? 확인하자!
		/*
		boolean chk = false;
		for(int i=0; i<al.size(); i++) {
			int v = al.get(i);
			if( v == 99 ) {
				chk = true;
				break;
			}				
		}//for의 끝
		if(chk)
			System.out.println("99가 있습니다.");
		else
			System.out.println("99가 없습니다.");
		*/
		//boolean chk = al.contains(99);
		//if(chk)
		if(al.contains(99))
			System.out.println("99가 있습니다.");
		else
			System.out.println("99가 없습니다.");
		
		if(al.contains(400))
			System.out.println("400이 있습니다.");
		else
			System.out.println("400이 없습니다.");
		
		if(al.contains(400)) {
			int idx = al.indexOf(400);
			System.out.printf("400이 %d위치에 있습니다.\r\n", idx);
		}
		
		al.clear();// 모든 요소 삭제
		System.out.printf("clear후 사이즈:%d\n",al.size());//0
		System.out.printf("리스트가 비었을까?:%b",al.isEmpty());//0
		
		
		// 리스트 구조에서 알아야 할 메서드(함수)들
		//  - add : 추가, add(3,400): 3번 위치에 400을 추가
		//  - get : 추출
		//  - remove : 삭제
		//  - size : 저장된 요소수
		//  - clear : 모두 삭제
		//  - contains : 포함여부 확인
		//  - isEmpty : 비었는지? 확인
	}

}






