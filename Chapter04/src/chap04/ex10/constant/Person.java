package chap04.ex10.constant;

public class Person {
	
	//상수의 초기화는 굳이 static 블록을 사용하지 않는다.
	static final String NAME = "김지훈";
	static final String SSN = "80902 - 1511111";
	static final String GENDER;
	
	static {
		GENDER = "남자";
	}
}
