package chap02.ex01.one;

public class One {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 10;
		
		x++;//증가 나중
		y++;//먼저 증가
		
		System.out.println("x++ : " + x);
		System.out.println("++y : " + y);
		
		x = 1;
		y = 1;
		
		int result = (++x) + 10;//먼저 증가후 연산
		int result2 = (y++) + 10;//연산이 끝난후 증가 -> 무언가 카운팅 할때
		
		System.out.println("result : " + result);
		System.out.println("result2 : " + result2);
		
		boolean xy = true;
		xy = !xy;// true -> false
		System.out.println("xy : " + xy);
		xy = !xy;//true -> false
		System.out.println("xy : " + xy);
	}

}
