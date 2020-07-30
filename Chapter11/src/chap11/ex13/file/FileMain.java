package chap11.ex13.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileMain {

	//Java NIO 에서 파일 정보 확인과 다루기가 가능
	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("c:/img/temp/test.txt");
		//파일 정보 확인
		System.out.println("디렉토리 여부 : " + Files.isDirectory(path));
		System.out.println("파일 여부 : " + Files.isRegularFile(path));
		System.out.println("마지막 수정시간 : " + Files.getLastModifiedTime(path));
		System.out.println("파일 크기 : " + Files.size(path));
		System.out.println("소유자 : "+ Files.getOwner(path));
		System.out.println("숨김파일 여부 : " + Files.isHidden(path));
		System.out.println("읽기 가능 여부 : " + Files.isReadable(path));
		System.out.println("쓰기 가능 여부 : " + Files.isWritable(path));
		
		//파일 다루기(생성)
		Path dir = Paths.get("c:/img/test");
		
		//!Files.exists(dir) == Files.notExists(dir)
		if(Files.notExists(dir)) {
			System.out.println("폴더 없음");
			Files.createDirectories(dir);
		}
		
		Path file = Paths.get("c:/img/test/newFile.txt");
		if(Files.notExists(file)) {
			System.out.println("파일 없음");
			Files.createFile(file);
		}
		
	}

}
