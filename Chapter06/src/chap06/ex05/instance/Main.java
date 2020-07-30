package chap06.ex05.instance;

public class Main {

	public static void main(String[] args) {
		
		//객체화
		CommonImpl impl = new CommonImpl();
		impl.test1();
		impl.test2();
		
		System.out.println();
		//인터페이스 다형성
		Common com = new CommonImpl();
		com.test1();
		com.test2();
		
		//다중 구현의 경우 담겨지는 인터페이스의 기능만 사용 할 수 있다.

	}

}
