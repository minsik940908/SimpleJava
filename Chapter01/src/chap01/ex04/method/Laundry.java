package chap01.ex04.method;

public class Laundry {

	public static void main(String[] args) {

		String 바구니 = 세탁기("더러운 옷");
		System.out.println(바구니);
	}
	
	public static String 세탁기(String 빨래감) {
		System.out.println(빨래감 + "을 세탁하고");
		System.out.println(빨래감 + "을 탈수한다");
		return "깨끗한 옷";
	}
	

}
