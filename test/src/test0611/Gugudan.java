package test0611;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		int n = 0;
		Scanner scan = new Scanner(System.in);
	
		System.out.println("단을 입력 하세요.");
		n = scan.nextInt();
		for(int i=1; i<10; i++) {
			System.out.println(n + " X " + i + " = " + n*i);
		}
			

	}

}
