package chap06.ex04.impl;

import chap06.ex03.inter.MouseEvent;

//인터페이스는 다중 구현이 가능하다.
public class Window implements MouseEvent, KeyEvent {

	@Override
	public void KeyDown(int key) {
		
	}

	@Override
	public void KwyUp(int key) {

	}

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

}
