package chap06.ex01.abs;

public class Main {

	public static void main(String[] args) {
		//추상화 클래스는 자식 외에는 객체화가 불가능 
		//Mamal mal = new Mamal();
		Person p = new Person("길순");
		//부모 클래스의 메소드
		p.birth();
		p.eat();
		
		//자식 클래스의 메소드
		p.userTool();
		p.social();
		p.talk();
	}

}
