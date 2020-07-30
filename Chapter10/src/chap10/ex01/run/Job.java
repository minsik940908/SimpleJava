package chap10.ex01.run;

public class Job implements Runnable {

	@Override
	public void run() {//스레드가 해야 할 일을 이 안에 명시 한다.
		
		for(int i=0; i<5;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("워크 스레드가 하는 일");
		}

	}

}
