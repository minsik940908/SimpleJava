package chap04.ex09.readOnly;

public class Person {
	//final 은 반드시 초기화가 필요하다. (도중에 값을 넣거나 바꿀수 없어서)
	final String namtion;
	final String name;
	static final String ssn;
	
	static {
		ssn = "";
	}
	
	public Person(String name, String namtion) {
		
		this.name = name;
		this.namtion = namtion;
	}

}
