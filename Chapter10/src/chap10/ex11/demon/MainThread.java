package chap10.ex11.demon;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {
		
		Thread demon = new DemonThread();//work thread
		demon.setDaemon(true);//demon thread로 변경
		demon.start();
		Thread.sleep(3000);
		System.out.println("main thread 종료");
		//데몬 스레드의 경우는 메인 스레드가 죽으면 같이 종료 된다.
	}

}
