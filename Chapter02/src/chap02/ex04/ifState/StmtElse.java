package chap02.ex04.ifState;

public class StmtElse {

	public static void main(String[] args) {
		// 만야에 두부가 없으면 순두부를 산다.
		System.out.println("가게에 간다.");
		int tofuBox = 0;
		if(tofuBox > 0) {
			System.out.println("두부를 구매한다.");
		}else {
			System.out.println("순두부를 구매한다.");
		}
		System.out.println("집에 온다.");
	}

}
