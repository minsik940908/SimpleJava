package chap09.ex01.arList;

import java.util.ArrayList;

public class ArrayList01 {

	public static void main(String[] args) {
		
		String[] arr = new String[3];//배열 선언 방법
		ArrayList<String> list = new ArrayList<String>(3);//크기 지정 안해도 되지만 지정해줘도 됨
		
		//데이터 추가 
		list.add(0, "collection");//인덱스를 지정해서 넣을 수 있다.
		list.add("thread");//그냥 넣을수도 있다.(다음 인덱스로 자동 지정)
		list.add("java io");//2
		list.add("network");//3 <- 배열 같으면 예외 발생
		
		list.add(3, "lambda");//[3]lambda [4]network

		/*데이터 크기 확인*/
		//list.size()로 크기 확인
		//list.get(n)으로 하나씩 가져 온다.
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}
		
		//데이터 삭제 
		System.out.println(list.remove(2));//지워진 값이 무엇인지 알려줌
		System.out.println(list.remove("thread"));//정상적으로 삭제 되었는지 보여줌
		
		for(String item : list) {
			System.out.println(item);
		}
		
	}

}
