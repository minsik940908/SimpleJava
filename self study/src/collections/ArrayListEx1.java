package collections;

import java.util.ArrayList;
import java.util.Collections;
public class ArrayListEx1 {

	public static void main(String[] args) {
		//list 인터페이스를 구현한다.
		//중복을 허용하면서 저장순서가 유지된다.
		ArrayList list1 = new ArrayList();
		list1.add(10);
		list1.add(5);
		list1.add(4);
		list1.add(8);
		list1.add(7);
		list1.add(2);
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		System.out.println(list1);
		System.out.println(list2);
		
		Collections.sort(list1);
		Collections.sort(list2);
		
		System.out.println(list1);
		System.out.println(list2);
		
		
		
		

	}

}
