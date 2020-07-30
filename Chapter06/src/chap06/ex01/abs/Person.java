package chap06.ex01.abs;

public class Person extends Mamal {

	public Person(String name) {
		super(name);//부모 생성자 호출
	}
	
	public void userTool() {
		System.out.println(name + "이 도구를 사용한다.");
	}
	
	public void social() {
		System.out.println(name + "이 사회생활을 한다.");
	}
	
	public void talk() {
		System.out.println(name + "이 대화를 한다.");
	}

}
