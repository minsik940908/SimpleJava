package chap05.ex09.refer;

public class Main {

	public static void main(String[] args) {
		//레이서를 부른다.
		Racer racer = new Racer();
		//차 가져온다.
		Car car = new Maserati();
		//레이서에게 차키를 준다.
		racer.drive(car);
		
		//매개 변수에 바로 객체화도 가능
		racer.drive(new Ferrari());
		racer.drive(new McLaren());

	}

}
