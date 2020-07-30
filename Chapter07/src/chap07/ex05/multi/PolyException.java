package chap07.ex05.multi;

public class PolyException {

	public static void main(String[] args) {

		//부모 형태로 다 들어 간다. -> 다형성
		String[] strArr = new String[2];
		
		try {
			
			strArr[0] = "12345";
			strArr[1] = "a12345";
			strArr[2] = "a2s3d4";//ArrayIndexOutOfBoundsException
			
			int val1 = Integer.parseInt(strArr[0]);
			int val2 = Integer.parseInt(strArr[1]);//NumberFormatException
			
		} catch (Exception e) {
			
			System.out.println("예외 발생 : " + e.toString());
			e.printStackTrace();//예외에 대한 상세 정보(개발시에만 사용)
			
		} 
			finally {
			
			System.out.println("끝!!");
			
		}

	}

}
