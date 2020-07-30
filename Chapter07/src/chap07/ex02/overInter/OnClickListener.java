package chap07.ex02.overInter;

import chap07.ex02.overInter.Element.EventListener;

public class OnClickListener implements EventListener {

	@Override
	public void call() {
		System.out.println("클릭 했을 경우 일어나는 행동");
	}

}
