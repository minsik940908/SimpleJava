package chap03.ex01.arrDefine;

public class Arry {

	public static void main(String[] args) {
		
		//선언과 동시에 초기화
		int[] score = {70, 80, 90};
		String[] names = {"홍길동", "고길동", "박길동"};
		
		//변수 만든 후에 new 연산자로 생성
		int[] socres;
		socres = new int[] {70, 80, 90};
		
		//바로 선언하는 방법(길이 설정)
		int[] arr = new int[7];
	}

}
