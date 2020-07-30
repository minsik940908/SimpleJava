package chap07.ex03.execption;

public class NumberFormat {

	public static void main(String[] args) {
		//NumberForamatException : 숫자형태가 아닌 문자를 숫자로 만들려고 할 경우
		
		String str;
		int val;
		
		//"1234" -> 1234
		str = "1234";
		val = Integer.parseInt(str);
		System.out.println(str);
		
		//"a1b4" -> ??
		str = "a1b4";
		val = Integer.parseInt(str);
	}

}
