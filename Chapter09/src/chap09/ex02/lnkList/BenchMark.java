package chap09.ex02.lnkList;

import java.util.ArrayList;
import java.util.LinkedList;

public class BenchMark {

	public static void main(String[] args) {
		
		//1. ArrayList 와 LinkedList 준비
		ArrayList<String> arr = new ArrayList<String>();
		LinkedList<String> lnk = new LinkedList<String>();
		
		//2. 기본 데이터 넣기
		for(int i =1; i<=100; i++) {
			arr.add("data" + i);
			lnk.add("data" + i);
		}
		
		//3. 중간에 데이터 넣기(순서 : ArrayList -> LinkedList)
		//시간재기 : 걸린시간 = 도착시간 - 시작시간
		long termTime = 0;
		long startTime = 0;
		long endTime = 0;
		
		//스탑워치 시작
		startTime = System.currentTimeMillis();//현재 시간을 1/1000 초로 환산한 값
		for(int i = 1; i<=1000000; i++) {
			arr.add(55,"add data"); //지정한 인덱스부터 보다 뒤에서 순서대로 삽입은 arraylist가 좀 더 빠르다
			
		}
		//스탑워치 종료
		endTime = System.currentTimeMillis();//현재 시간을 1/1000 초로 환산한 값
		System.out.println("ArrayList 결과 : " + (endTime - startTime) + "ms");
		
		startTime = System.currentTimeMillis();
		for(int i = 1; i<=1000000;i++) {
			lnk.add(55, "add data");
		}
		endTime = System.currentTimeMillis();
		System.out.println("LinkedList : " + (endTime - startTime) + "ms");
		
		
		

	}

}
