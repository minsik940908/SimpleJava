package chap10.ex05.sync;

public class User2 extends Thread {

	private Computer com;
	
	public User2(Computer com) {
		this.com = com;
		setName("user 2");
	}

	@Override
	public void run() {
		com.setScore(100);// user2 이 게임해서 100점 만듦
	}
	
	


}
