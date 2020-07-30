package chap06.ex03.inter;

public class Window implements MouseEvent {

	@Override
	public void click(int button) {
		System.out.println(button +" 번 버튼 클릭");

	}

	@Override
	public void dbclick(int button) {
		System.out.println(button +" 번 버튼 더블 클릭");

	}

	@Override
	public Double[] move() {
		
		return null;
	}

}
