package chap06.ex06.heritance;

import chap06.ex03.inter.MouseEvent;
import chap06.ex04.impl.KeyEvent;

public interface Child extends MouseEvent, KeyEvent {
	
	//이 인터페이스를 구현받을 경우 부모들의 추상 메서드 들도 함께 구현 된다.
	
	//여기서 제공할 추상 메소드를 추가
	public void textFiled(String content);
	public void selectOne();
	public void checkOne();
}
