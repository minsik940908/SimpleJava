package chap10.ex10.stop;

public class Inter extends Thread {

	@Override
	public void run() {
		
		//InterruptedException 발생 시키는 종료법 
		/*try {
			while(true) {
				System.out.println("Inter 실행 중");
				Thread.sleep(1);//sleep interrupted - sleep이 없으면 할 수 없다.
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("자원 정리");
			System.out.println("종료");
		}*/
		
		
		//interrupt 발생시 반복문 탈출
		while(true) {
			System.out.println("Inter 실행 중");
			if(Thread.interrupted()) {//interrupt 당하면 빠져나온다.
				break;
			}
		}
		System.out.println("자원 정리");
		System.out.println("종료");
		
		
	}

}
