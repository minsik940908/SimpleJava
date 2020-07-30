package chap10.ex10.stop;

public class StopFlag extends Thread {

	
	private boolean stop = false;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() {
		
		while(!stop) {
			System.out.println("stopFlag 실행중");
		}
		System.out.println("자원 정리");
		System.out.println("종료");
	}

}
