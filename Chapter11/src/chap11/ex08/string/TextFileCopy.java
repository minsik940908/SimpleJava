package chap11.ex08.string;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TextFileCopy {

	public static void main(String[] args) throws IOException {
		
		//1. 읽어올 경로, 저장경로 지정
		String src = "c:/img/temp/news.txt";
		String dst = "c:/img/temp/news2.txt";
		
		//2. 스트림 준비(인풋, 아웃풋)
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(dst);
		
		//3. 보조스트림 준비(주스트림이 보조스트림에 탑승)
		InputStreamReader reader = new InputStreamReader(fis, "UTF-8");
		OutputStreamWriter writer = new OutputStreamWriter(fos, "UTF-8");
		
		//4. 읽어와서 쓰기
		char[] arr = new char[1024];
		int data;
		while((data = reader.read(arr)) != -1) {//몇자가 들어 왔는지 반환
			System.out.println(data);
			writer.write(arr);
			arr = new char[1024];
		}
		
		//5. 비우고 닫기
		reader.close();
		fis.close();
		writer.flush();
		writer.close();
		fos.close();
		
	}

}
