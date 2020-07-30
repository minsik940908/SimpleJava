package chap02.ex05.switchStmt;

import java.util.Scanner;

public class Japangi {

	public static void main(String[] args) {
		//자판기 : 원하는 음료를 입력하면 해당 음료가 나오도록
		System.out.println("음료를 선택 하세요!!");
		//[콜라, 생수, 오렌지 주스, 사이다, 포카리, 커피]
		Scanner scan = new Scanner(System.in);
		String item = scan.nextLine();
		System.out.println("선택 : " + item);
		
		switch (item) {
		case "콜라"://jdk 1.6이상부터 case문에 문자사용가능
			System.out.println("콜라가 나왔습니다.");
			break;
			
		case "생수"://jdk 1.6이상부터 case문에 문자사용가능
			System.out.println("생수가 나왔습니다.");
			break;
			
		case "오렌지 주스"://jdk 1.6이상부터 case문에 문자사용가능
			System.out.println("오렌지 주스가 나왔습니다.");
			break;
			
		case "사이다"://jdk 1.6이상부터 case문에 문자사용가능
			System.out.println("사이다가 나왔습니다.");
			break;
			
		case "포카리"://jdk 1.6이상부터 case문에 문자사용가능
			System.out.println("포카리가 나왔습니다.");
			break;
			
		case "커피"://jdk 1.6이상부터 case문에 문자사용가능
			System.out.println("커피가 나왔습니다.");
			break;
			
		default:
			System.out.println("보유하지 않은 음료입니다.");
			break;
		}
		
	}

}
