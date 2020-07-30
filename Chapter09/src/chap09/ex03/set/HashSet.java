package chap09.ex03.set;

import java.util.Iterator;
import java.util.Set;

public class HashSet {//기본적으로 A,B,C,D 순서이지만 절대적인건 아니다.(해쉬값에 의한 순서)

	public static void main(String[] args) {
		
		//Set 선언
		Set<String> set = new java.util.HashSet<String>(); //클래스명 중복시 앞에 패키지가 붙는다
		Set<Member> members = new java.util.HashSet<Member>();
		
		//데이터 추가
		set.add("JAVA");
		set.add("JSP");
		set.add("ORACLE");
		set.add("MVC");
		set.add("JAVA");//중복 허용 X
		
		for(String item : set) {
			System.out.print(item + " | ");
		}
		
		System.out.println();
		members.add(new Member());
		members.add(new Member());//객체 중복 아님(새로운 객체 생성)
		
		//하나씩 뽑아 내기
		Iterator<String> iter = set.iterator();//덩어리를 쪼갬
		while(iter.hasNext()) {//남아있는 값 있어?
			String item = iter.next();//있으면 뽑아 옴
			System.out.print(item + " | ");
		}
		
		
		//특정요소 삭제
		set.remove("ORACLE");
		System.out.println();
		
		//하나씩 뽑아 내기 2
		for(String item : set) {
			System.out.print(item + " | ");
		}
		
		System.out.println();
		if(!set.isEmpty()) {
			set.clear();
			System.out.println(set.size());
		}
		
		if(!members.isEmpty()) {
			members.clear();
			System.out.println(members.size());
		}
		
		
		
	}

}

class Member{
	
}
