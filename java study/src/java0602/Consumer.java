package java0602;

public class Consumer extends Thread {
	private CommonData data;
	
	public Consumer(CommonData data) {
		this.data = data;
	}

	@Override
	public void run() {
		for(int i = 1; i <= 5; i++)
			data.work();
	}
	
	
}
