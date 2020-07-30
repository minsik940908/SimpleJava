package chap06.ex02.absmethod;

public class Concrete extends Abs {

	//추상화 메서드는 상속 받는 순간 자동으로 생성 된다.
	//필수적으로 들어가야 하는것을 추상메서드로 만들어 놓는 것.
	@Override
	public void must1() {
		

	}
	
	//만약에 오버라이드 하지 않으면 에러 발생
	@Override
	public void must2() {
		

	}

}
