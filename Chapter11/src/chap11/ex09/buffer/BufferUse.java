package chap11.ex09.buffer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BufferUse {

	public static void main(String[] args) {
		
		TimeChecker chk = new TimeChecker();//시간 측정 객체
		
		//1. 읽어오고 내보낼 데이터 위치 지정
		String src = "c:/img/back.jpg";
		String dst = "c:/img/copy_back.jpg";
		
		try(//try-with-resource
				FileInputStream fis = new FileInputStream(src);
				FileOutputStream fos = new FileOutputStream(dst);
				
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos);) {
			/*
			//2. 스트림 준비
			FileInputStream fis = new FileInputStream(src);
			FileOutputStream fos = new FileOutputStream(dst);
			
			//2-1. 보조스트림 준비
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			*/
			// -- 측정 시작
			chk.timeStart();
			
			//3. 읽어오고 쓰기
			int data;
			byte arr[] = new byte[1024];
			while(bis.read(arr) != -1) {
				System.out.println("이미지 복사중..");
				bos.write(arr);
				arr = new byte[1024];
			}
			
			// -- 측정 종료 
			System.out.println("버퍼 사용 : " + chk.timeStop() + " ms");
			
			//4. 비우고 닫기
			bos.flush();
			fos.flush();
			
			/*try-with-resource 를 사용하면 이게 필요 없다.
			bis.close();
			bos.close();
			fis.close();
			fos.close();
			*/
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
