package chap09.ex04.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		
		//HashMap 선언
		Map<String, Integer> map = new HashMap<String, Integer>();//다형성 이용
		//데이터 추가
		map.put("kim", 23);//key : 이름, value : 나이
		map.put("lee", 26);
		map.put("park", 26);//value 중복은 상관이 없다.
		map.put("kim", 33);//key 중복은 허용하지 않는다.(나중에 온 값이 덮어쓴다.)
		
		//크기
		System.out.println("map의 크기 : " + map.size());
		//특정값 불러오기
		System.out.println("kim의 나이 : " + map.get("kim"));
		//특정값 삭제하기
		map.remove("lee");
		System.out.println(map);
		
		System.out.println();
		
		//모든값 뽑아내기1(key를 먼저 뽑아내서 value 찾기)
		Set<String> keyset = map.keySet();//key만 가져오기
		Iterator<String> keyIter = keyset.iterator();//key 덩어리 쪼개기
		while(keyIter.hasNext()) {//하나씩 뽑아 낸다.
			String key = keyIter.next();//찾아낸 키로
			int value = map.get(key);//값을 검색 한다.
			System.out.println(key + " : " + value);
		}
		
		System.out.println();
		
		//모든값 뽑아내기2(key-value 를 통으로 뽑아서 쪼개기)
		Set<Entry<String, Integer>> entrySet = map.entrySet();//key-value 덩어리
		Iterator<Entry<String, Integer>> entry = entrySet.iterator();//쪼갠다.
		
		while(entry.hasNext()) {
			Entry<String, Integer> item = entry.next();//key와 value가 함께 있는 형태
			String key = item.getKey();
			int value = item.getValue();
			System.out.println(key + " : " + value);
		}
		
		System.out.println();
		
		//모든값 뽑아내기3 : for-each
		for(String key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
		
		System.out.println();
		
		//초기화
		if(!map.isEmpty()) {
			map.clear();
			System.out.println(map.size());
		}
	}

}
