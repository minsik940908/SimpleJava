package chap10.ex03.name;

public class WorkThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(getName() + " 스레드가 출력한 내용");
		}
	}

	
}
