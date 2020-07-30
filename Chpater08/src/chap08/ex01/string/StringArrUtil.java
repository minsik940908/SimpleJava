package chap08.ex01.string;

public class StringArrUtil {

	public static void main(String[] args) {
		
		String string = "abcdefg";
		
		/*문자열이 배열이기 때문에 사용 가능한 기능들*/
		//1. 문자열 길이
		int intResult = string.length();
		System.out.println("문자열 길이 : " + intResult);
		
		//2. 특정 방에 있는 문자 가져오기
		char charResult = string.charAt(3);
		System.out.println("3번 인덱스의 문자 : " + charResult);//int형으로 반환값을 받으면 해당 문자의 아스키코드로 출력된다.
		
		//3. 특정한 부분 잘라내기
		String strResult = string.substring(1, 5);//1번 부터 보여주고 5번 부터 잘라 낸다.
		System.out.println(strResult);
		
		//4. 문자열 -> 배열
		char[] charArr = "abcdefg".toCharArray();
		System.out.print("character array : ");
		System.out.println(charArr);
		
		//5. 배열 -> 문자열
		strResult = new String(charArr);
		System.out.println("result : " + strResult);
		
		//6. 특정 문자열을 기준으로 나누기
		string = "a/b/c/d/e/f/g";
		String[] strArr = string.split("/");
		System.out.println(strArr[1]);
		
		//7. 특정 문자 또는 문자열의 위치를 찾아주는 기능
		string = "abcdabcdabcd";
		int pos = string.indexOf("a");//앞에서 부터 찾아서 반환(1개만) - a가 처음 나오는 위치
		System.out.println("a 의 첫 인덱스 : " + pos);
		pos = string.lastIndexOf("a");//마지막으로 a가 나오는 위치
		System.out.println("a 의 마지막 인덱스 : " + pos);
		System.out.println();
		
		//3개의 a를 다 찾고 싶다. string.indexOf(str, fromIndex) - 못찾으면 -1을 찾는다.
		//int a = string.indexOf("a", 1);
		//System.out.println(a);
		int a = 0;
		System.out.print("a의 위치는 : ");
		while(string.indexOf("a", a) != -1) {
			a = string.indexOf("a", a);
			System.out.print(a+" ");
			a++;
		}
		
		
		
		

	}

}
