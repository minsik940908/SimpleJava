package chap10.ex06.state;

public class Main {

	private static Thread.State state;
	
	public static void main(String[] args) {

		WorkThread work = new WorkThread();
		
		while(true) {
			state = work.getState();
			System.out.println("Thread State : " + state);
			
			if(state == Thread.State.NEW) {//스레드 생성
				work.start();
				
			}
			
			if(state == Thread.State.TERMINATED) {//스레드 종료시
				break;
			}
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
