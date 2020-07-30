package chap06.ex06.heritance;

public class ChildImpl implements Child {//Child만 구현했는데 부모것의 메소드 들도 함께 구현

	//MouseEvent 추상 메소드 구현
	@Override
	public void click(int button) {

	}

	@Override
	public void dbclick(int button) {

	}

	@Override
	public Double[] move() {
		return null;
	}

	//KeyEvent 추상 메소드 구현
	@Override
	public void KeyDown(int key) {

	}

	@Override
	public void KwyUp(int key) {

	}

	//Child 추상 메소드 구현
	@Override
	public void textFiled(String content) {

	}

	@Override
	public void selectOne() {

	}

	@Override
	public void checkOne() {

	}

}
