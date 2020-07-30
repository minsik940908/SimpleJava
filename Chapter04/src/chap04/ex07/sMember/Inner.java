package chap04.ex07.sMember;

public class Inner {

	public static void main(String[] args) {
		//message("Hello"); // static 영역에서 heap영역에 접근이 불가
		//1. 메서드에 static를 붙여준다.
		//2. 객체 생성 해서 쓴다.
		
		Inner inner = new Inner();
		inner.message("Hello java");
		Sub sub = new Sub();
		System.out.println(sub.j);
	}
	
	static void message(String msg) {
		Sub sub = new Sub();
		System.out.println(msg);
		System.out.println(sub.j);
	}

}
