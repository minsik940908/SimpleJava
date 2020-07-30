package chap01.ex04.method;

public class MethodList {
	
	public static void main(String[] args) {
		String 컵 = 커피포트("찬 물");
		System.out.println("cup : "+컵);
		
		String 봉지 = 붕어빵틀("반죽");
		System.out.println("봉지에 "+봉지+" 을 담는다.");
		
		블랙홀("쓰레기");
		
		String 향기 = 방향제();
		System.out.println("방향제의 향은 "+향기);
		
		시계();
		
	}
	//매개변수O, 반환값O -> 커피포트
	static String 커피포트(String 물) {
		System.out.println("물을 끓인다");
		return "뜨거운 물";
	}
	static String 붕어빵틀(String 반죽) {
		System.out.println("반죽을 틀에 부어 굽는다");
		return "붕어빵";
	}
	//매개변수O, 반환값X -> 블랙홀
	static void 블랙홀(String thing) {
		System.out.println(thing + "가 들어가 뭔가를 한다.");
	}
	//매개변수X, 반환값O -> 방향제
	static String 방향제() {
		return "라벤다 향";
	}
	//매개변수X, 반환값X -> 시계(알람)
	static void 시계() {
		System.out.println("시간을 보여준다.");
	}
}
