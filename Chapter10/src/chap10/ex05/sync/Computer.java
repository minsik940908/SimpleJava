package chap10.ex05.sync;

public class Computer {

	private int score;

	/* 동기화 사용 이전
	 * public void setScore(int score) { 
	 * this.score = score;//컴퓨터에 점수 입력 try {
	 * Thread.sleep(2000);//2초 정도 쉰다.
	 * System.out.println(Thread.currentThread().getName()+ " " + this.score); }
	 * catch (InterruptedException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } }
	 */
	
	//동기화 메소드 사용 - 누가 사용 중이면 메서드 안으로 못들어 온다.
	/*public synchronized void setScore(int score) {
		this.score = score;//컴퓨터에 점수 입력
		try {
			Thread.sleep(2000);//2초 정도 쉰다.
			System.out.println(Thread.currentThread().getName()+ " " + this.score);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	
	//synchronized 블록
	public  void setScore(int score) {
		this.score = score;//여기까지는 누가 쓰고 있어도 접근 가능
		
		synchronized(this) {//여기서 부터 누가 쓰고 있으면 접근 불가
			try {
				Thread.sleep(2000);//2초 정도 쉰다.
				System.out.println(Thread.currentThread().getName()+ " " + this.score);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
