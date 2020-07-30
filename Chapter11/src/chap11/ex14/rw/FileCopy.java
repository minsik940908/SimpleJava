package chap11.ex14.rw;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopy {

	public static void main(String[] args) throws IOException {
		
		//1. 읽고 내보낼 파일 저장 경로
		Path from = Paths.get("c:/img/back.jpg");//복사할 파일 경로
		Path to = Paths.get("c:/img/temp/copy_back.jpg");//복사 파일 저장 경로
		
		//2. 읽고 쓰기 + 3. 읽어온 내용 내보내기	
		Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
		System.out.println("복사 완료");
		/*
		 REPLACE_EXISTING : 이미 있는 파일이면 덮어쓴다.(이 옵션이 없으면 exception 발생)
		 COPY_ATTRIBUTES : 권한, 읽기전용 등 파일의 속성 까지도 복사
		 */


	}

}
