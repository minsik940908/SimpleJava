package chap01.ex03.cast;

public class Ex02 {

	public static void main(String[] args) {
		// 명시적 형변환(eclipse에서 알아서 잡아준다.)
		// 큰놈이 -> 작은놈 안으로 들어갈 경우(크기 확인이 필요)
		// 비슷한놈인데 타입이 다를 경우(타입 확인이 필요)
		//char < int 
		int intValue = 44032;
		char charValue;
		charValue = (char)intValue;
		System.out.println(charValue);
		
		//long -> int
		long longValue = 105;
		int intVal = (int)longValue;
		
		System.out.println(intVal);
		
		//double -> float
		double dValue = 3.145649847;
		float fValue = (float)dValue;
		
		System.out.println(fValue);
	}

}
