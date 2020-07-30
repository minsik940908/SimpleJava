package chap10.ex07.yield;

public class ThreadA extends Thread {

	boolean stop = false;
	boolean yield = false;
	
	@Override
	public void run() {
	
		while(stop == false) {
			System.out.println("thread A 동작");
			if(yield) {
				System.out.println("thread B 에게 양보");
				Thread.yield();
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("thread A 중지");
	}

}
