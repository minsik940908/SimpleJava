package chap13.ex01.basic;

public class Main {

	public static void main(String[] args) {
		
		//일반적인 익명 객체
		Runnable task1 = new Runnable() {
			@Override
			public void run() {
				for(int i =1; i<=3; i++) {
					System.out.println("익명객체 스레드 실행");
				}
				
			}
		};
		//람다식 익명객체(1.8)
		Runnable task2 = () -> {
			for(int i =1; i<=3; i++) {
				System.out.println("람다식 객체 스레드 실행");
			}
		};

		new Thread(task1).start();
		new Thread(task2).start();
		
	}
}
