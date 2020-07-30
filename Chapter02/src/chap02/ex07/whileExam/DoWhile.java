package chap02.ex07.whileExam;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		System.out.println("000 님께서 입장 하셨습니다");
		System.out.println("q 를 입력하면 종료 됩니다.");
		
		Scanner scan = new Scanner(System.in);
		String msg;
		do {//일단 값을 받아서 넘겨준다
			System.out.println("> ");
			msg = scan.nextLine();
			System.out.println("당신> " + msg);
			
		}while(!msg.equals("q"));//그 값이 q이면 do-while문을 벗어난다.
		
		
		//do-while은 do에서 실행한 값을 가지고 다음 실행을 판단할 경우 사용
		 

	}

}
