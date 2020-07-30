package chap07.ex06.turn;

public class Sub {
	
	void method1() throws NumberFormatException{//main()에 넘긴다.
		method2();
	}
	
	private void method2() throws NumberFormatException{//method1()에 넘긴다.
		Integer.parseInt("asdf");
	}

}
