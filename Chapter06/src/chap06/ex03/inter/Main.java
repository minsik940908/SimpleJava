package chap06.ex03.inter;

public class Main {

	public static void main(String[] args) {
		
		
		//인터페이스는 객체화가 안된다.
		MouseEvent mouse = new Window(); //다형성 활용
		mouse.click(1);
		mouse.dbclick(2);
		mouse.wheel(1);
		MouseEvent.setDpi(100);//static는 클래스명으로 직접 접근 클래스랑 같이 static에 존재하기 때문에
	}

}
