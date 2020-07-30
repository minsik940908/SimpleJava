package chap11.ex02.scan;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("문자열 입력");
		String input = scan.nextLine();
		System.out.println("입력한 값 : " + input);
		
		System.out.println("정수 입력");//int
		int val = scan.nextInt();
		System.out.println("입력한 정수 : " + val);
		
		System.out.println("실수 입력");//double
		double fla = scan.nextDouble();
		System.out.println("입력한 실수 : " + fla);

	}

}
