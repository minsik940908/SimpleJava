package chap07.ex02.overInter;

import chap07.ex02.overInter.Element.EventListener;

public class OnKeyListener implements EventListener {

	@Override
	public void call() {
		System.out.println("키를 눌럿을 경우 일어나는 행동");

	}

}
