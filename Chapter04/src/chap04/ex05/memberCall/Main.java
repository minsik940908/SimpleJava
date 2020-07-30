package chap04.ex05.memberCall;

public class Main {

	public static void main(String[] args) {
		
		//Car를 객체화(복사) 한다.
		Car car = new Car();
		
		//현재 기어를 확인 한다.
		System.out.println("현재 기어 : " + car.gear);
		
		//시동 건다.
		car.start();
		car.start();
		
		
		//기어를 변경 한다.
		car.change(3);
		System.out.println("현재 기어 : " + car.gear);
		car.change(5);
		System.out.println("현재 기어 : " + car.gear);
		
		
		

	}

}
