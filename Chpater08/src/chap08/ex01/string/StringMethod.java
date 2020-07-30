package chap08.ex01.string;

public class StringMethod {

	public static void main(String[] args) {
		/*문자열 만들기*/
		char[] value = {'a','b','c','d','e','f','g'};
		
		String str1 = "abcdefg";
		String str2 = new String("abcdefg");
		String str3 = new String(value);
		
		//str1 == str2 == str3
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		

	}

}
