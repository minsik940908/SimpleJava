package chap10.ex07.yield;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		/*A,B 실행 -> A에게 양보 하라고 명령 -> B에게 양보 하라고 함*/
		// 실행 할 수 있는 우선권을 주지만 실행을 않하겠다는 뜻이 아니다.
		ThreadA thA = new ThreadA();
		ThreadB thB = new ThreadB();
		
		thA.start();
		thB.start();
		
		thA.yield = true;
		Thread.sleep(500);//0.5ch tnla
		
		thA.yield = false;
		thB.yield = true;
		Thread.sleep(500);//0.5초 쉼
		
		thA.stop = true;
		thB.stop = true;

	}

}
