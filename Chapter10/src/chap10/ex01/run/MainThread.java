package chap10.ex01.run;

public class MainThread {

	public static void main(String[] args) {//main thread
		
		//work thread 생성
		//1. work thread가 해야할 일을 생성
		Runnable job = new Job();
		//2. 스레드 추가
		Thread work = new Thread(job);
		//3. 워크스레드를 실행
		work.start();
		
		
		
		
		
		//메인 스레드 실행
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(500);//0.5초 쉬었다 가
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("메인 스레드가 하는일...");
		}
		//할일이 더이상 없으면 소멸

	}

}
