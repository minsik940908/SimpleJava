package chap10.ex02.thread;

public class MainThread {

	public static void main(String[] args) {
		
		/*work thread*/
		//1. 해야할 일 생성 + 2. 스레드 생성
		//사용하기 편리 하지만 인터페이스 보다 안정성이 낮다.(run 메서드를 강제하기 않아서)
		Thread work = new Job();//Job이 Thread를 상속하고 있기 때문에(데이터 타입이 Thread)
		//3. 실행
		work.start();
		
		
		/*main thread*/
		for(int i=0; i<5; i++) {
			System.out.println("main thread");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
