package chap08.ex02.string;

public class Compare {

	public static void main(String[] args) {
		
		//문자열 추가 방법 비교 - 각 객체가 생성된다.
		String str = "문자열을 ";//1
		str += "추가하면 ";//2
		str += "각 객체가 생성 된다.";//3
		System.out.println(str);
		
		//StringBuffer - 객체의 크기만 늘어난다
		StringBuffer buffer = new StringBuffer("문자열을 ");
		buffer.append(" 추가하면");
		buffer.append(" 한 객체의 크기만 늘어난다.");
		System.out.println(buffer);
		
		//StringBuilder
		StringBuilder builder = new StringBuilder("문자열을");
		builder.append(" 추가하면");
		builder.append(" 한 객체의 크기만 늘어난다.");
		System.out.println(builder);
		

	}

}
