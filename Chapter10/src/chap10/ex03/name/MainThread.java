package chap10.ex03.name;

public class MainThread {
	
	public static void main(String[] args) {
		
		Thread th1 = new WorkThread();
		th1.start();//thread-0
		
		
		
		Thread th2 = new WorkThread();
		th2.start();//thread-1
		
		
		
		Thread th3 = new WorkThread();
		th3.setName("막내 스레드");
		th3.start();//thread-2
		
		
	}

}
