package test0611;

public class Ex02 {

	public static void main(String[] args) {
		System.out.println(mul(4));
		System.out.println(방향제());
		eat("치킨");
		시계();
	}
	
	static int mul(int a) {
		return a*a;
	}
	static String 방향제() {
		return "라벤더 향";
	}
	static void eat(String food) {
		System.out.println(food+" 를 먹습니다");
	}
	static void 시계() {
		System.out.println("시간을 보여준다");
	}
	
}
