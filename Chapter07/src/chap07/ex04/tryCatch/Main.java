package chap07.ex04.tryCatch;

public class Main {

	public static void main(String[] args) {
		
		String data1 = "12345";
		String data2 = "asdfg";
		
		
		try {//문제가 생길것 같은 부분
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);//예외 발생 예상 지점
			
		} catch (Exception e) {//문제가 생겼을 경우 처리 방법
			
			System.out.println(e.toString());//예외에 대한 간단한 메시지
			System.out.println("입력된 문자는 숫자 형태로만 구성 되어야 합니다.");
			
		}finally {//최종적으로 무조건(예외 발생 유무에 상관 없이) 실행해야 하는 부분
			
			System.out.println("data1 : " + data1);
			System.out.println("data2 : " + data2);
		}
	}

}
