package java0515;

import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		
		int a = 12345;
		int c = 0;
		int[] b = new int[5];
		
		for (int i = 0; i < b.length; i++) {
			if(i != b.length-1) {
				b[i] = a / (int)Math.pow(10, b.length - (i+1));
				a = a % (int)Math.pow(10, b.length - (i+1));
			}else {
				b[i] = a % 10;
			}
			System.out.println(b[i]);
			
		}
	
			
	}
		
}


