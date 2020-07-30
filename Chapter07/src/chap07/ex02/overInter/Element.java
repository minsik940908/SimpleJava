package chap07.ex02.overInter;

public class Element {

	EventListener listener;
	
	void regist(EventListener listener) {
		this.listener = listener;
	}
	
	void trigger() {
		listener.call();
	}
	
	interface EventListener{//내부 인터페이스
		void call();
	}
}
