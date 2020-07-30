package chap11.ex05.fileoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputMain {

	public static void main(String[] args) throws IOException {
		
		//1. 읽어올 파일과 내보낼 파일 위치 지정
		String src = "C:/img/camera.jpg";
		String dst = "C:/img/temp/copy3.jpg";
		
		//2. 읽어오고 내보낼 스트림 준비 + 3. 스트림 읽어오기
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(dst);
		
		//4. 읽어온 스트림 내보내기
		int data;
		int i = 0;
		/* //성능 향상 전
		while((data = fis.read()) != -1) {
			fos.write(data);
			System.out.println("파일 복사 중 : " + i);
			i++;
		}*/
		
		byte[] arr = new byte[1024];//물을 옮길때 숟가락을 쓰냐 물컵을 쓰냐 차이
		
		while(fis.read(arr) != -1) {
			fos.write(arr);
			System.out.println("파일 복사중 : " + i);
			i++;
		}
		
		//5. 사용한 자원 닫아주기
		fis.close();
		fos.flush();
		fos.close();

	}

}
