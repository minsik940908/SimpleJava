package chap02.ex02.two;

public class Subs {

	public static void main(String[] args) {
		// 대입 연산자
		int result = 0;
		result += 10;
		System.out.println(result);
		result -= 5;
		System.out.println(result);
		result *= 2;
		System.out.println(result);
		result /= 2;
		System.out.println(result);
		result %= 2;
		System.out.println(result);
		
		/*자주 쓰는 예시*/
		//문자열 더하기
		String str = "대입 연산자는";
		str += "합한 값을";
		str += "누적 하는데";
		str += "아주 유용하다";
		System.out.println(str);
		//1+2+3+4+5
		int sub = 0;
		sub += 1;
		sub += 2;
		sub += 3;
		sub += 4;
		sub += 5;
		System.out.println(sub);
		

	}

}
