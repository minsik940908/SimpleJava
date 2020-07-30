package chap07.ex03.execption;

public class ClassCast {

	public static void main(String[] args) {
		//ClassCastException : 본래 형태가 아닌 것으로 캐스팅 할 때 생기는 문제
		int val = 1234;//정수
		Object value;
		value = val;//묵시적 형변환(promotion)
		val = (int)value;//명시적 형변환(cast)
		
		String str = (String)value;//value는 원래 int 이기 때문에 예외 발생

	}

}
