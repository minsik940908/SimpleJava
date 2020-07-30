package chap10.ex13.exec;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SubmitMain {

	public static void main(String[] args) throws Exception {
		
		//1. 스레드풀 생성
		int n = Runtime.getRuntime().availableProcessors();//cpu 가용 스레드만큼
		ExecutorService pool = Executors.newFixedThreadPool(n);//스레드 풀 생성
		
		//2. callable 로 할일 생성 : 반환값이 있음
		Callable<String> callable = new Callable<String>() {

			@Override
			public String call() throws Exception {//스레드 풀에서 스레드를 빌려서 할 일
				System.out.println("callable 처리 중");
				return "완료";
			}
		};
		
		//3. 작업 실행 : 반환값이 있음
		Future<String> result =  pool.submit(callable);
		//반환값 확인
		System.out.println(result.get());

	}

}
