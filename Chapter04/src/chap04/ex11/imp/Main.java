package chap04.ex11.imp;

//특정 패캐지의 하위 클래스를 모두 import 할 수 있다.
import chap04.ex05.memberCall.*;

public class Main {

	public static void main(String[] args) {
		
		//info 클래스를 객체화 하여 age와 job을 출력하자
		Info info = new Info();
		//Info 는 같은 패키지이므로 import 문이 필요 없다.
		System.out.println(info.age);
		System.out.println(info.job);
		
		Car car = new Car();
		car.start();//다른 패키지에 있는 멤버는 public 이 있어야 호출 가능

	}
	
}
