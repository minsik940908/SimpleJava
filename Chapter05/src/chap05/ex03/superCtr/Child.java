package chap05.ex03.superCtr;

public class Child extends Parent {

	String filed;
	
	public Child(String attr1, int attr2, String filed) {//자식 생성자
		super(attr1, attr2);//부모 클래스 객체화
		this.filed = filed;//자식의 멤버는 super 아래에 있어야 한다.
	}

}
