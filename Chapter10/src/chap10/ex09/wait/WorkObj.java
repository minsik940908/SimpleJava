package chap10.ex09.wait;

public class WorkObj {

	//wait(), notify(), notifyAll() 은 synchronized 안에서만 사용 가능
	public synchronized void work() {
		//누가 실행 되었는지 알림
		System.out.println(Thread.currentThread().getName() + " 이 실행 됨");
		//다른 누군가를 깨움
		notify();
		//대기 - 잔다.
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
