package java0602;

public class Producer extends Thread {

	private CommonData data;
	
	public Producer(CommonData data) {
		this.data = data;
	}

	@Override
	public void run() {
		for(int i = 1; i <= 5; i++)
			data.work();
	}
	
	
}
