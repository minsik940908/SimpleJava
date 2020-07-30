package java0602;

public class CommonData {
	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	public synchronized void work() {
		
		System.out.println(Thread.currentThread().getName() + " 스레드가 작업중");
		try {
			if(getData() == null) {
				System.out.println("데이터를 채웁니다.");
				setData("data");
				Thread.sleep(500);
				notify();
				wait();
			}else {
				System.out.println("가져온 데이터 : " + getData());
				setData(null);
				Thread.sleep(500);
				notify();
				wait();
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
