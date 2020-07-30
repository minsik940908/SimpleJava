package chap10.ex04.priority;

public class Main {

	public static void main(String[] args) throws InterruptedException {//main 스레드를 시작시켜주는 메소드
		
		for(int i =0; i<5; i++) {
			Thread th = new WorkThread(i + " 번째 스레드");//스레드 생성과 동시에 이름 지정
			/*우선 순위 부여(1~10) : 숫자가 높을수록 우선순위가 높다*/
			//우선 순위가 같으면 빠른놈이 먼저
			//상수로도 우선순위 대체 가능
			//Thread.MAX_PRIORITY//10
			//Thread.NORM_PRIORITY//5
			//Thread.MIN_PRIORITY//1
			th.setPriority(10-i);
			th.start();//작업 시작
			Thread.sleep(100);
			//우선순위 만으로는 스레드 제어가 어렵다.
		}
	}

}
