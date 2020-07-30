package chap11.ex04.fileinput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileInputMain {

	public static void main(String[] args) throws IOException {
		
		//1. 읽어올 파일경로 지정
		String path = "C:/img/temp/news.txt";
		
		//2. File 객체화 + 3. 파일을 읽어온다.
		FileInputStream fis = new FileInputStream(path);
		
		int data;
		//4. 읽어온 파일 출력(EoF = -1, 파일의 끝)
		/*
		while((data = fis.read()) != -1) {
			System.out.print((char)data);
		}*/
		
		//한글이 깨지므로 문자열 특화 보조 스트림을 사용 한다.
		InputStreamReader reader = new InputStreamReader(fis, "UTF-8");
		while((data = reader.read()) != -1) {
			System.out.print((char)data);
		}
		
		//5. 사용한 자원 반납
		fis.close();

	}

}
