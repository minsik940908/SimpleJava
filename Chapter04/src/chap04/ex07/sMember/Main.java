package chap04.ex07.sMember;

public class Main {

	public static void main(String[] args) {
		//클래스는 static영역에 생성되고 객체는 heap영역에 생성된다.
		//static 멤버는 객체화 하지 않고 클래스명을 직접 사용 한다.
		System.out.println(Sub.sFiled);//클래스 원본명으로 써야함 생성된 객체에서도 쓸 수 는 있지만 정상적인 방법은 아니다.
		
		Sub sub = new Sub();
		int mul = sub.multi(10, 5);
		int result = Sub.plus(3, 4);
		
		System.out.println(result);
		System.out.println(Sub.minus(10, 5));
		//System.out.println(Sub.mul(10, 5));
		//multi 메소드는 static이 아니므로 객체생성후 사용한다.
		System.out.println(mul);

	}

}
