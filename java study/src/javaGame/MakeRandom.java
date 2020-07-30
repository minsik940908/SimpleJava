package javaGame;

import java.util.Random;

public class MakeRandom {
	
	

	public int[] ranDom(int input) {
		Random random = new Random();
		int[] number = new int[input];
		for(int i = 0; i< number.length; i++) {
			number[i] = random.nextInt(10);
			for(int j =0; j< i; j++) {
				if(number[i] == number[j]) {
					i--;
				}
			}
		}
		
		
		return number;
		
	}
	

}
