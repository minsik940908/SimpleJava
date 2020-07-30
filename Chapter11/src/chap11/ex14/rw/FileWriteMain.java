package chap11.ex14.rw;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class FileWriteMain {

	public static void main(String[] args) throws Exception {
		
		//1. 내보낼 파일 위치 설정
		Path path = Paths.get("C:/img/temp/sample.txt");
		
		//2. 시스템에서 내용을 불러올 Scanner 준비
		System.out.println("내용을 입력 하세요");
		Scanner scan = new Scanner(System.in);
		
		//3. Scanner로 읽어온 내용을 변수에 저장
		String data = scan.nextLine();
		data += "\r\n";
		
		//4. 파일로 내보낸다.(채널 사용)
		Files.write(path, data.getBytes("UTF-8"), StandardOpenOption.APPEND);
		/* Files 에 대한 옵션
		 APPEND : 파일 쓰기시 이어서 쓴다.
		 WRITE : 파일을 쓰겠다.
		 CREATE : (파일이 존재 하지 않으면 )새 파일을 생성
		 CREATE_NEW : (이미 파일이 존재 할 경우)새 파일 생성
		 READ : 파일을 읽겠다.
		 */
		

	}

}
