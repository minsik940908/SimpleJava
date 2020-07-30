package javaTest;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		CommonData data = new CommonData();
		
		Producer pro = new Producer(data);
		Consumer con = new Consumer(data);
		//스레드 실행 순서에 따라 넣고 받기의 짝이 안 맞을 수 있다.
		//컨슈머가 먼저 실행 되어 아무것도 없어 1번 실행을 그냥 날릴 수 있기 때문이다.
		pro.start();
		Thread.sleep(10);
		con.start();
		


	}

}
