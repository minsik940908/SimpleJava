package chap10.ex06.state;

public class WorkThread extends Thread {

	@Override
	public void run() {
		long cnt = 0;
		/*실행 -> 1.5초 -> 실행 -> 종료*/
		for(int i =0; i<100000;i++) {
			cnt++;
		}
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i =0; i<100000;i++) {
			cnt++;
		}
	}

	
}
