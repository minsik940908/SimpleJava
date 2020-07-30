package chap05.ex09.refer;

public class Racer {

	//매개변수 다형성을 사용하지 않으면
	//오버로드를 활용 해야 한다.
	
	public void drive(McLaren car) {
		//다형성을 사용하지 않아 자기 고유의 멤버를 사용 할 수 있다.
		car.run();
	}
	
	public void drvice(Ferrari car) {
		car.run();
	}
	
	//매개변수 다형성
	public void drive(Car car) {
		car.run();
	}
}
