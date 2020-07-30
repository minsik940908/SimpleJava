package chap02.ex04.ifState;

public class Condition {

	public static void main(String[] args) {
		//if문은 () 안의 결과가 참 이어야 실행이 된다.
		if(true) {
			System.out.println("무조건 실행 되는 if");
		}
		/*
		if(false) {
			System.out.println("무조건 실행되지 않는 if");
		}*/
		
		boolean a = true;
		boolean b = false;
		
		if(a == true) {
			System.out.println("a는 true니까 참");
		}
		if(b == false) {
			System.out.println("b는 false니까 참");
		}
		if(a) {
			System.out.println("a = true");
		}
		if(!b) {
			System.out.println("b = false -> !b = true");
		}

	}

}
