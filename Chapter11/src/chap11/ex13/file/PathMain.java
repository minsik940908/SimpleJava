package chap11.ex13.file;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathMain {

	//Path 는 NIO의 경로 특화 class
	public static void main(String[] args) {
		
		Path path = Paths.get("c:/img/temp/copy.png");
		System.out.println("특정 경로의 파일 이름 : " + path.getFileName());
		System.out.println("부모 폴더 : " + path.getParent().getFileName());
		System.out.println("루트 : " + path.getRoot());

		System.out.println("경로의 단계 수 : " + path.getNameCount());
		for(int i =0; i <path.getNameCount(); i++) {
			System.out.println(i + " : " + path.getName(i));
		}
	}

}
