package chap02.ex04.ifState;

import java.util.Scanner;

public class Japangi {

	public static void main(String[] args) {
		//아이템 & 돈
		System.out.println("음료수를 선택하세요.");
		Scanner scan = new Scanner(System.in);
		String item = scan.nextLine();
		System.out.println("돈을 넣어 주세요.");
		Scanner scan1 = new Scanner(System.in);
		int money = scan.nextInt();
		System.out.println(item + " / " + money);
		
		//[콜라:1000, 생수:500, 오렌지주스:1500, 사이다:1000, 포카리:1000, 커피:2000]
		if(item.equals("콜라") && money>=1000) {
			System.out.println("콜라가 나왔습니다");
		}else if(item.equals("생수") && money>=500) {
			System.out.println("생수가 나왔습니다");
		}else if(item.equals("오렌지 주스") && money>=1500) {
			System.out.println("오렌지 주스가 나왔습니다");
		}else if(item.equals("사이다") && money>=1000) {
			System.out.println("사이다가 나왔습니다");
		}else if(item.equals("포카리") && money>=1000) {
			System.out.println("포카리가 나왔습니다");
		}else if(item.equals("커피") && money>=2000) {
			System.out.println("커피가 나왔습니다");
		}else {
			System.out.println("상품 또는 금액을 확인해 주세요.");
		}

	}

}
