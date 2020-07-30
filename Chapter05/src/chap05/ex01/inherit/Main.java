package chap05.ex01.inherit;

public class Main {

	public static void main(String[] args) {
		Person p = new Person();
		//본래 자기 기능
		p.useTool();
		p.social();
		p.talk();
		
		//상속 받은 기능
		p.eat();
		p.birth();

	}

}
