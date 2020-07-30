package chap08.ex01.string;

public class StringUtil {

	public static void main(String[] args) {
		String string = "abcdefg";
		
		/*1. 문자열 비교 */
		boolean boolResult = string.equals("abcdefg");
		System.out.println("두 문자열이 같나 : " + boolResult);
		
		/*2. 문자열 교체 */
		String strResult = string.replace("abc", "ABC");
		System.out.println(strResult);
		
		/*3. 앞뒤 공백 제거*/
		string = " 가나다라 ";
		strResult = string.trim();
		System.out.println(string);
		System.out.println(strResult);
		
		/*4. 특정 문자 포함 여부*/
		boolResult = string.contains("다");
		System.out.println("다 를 포함하고 있나? : " + boolResult);
		
		/*5. 특정 문자로 시작 하는가?*/
		string = "[img]uploadFile.png";
		boolResult = string.startsWith("[img]");
		System.out.println("[img] 로 시작 하나? : " + boolResult);
		
		/*6. 특정 문자로 끝나는가?*/
		boolResult = string.endsWith(".png");
		System.out.println(".png 로 끝나는가? : " + boolResult);
		
		/*7. 일치하지 않는가?*/
		int intResult = string.compareTo("[img]uploadFile.pn");
		System.out.println("일치하지 않는 문자의 숫자 : " + intResult);
		
	}

}
