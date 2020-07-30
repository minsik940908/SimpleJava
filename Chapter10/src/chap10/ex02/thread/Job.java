package chap10.ex02.thread;

public class Job extends Thread {

	@Override
	public void run() {
		
		for(int i=0; i<5; i++) {
			System.out.println("work thread");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	
}
