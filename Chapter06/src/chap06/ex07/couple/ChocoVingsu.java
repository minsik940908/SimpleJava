package chap06.ex07.couple;

public class ChocoVingsu implements Vingsu {
	//메서드 중복 생성이 싫으면 추상클래스나 인터페이스의 default 메서드에 선언 하면 된다.
	@Override
	public void iceFlake() {
		System.out.println("얼음을 간다.");
	}

	@Override
	public void milk() {
		System.out.println("우유를 넣는다.");
	}

	@Override
	public void redBean() {
		System.out.println("팥을 넣는다.");
	}

	@Override
	public void jelly() {
		System.out.println("젤리를 넣는다.");
	}

	@Override
	public void etc() {
		System.out.println("초코 시럽 추가");
	}

}
