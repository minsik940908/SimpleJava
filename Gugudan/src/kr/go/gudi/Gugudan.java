package kr.go.gudi;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		// 입력받은 단으로 구구단 만들기
		// 2를 입력 받으면 2단 출력
		System.out.println("단을 입력하시오");
		Scanner scan = new Scanner(System.in);
		int dan = scan.nextInt();
		System.out.println(dan + " 단 : ");
		
		for(int i = 1; i<10; i++) {
			//1. 단을 제대로 입력 받았나?
			//2. 1~9 증가 되는가?
			//3. 계산한 값이 정상으로 출력 되는가?
			System.out.println(dan + " * " + i +" = " + (i*dan));
		}
	}

}
