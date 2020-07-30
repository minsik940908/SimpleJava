package chap10.ex01.run;

public class AnonyMain {

	public static void main(String[] args) {
		
		//work thread 생성
		
		//익명 객체를 스레드에 추가
		Thread work = new Thread(new Runnable() {	
			@Override
			public void run() {
				for(int i=0; i<5;i++) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("워크 스레드가 하는 일");
				}
				
			}
		});
		//워크스레드를 실행
		work.start();
		
		
		
		
		
		//메인 스레드 실행
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(500);//0.5초 쉬었다 가
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("메인 스레드가 하는일...");
		}
		//할일이 더이상 없으면 소멸

	}

}
