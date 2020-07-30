package chap01.ex01.define;

public class Variable {

	public static void main(String[] args) {
		//변수 생성시 용도(크기)를 정해 놓는다.
		//타입 이름;
		//남의 코드 함부로 지우지 말고 주석처리
		boolean varBool = true;//논리
		
		String varString = "문자열";//문자열
		char varChar = 'A';//문자
		
		int varInt = 0;;//정수(7자리 미만 일반 숫자)
		long varLong = 10000000;//주로 백만이상
		
		float varFolat = 0.01f;//소수
		double varBouble = 0.00001;//소숫점 5자리 이상
		
		System.out.println(varBool);
		System.out.println(varString);
		System.out.println(varInt);
		System.out.println(varLong);
		System.out.println(varFolat);
		System.out.println(varBouble);
		System.out.println(varChar);
	}

}
