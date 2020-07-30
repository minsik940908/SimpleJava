package chap10.ex09.wait;

public class Main {

	public static void main(String[] args) {
		
		WorkObj obj = new WorkObj();
		
		//만약 스레드가 여러개일 경우 순서와 대상이 무작위다.
		WorkThread thA = new WorkThread(obj);
		WorkThread thB = new WorkThread(obj);
		thA.start();
		thB.start();

	}

}
