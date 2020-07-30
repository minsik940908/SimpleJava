package chap05.ex04.tune;

public class MyCar extends ParentCar{
	
	
	//부모메서드 기능을 이용한 경우
	boolean turbo = true;
	@Override
	public int run() {
		if(turbo) {
			return 200;
		}else {
			return super.run();
		}
		
	}
	/*
	@Override
	public int run() {//부모 메서드의 기능을 완전히 버리고 다시 만듬(오버라이드)
		// TODO Auto-generated method stub
		return 200;
	}
	*/
	
	
	

	
}
