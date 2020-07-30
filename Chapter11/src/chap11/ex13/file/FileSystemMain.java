package chap11.ex13.file;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;

public class FileSystemMain {

	public static void main(String[] args) throws IOException {
		
		//FileSystem 은 FileSystems 의 추상 클래스 이다.
		FileSystem fs = FileSystems.getDefault();
		Iterable<FileStore> infoList = fs.getFileStores();
		
		for(FileStore info : infoList) {
			System.out.println("드라이브 이름 : " + info.name());
			System.out.println("파일시스템 타입 : " + info.type());//NTFS /FAT 
			System.out.println("전체공간 : " + (info.getTotalSpace()/(1024*1024*1024)) + "GB");// 하드에 직접 접근해서 정보추출 해오기 떄문에 IOException
			System.out.println("사용 가능 공간 : " + (info.getUsableSpace()/(1024*1024*1024)) + "GB");
			System.out.println("=================================================");
		}

	}

}
