package chap05.ex03.superCtr;

public class Main {

	public static void main(String[] args) {
		Child child = new Child("1번 속성", 2 ,"자식필드");
		System.out.println("attr1 : " + child.attr1);
		System.out.println("attr2 : " + child.attr2);
		System.out.println("field : " + child.filed);

	}

}
