package chap02.ex07.whileExam;

public class WhileStmt {

	public static void main(String[] args) {
		// while은 조건이 만족되면 계속 반복한다.
		int i=0;
		while(true) {//무한루프, 감시 프로그램의 경우는 종종 사용 한다.
			i++;
			System.out.println("반복 횟수 : "+i);
			/*
			if(i>=10) {
				break;
			}*/
		}
		//unreachable code : 위 구문대로라면 아래 구문을 실행 할 수 없다는 뜻
		//아래 구문을 지우던지, 위 구문을 변경(무한루프를 빠져 나올 수 있도록)
		/*
		int cup=0;
		while(cup <= 10) {
			cup++;
			System.out.println("떠온 물 : "+cup);
		}*/

	}

}
