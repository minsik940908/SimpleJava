package chap04.ex08.sBlock;

public class Main {

	public static void main(String[] args) {
		String name = null; // 초기화(값을 변수 선언시 넣어 놓는 행위)
		System.out.println(name);
		
		Monitor mo = new Monitor("LG","curved", 1000000 );
		System.out.println(Monitor.color);
	}

}
