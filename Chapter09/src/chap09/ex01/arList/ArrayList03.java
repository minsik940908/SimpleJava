package chap09.ex01.arList;

import java.util.ArrayList;

public class ArrayList03 {
	
	//데이터 수정, 검색, 초기화
	public static void main(String[] args) {
		
		ArrayList<Integer> score = new ArrayList<Integer>();
		score.add(70); //0
		score.add(80); //1
		score.add(50); //2
		score.add(90); //3
		score.add(100); //4
		score.add(90); //5
		
		//SET : 특정 인덱스의 데이터 변경
		score.set(3, 95);//3번 인덱스의 값을 95로 변경
		
		//contains : 특정 값이 있는지 유무 판단
		System.out.println(score.contains(30));
		
		//indexOf : 특정값의 위치 반환, 없을 경우 -1
		System.out.println(score.indexOf(90));
		
		for(int s : score) {
			System.out.println(s);
		}
		
		//초기화 : 있는 값을 싹 지운다.
		score.clear();
		System.out.println("clear ? : "+ score.isEmpty());// arraylist가 비어있는지 확인 boolean타입으로 반환
		

	}
}
