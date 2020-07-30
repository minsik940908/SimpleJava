package chap11.ex14.rw;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadMain {

	public static void main(String[] args) throws IOException {
		
		//1. 읽을 파일 경로 지정
		Path path = Paths.get("c:/img/temp/news.txt");
		
		//2. 읽어오기(while 문) -> 출력 : Nio사용
		List<String> contents = Files.readAllLines(path);
		for(String line : contents) {
			System.out.println(line);
		}

	}

}
