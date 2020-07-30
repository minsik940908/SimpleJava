package javaGame;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BaseBall {

	public static void main(String[] args) {
		//숫자야구게임
		//3,4자리의 숫자 선택가능
		//숫자와 위치가 맞으면 strike, 숫자만 맞고 위치가 틀리면 ball, 숫자와 위치 둘 다 틀리면 out
		//숫자 중복 금지
		
		
		//1.사용자에게 몇자리의 숫자로 게임할지 입력받기(최대 4자리)
		int input = 0;//자릿수 입력 받는 변수
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("몇 자리의 숫자로 게임할지 입력해 주세요(최대 4자리) : ");
			input = scan.nextInt();
			if(input > 4) {
				System.out.println("다시 입력해 주세요");
				continue;
			}
			else
				break;
		}
		
		//2.입력 받은 자릿수의 랜덤한 숫자 만들기(숫자 중복 금지)
		int[] number = new int[input];
		MakeRandom make= new MakeRandom();
		number = make.ranDom(input);
		/*
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
	    */
		System.out.println(Arrays.toString(number));
		
		
		//3.사용자가 입력한 숫자로 strike, baseball, out 구별하기
		
		Counter check = new Counter();
		check.counter(input, number);
		
		
		
		/*
		forout : 
		while(true) {
			System.out.println("숫자를 입력하세요 : ");
			Scanner scan1 = new Scanner(System.in);
			int play = scan1.nextInt();
			int[] playNumber = new int[input];
			if((Math.log10(play)+1) > playNumber.length && (Math.log10(play)+1) < playNumber.length) {
				System.out.println("숫자를 다시 입력해주세요.");
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
		}*/
		
	}

}
