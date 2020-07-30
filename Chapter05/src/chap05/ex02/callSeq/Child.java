package chap05.ex02.callSeq;

public class Child extends Parent {

		
	public Child() {//자식 생성자
		//super();(부모 생성자 먼저 호출) //생략 되어 있다.
		System.out.println("자식 생성자 호출");
	}

}
