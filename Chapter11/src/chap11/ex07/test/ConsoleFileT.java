package chap11.ex07.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ConsoleFileT {

	public static void main(String[] args) throws IOException {
		
		//1. 내보낼 파일 위치 설정
		String path = "C:/img/temp/sample.txt";
		File file = new File(path);
		//만약 파일이 없을 경우 생성
		if(!file.exists()) {
			System.out.println("Not Found File");
			file.createNewFile();
		}
		
		//2. 시스템에서 내용을 불러올 Scanner 준비
		Scanner scan = new Scanner(System.in);
		
		//3. 파일로 내보낼 File Writer 준비
		FileWriter fw =new FileWriter(file, true);
		
		//4. 입력 내용을 읽어 온다.
		System.out.println("파일 내용을 입력해 주세요.");
		String ex = scan.nextLine();
		System.out.println("입력 한 내용 : " + ex);
		
		//5. 읽어온 내용을 파일로 내보낸다.
		ex += "\r\n";
		fw.write(ex);
		
		//6. 사용한 자원을 닫는다.
		fw.flush();
		fw.close();
		

	}

}
