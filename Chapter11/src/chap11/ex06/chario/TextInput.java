package chap11.ex06.chario;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextInput {

	public static void main(String[] args) throws IOException {
		
		//1. 읽어올 경로 지정
		String path ="C:/img/temp/news.txt";
		
		//2. 스트림 준비
		FileReader fr = new FileReader(path);
		
		//3. 스트림에서 데이터 읽어오기
		char[] arr = new char[1024];
		
		while(fr.read(arr) != -1) {
			System.out.print(arr);
		}
		
		//4. 자원 반환
		fr.close();
		

	}

}
