package chap07.ex05.multi;

public class MutiCatch {

	public static void main(String[] args) {
		//ArrayIndexOutOfBoundsException
		//NumberFormatException
		
		String[] strArr = new String[2];
		
		try {
			
			strArr[0] = "12345";
			strArr[1] = "a12345";
			strArr[2] = "a2s3d4";//ArrayIndexOutOfBoundsException
			
			int val1 = Integer.parseInt(strArr[0]);
			int val2 = Integer.parseInt(strArr[1]);//NumberFormatException
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("배열 인덱스 보다 요청 인덱스가 큽니다.");
			
		} catch (NumberFormatException e) {
			
			System.out.println("배열 인덱스 보다 요청 인덱스가 큽니다.");
			
		} finally {
			
			System.out.println("끝!!");
			
		}
		

	}

}
