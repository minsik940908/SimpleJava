package chap04.ex05.memberCall;

public class Car {
	
	int gear = 0;
	boolean on = false;

	public Car() {
		//혹시 모르니 초기화
		gear =0;
		on = false;
	}
	
	public void start() {
		if(on== false) {
			System.out.println("시동이 걸렸습니다.");
			on = true;
		}else {
			System.out.println("이미 시동이 걸려 있습니다.");
		}
	}

	void change(int gear) {
		System.out.println(gear + " 단으로 기어 변경");
		this.gear = gear;
	}
}
