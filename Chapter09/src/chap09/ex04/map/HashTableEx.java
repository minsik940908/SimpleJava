package chap09.ex04.map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableEx {

	public static void main(String[] args) {

		//편하긴 하지만 속도면에서 손해
		Map<String,Integer> map = new Hashtable<>();//다이아몬드 연산자
		
		//이름, 점수
		map.put("김철호", 99);
		map.put("박철호", 99);
		map.put("박은비", 89);
		map.put("신철호", 59);
		map.put("한철호", 49);
		map.put("배철호", 99);
		map.put("곽철호", 39);
		map.put("문철호", 79);
		map.put("안철호", 19);
		map.put("최철호", 25);
		
		//해당 키가 존재 하는지 찾는 기능
		String name = "박은비";
		if(map.containsKey(name)) {
			System.out.println(name + " 학생이 존재함");
			System.out.println("점수 : " + map.get(name));
		}
		//해당 값이 존재하는지 찾는 기능
		int score = 99;
		if(map.containsValue(score)) {
			System.out.println(score + " 점");
		}
		
		//값을 통해서 키를 찾는 방법(직접 구현 해야한다.) - 99점의 학생 이름 찾기
		//1. value 를 찾는다.(Entry 에서 원하는 값을 찾는다.)
		//2. value 를 통해 key를 찾는다.(해당 값을 가지고 있는 Entry 의 키값을 가져온다.)
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entry = entrySet.iterator();
		
		while(entry.hasNext()) {
			Entry<String, Integer> item = entry.next();
			if(item.getValue() == 99) {
				System.out.println(item.getValue() + " 점 인 사람의 이름은 : " + item.getKey());
			}
		}
		
		
		
		
		
		/*
		Set<String> key = map.keySet();
		Iterator<String> keyIt = key.iterator();
		while(keyIt.hasNext()) {
			String k = keyIt.next();
			int val = map.get(k);
			if(val == 99) {
				System.out.println(score + " 점인 학생의 이름은 : " + k);
			} else
				continue;
		}*/
		
		
		
		

	}

}
