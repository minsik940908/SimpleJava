package chap04.ex12.prv;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Computer com = new Computer();
		Scanner scan = new Scanner(System.in);
		//boolean in=scan.nextBoolean();
		//int in2 = scan.nextInt();
		//전원 상태 확인
		System.out.println(com.isPower());
		System.out.println("전원이 꺼져 있습니다.");
		//전원 켜기
		System.out.println("전원을 키세요");
		//com.setPower(in);
		System.out.println(com.isPower());
		//팬 속도 확인
		System.out.println(com.getPanSpeed());
		//팬 속도 조절
		com.setPanSpeed(3);
		System.out.println(com.getPanSpeed());
		//CPU 온도 확인
		com.getTemp();

	}

}
