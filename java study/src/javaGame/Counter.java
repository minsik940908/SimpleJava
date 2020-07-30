package javaGame;

import java.util.Arrays;
import java.util.Scanner;

public class Counter {
	
	public void counter(int input, int[] number) {
		forout : 
			while(true) {
				System.out.println("던질 숫자를 입력하세요 : ");
				Scanner scan1 = new Scanner(System.in);
				int play = scan1.nextInt();
				int[] playNumber = new int[input];
				if((Math.log10(play)+1) != playNumber.length) {
					System.out.println("던질 숫자를 다시 입력해주세요.");
					continue;
				}
				int strike = 0;
				int ball = 0;
				int out = 0;
				int counter = 0;
				for (int i = 0; i < playNumber.length; i++) {//입력받은 숫자를 자릿수마다 분해해서 배열에 저장
					if(i != playNumber.length-1) {
						playNumber[i] = play / (int)Math.pow(10, playNumber.length-(i+1));
						play = play % (int)Math.pow(10, playNumber.length-(i+1));
					}else {
						playNumber[i] = play % 10;
					}
				}
				
				for(int a= 0; a < number.length; a++) {//입력받은 숫자와 랜덤으로 생성된 숫자를 비교하면서 strike,ball카운트
					if(Arrays.equals(playNumber, number)) {
						System.out.println("정답입니다.");
						break forout;
					}
					for(int b = 0; b<playNumber.length;b++) {
						if(number[a] == playNumber[b] && a == b) {
							strike++;
							continue;
						}
						else if(number[a] == playNumber[b] && a != b) {
							ball++;
							continue;
						}
						else {
							counter++;
						}
							
					}
				}
				if(counter == Math.pow((int)input, 2)) {
					System.out.println("out 입니다.");
				}
				else
					System.out.println("strike : "  + strike + " ball : "  + ball + " 입니다.");
			}
	}

}
