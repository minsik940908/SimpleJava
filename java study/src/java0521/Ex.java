package java0521;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Ex {

	public static void main(String[] args) {
		
		int input = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		input = scan.nextInt();
		Random random = new Random();
		int[] number = new int[input];//게임을 진행할 숫자를 저장하는 배열
		for (int i = 0; i < number.length; i++) {
			number[i] = random.nextInt(10);
			for (int j = 0; j < i; j++) {
				if(number[i] == number[j]) {
					i--;
	            }

            }
		}
		for(int a = 0; a < number.length; a++)
			System.out.println(number[a]);
	}
}

