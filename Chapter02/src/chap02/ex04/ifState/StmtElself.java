package chap02.ex04.ifState;

import java.util.Scanner;

public class StmtElself {

	public static void main(String[] args) {
		//자판기 : 원하는 음료를 입력하면 해당 음료가 나오도록
		System.out.println("음료를 선택 하세요!!");
		//[콜라, 생수, 오렌지 주스, 사이다, 포카리, 커피]
		Scanner scan = new Scanner(System.in);
		String item = scan.nextLine();
		System.out.println("선택 : " + item);
		
		if(item.equals("콜라")) {
			System.out.println("콜라가 나왔습니다.");
		}else if(item.equals("생수")) {
			System.out.println("생수가 나왔습니다.");
		}else if(item.equals("오렌지 주스")) {
			System.out.println("오렌지 주스가 나왔습니다.");
		}else if(item.equals("사이다")) {
			System.out.println("사이다가 나왔습니다.");
		}else if(item.equals("포카리")) {
			System.out.println("포카리가 나왔습니다.");
		}else if(item.equals("커피")) {
			System.out.println("커피가 나왔습니다.");
		}else {
			System.out.println("보유하지 않은 음료입니다.");
		}
		

	}

}
