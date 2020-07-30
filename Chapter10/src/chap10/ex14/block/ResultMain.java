package chap10.ex14.block;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultMain {

	public static void main(String[] args) throws Exception {
		
		//1. 스레드 풀 생성
		int size = Runtime.getRuntime().availableProcessors();
		ExecutorService pool = Executors.newFixedThreadPool(size);
		
		//2. 실행 작업 생성(1~100 까지 더하기)
		Callable<Integer> call = new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				int sum = 0;
				for(int i = 1; i<=100;i++) {
					sum +=i;
				}
				return sum;
			}
			
		};
		//3. 실행 요청
		Future<Integer> result = pool.submit(call);//반환값을 받을 때 까지 메인 스레드는 움직이지 못한다.(기다린다) - blocking
		System.out.println("1~100까지의 합은 : " + result.get());
		
		//4. 스레드 풀 종료
		pool.shutdownNow();

	}

}
