package chap10.ex10.stop;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {
		
		//stop flag 를 이용한 방법
		StopFlag flag = new StopFlag();
		flag.start();
		Thread.sleep(1000);
		flag.setStop(true);
		
		//interrupt 를 이용한 방법
		Inter inter = new Inter();
		inter.start();
		Thread.sleep(1000);
		//아래를 실행하기 위해서는 sleep이 필수
		inter.interrupt();//강제 예외 발생
		
	}

}
