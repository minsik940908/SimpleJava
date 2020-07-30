package chap06.ex07.couple;

public class RedBeanVingsu implements Vingsu {

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
		System.out.println("추가 첨가 없음");
	}

}
