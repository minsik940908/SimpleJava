package chap01.ex02.scope;

public class VarScope {

	static String myBasket = "우리집에서 가져온 바구니";//클래스안 어느 메서드에서도 사용 가능
	public static void main(String[] args) {
		int number = 123;//메서드 안에서 선언 되었기 때문에 다른 메서드에서 사용 불가
		System.out.println(myBasket);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("i : " +i);
			System.out.println("number" +number);
		}

	}
	public static void lmart() {
		//System.out.println(number);//main메서드에서 만들어진 변수라서 사용불가
		System.out.println(myBasket);
	}

}
