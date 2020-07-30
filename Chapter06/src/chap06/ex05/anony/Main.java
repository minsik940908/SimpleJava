package chap06.ex05.anony;

import chap06.ex05.instance.Common;

public class Main {

	public static void main(String[] args) {
		//Common 이라는 인터페이스를 구현받을 경우 우리는 클래스를 따로 만들어야 했다.
		//익명 객체를 이용 하면 즉석에서 만들고 프로그램이 끝남과 동시에 삭제 할 수 있다.
		
		//본래는 Common 인터페이스를 구현 하는 클래스가 별도로 필요하다.
		Common common = new Common() {
			//익명 객체를 이용하면 별도의 클래스를 만들 필요가 없어진다.
			//대신 외부에서 절대로 부를 수 없다.
			@Override
			public void test2() {
				System.out.println("test 2");
			}
			
			@Override
			public void test1() {
				System.out.println("test 1");
			}
		};
		
		common.test1();
		common.test2();
	}

}
