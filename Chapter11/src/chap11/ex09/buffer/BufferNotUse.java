package chap11.ex09.buffer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferNotUse {

	public static void main(String[] args) throws IOException {
		
		TimeChecker chk = new TimeChecker();//시간 측정 객체
		
		//1. 읽어오고 내보낼 데이터 위치 지정
		String src = "c:/img/back.jpg";
		String dst = "c:/img/copy_back.jpg";
		
		//2. 스트림 준비
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(dst);
		
		// -- 측정 시작
		chk.timeStart();
		
		//3. 읽어오고 쓰기
		int data;
		while((data = fis.read()) != -1) {
			System.out.println("이미지 복사중..");
			fos.write(data);
		}
		
		// -- 측정 종료 
		System.out.println("버퍼 미사용 : " + chk.timeStop() + " ms");
		
		//4. 비우고 닫기
		fos.flush();
		fis.close();
		fos.close();

	}

}
