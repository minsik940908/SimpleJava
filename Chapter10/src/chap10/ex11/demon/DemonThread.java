package chap10.ex11.demon;

public class DemonThread extends Thread {

	@Override
	public void run() {
		
		while(true) {
			try {
				System.out.println("demon thread run!!");
				Thread.sleep(500);
			} catch (InterruptedException e) {
		
				e.printStackTrace();
			}
		}
	}

}
