package chap02.ex09.continueEx;

public class ContinueStmt {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10000; i++) {
			if(!(i%3==0))
				continue;
			System.out.println(i);
		}
	}

}
