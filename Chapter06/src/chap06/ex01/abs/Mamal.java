package chap06.ex01.abs;

public abstract class Mamal {//추상 클래스

	String name;
	
	public Mamal(String name) {
		this.name = name;
	}
	
	public void birth() {
		System.out.println(name + "이 아이를 낳는다.");
	}
	
	public void eat() {
		System.out.println(name + "이 젖을 먹인다.");
	}
}
