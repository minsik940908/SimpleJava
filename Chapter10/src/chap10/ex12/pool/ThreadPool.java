package chap10.ex12.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {

	public static void main(String[] args) {
		//thread pool 생성 방법
		//스레드가 1개만 생성, 만약 스레드 1개만 있는데 60초동안 놀고 있으면 스레드를 제거
		//처음 생성시 대기 -> 손님이 오면 스케이트 제작 -> 손님이 왔을때 마침 반납받은 스케이트가 있으면 대여
		//반납받았는데 60초 이상 아무도 안빌려가면 버린다.
		ExecutorService pool1 = Executors.newCachedThreadPool();
		
		//thread pool 생성 방법2
		//기본적으로 n개의 스레드를 미리 만들어 놓는다.
		
		int n = Runtime.getRuntime().availableProcessors();//cpu 가용 스레드 확
		System.out.println("CPU 가용 스레드 : " + n);
		ExecutorService pool2 = Executors.newFixedThreadPool(n);
	}

}
