package chap10.ex13.exec;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecMain {

	public static void main(String[] args) throws InterruptedException {
		
		//1. 스레드 풀 생성
		int n = Runtime.getRuntime().availableProcessors();
		ExecutorService pool = Executors.newFixedThreadPool(n);
		
		//2. 할일 생성(Runnalbe : void)
		Runnable run = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("runnable 처리");
				
			}
		};
		
		//3. 작업 요청
		pool.execute(run);
		
		//4. 스레드 풀 종료
		
		pool.shutdown();//스레드들의 작업이 다 끝날때까지 기다렸다가 종료
		//pool.shutdownNow();//작업이 끝나지 않은 스레드들을 강제 종료
		//boolean result = pool.awaitTermination(10L, TimeUnit.SECONDS);//10초 동안 기다렸다가 스레드 종료 
		
	}

}
