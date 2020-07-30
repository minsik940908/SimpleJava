package chap10.ex08.join;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("1 ~ 100 까지의 합은?");
		OperThread oper = new OperThread();
		oper.start();//계산 시작
		oper.join();//oper 가 다 끝날때 까지 기다린다.(이게 없으면 계산중에 답을 달라고 한다.)
		System.out.println("답 : " + oper.getSum());

	}

}
