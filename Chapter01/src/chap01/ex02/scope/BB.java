package chap01.ex02.scope;

public class BB {

	static String myBasket = "a";
	public static void main(String[] args) {
		int number = 123;
		System.out.println(myBasket);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("i : " +i);
			System.out.println("number" +number);
		}

	}
	public static void lmart() {
		
		System.out.println(myBasket);
	}

}
