package chap09.ex01.arList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {

		//배열로 만든 내용을 arrayList로 변환
		String arr[] = {"list", "set", "map"};
		
		//Array -> List(ArrayList의 인터페이스) -> ArrayList
		List<String> list = Arrays.asList(arr);//array에 있는 내용을 list에 통으로 넣는다.
		System.out.println(list.size());
		System.out.println(list.get(1));
		//list 는 데이터 변경이 불가능, 읽기만 가능
		
		System.out.println();
		
		//List -> ArrayList
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.addAll(list);//list에 있는 내용을 arrayList에 통으로 넣는다.
		arrList.add("collection");
		
		for(String item : arrList) {
			System.out.println(item);
		}
	}

}
