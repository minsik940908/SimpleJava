package chap01.ex03.cast;

public class Ex01 {

	public static void main(String[] args) {
		/**
		 * 특정 메서드의 사용법 기술할 때 사용
		 * */
		//byte < char < int
		//묵시적 형변환 작은놈 -> 큰놈
		byte byteValue = 10;
		char charValue = 'A';
		int intValue = 0;
		
		
		intValue = byteValue;
		intValue = charValue;
		
		System.out.println(byteValue);
		System.out.println("A의 유니코드 : " + intValue);
		
		long longValue  = intValue;
		
		float floatValue = 0.01f;
		double doubleValue = floatValue;
		
		System.out.println(longValue);
		System.out.println(doubleValue);
		
	
	}

}
