package chap11.ex06.chario;

import java.io.FileWriter;
import java.io.IOException;

public class TextOut {

	public static void main(String[] args) throws IOException {
		//1. 파일 저장 위치 지정
		String path = "C:/img/temp/test.txt";
		
		//2. 내보낼 스트림 준비
		FileWriter fw = new FileWriter(path, true);//붙여쓰기 여부
		
		//3. 내보낼 내용 쓰기
		fw.write("for 문 시작  \r\n");
		for(int i=0; i<10; i++) {
			fw.write("for 문 증가\r\n");
		}
		fw.write("for 문 끝 \r\n");
		fw.write("=====================\r\n");
		
		//4. 자원 반납
		fw.flush();
		fw.close();

	}

}
