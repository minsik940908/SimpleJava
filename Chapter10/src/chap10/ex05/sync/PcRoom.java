package chap10.ex05.sync;

public class PcRoom {

	public static void main(String[] args) {
		
		Computer com = new Computer();// 공용 컴퓨터 1대
		
		//두명의 사용자가 나타남
		User1 user1 = new User1(com);
		User2 user2 = new User2(com);
		
		//두명의 유저가 컴을 사용함
		user1.start();//user1 : 500
		user2.start();//user2 : 100

	}

}
