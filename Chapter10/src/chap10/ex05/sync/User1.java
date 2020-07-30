package chap10.ex05.sync;

public class User1 extends Thread {

	private Computer com;

	public User1(Computer com) {
		this.com = com;
		setName("user 1");//스레드 이름 지정
	}

	@Override
	public void run() {
		com.setScore(500);// user1 이 게임해서 500점 만듦
	}
	
	
}
