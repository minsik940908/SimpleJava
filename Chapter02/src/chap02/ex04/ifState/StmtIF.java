package chap02.ex04.ifState;

public class StmtIF {

	public static void main(String[] args) {
		// 만약에 두부가 있으면 사와야 하는 경우
		System.out.println("가게에 간다.");
		int tofuBox = 1;
		if(tofuBox > 0) {
			System.out.println("두부를 구매한다.");
		}
		System.out.println("집에 온다.");
	}

}
