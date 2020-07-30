package chap10.ex02.thread;

public class AnonyMain {

	public static void main(String[] args) {

		/*work thread*/
		//익명 개체
		Thread work = new Thread() {

			@Override
			public void run() {//interface 를 구현 받을 때는 이놈이 자동이었음
				for(int i=0; i<5; i++) {
					System.out.println("work thread");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		};
		//3. 실행
		work.start();
		
		
		/*main thread*/
		for(int i=0; i<5; i++) {
			System.out.println("main thread");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
