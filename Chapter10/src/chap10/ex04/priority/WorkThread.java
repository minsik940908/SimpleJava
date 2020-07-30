package chap10.ex04.priority;

public class WorkThread extends Thread {

	public WorkThread(String name) {
		setName(name);//스레드 이름 지정
	}

	@Override
	public void run() {
		
		System.out.println(getName()+" 작업 시작");
		for(int i=0; i<100000; i++) {
			/*이 동안 작업 한다고 가정*/
		}
		System.out.println(getName()+" 작업 끝");
	}

}
