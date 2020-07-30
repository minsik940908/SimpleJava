package chap02.ex08.breakEx;

public class BreakStmt {

	public static void main(String[] args) {
		//for문은 0~9까지 반복된다.
		//만약에 3이되면 멈춰야 한다.
		//이 break 문이 어디를 빠져나가는지 아는게 중요하다.
		for(int i=0; i<10;i++) {
			System.out.println(i);
			if(i == 3)
				break;//for문 탈출
		}

	}

}
