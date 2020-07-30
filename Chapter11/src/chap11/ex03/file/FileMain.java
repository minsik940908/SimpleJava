package chap11.ex03.file;

import java.io.File;
import java.io.IOException;

public class FileMain {

	public static void main(String[] args) throws IOException {
		//File 객체 - 파일과 디렉토리에 관련된 모든것을 다룬다.
		File dir = new File("C:/img/temp");//권한 문제로 잘 안될 수 도 있음
		if(!dir.exists()) {//해당 경로가 없다면
			System.out.println("해당 경로의 폴더가 없음, 만들자");
			dir.mkdirs();
		}
		
		//폴더 안에 파일을 생성
		File file = new File("C:/img/temp/test.txt");
		if(!file.exists()) {
			System.out.println("해당 파일이 없음, 만들자");
			file.createNewFile();
		}
		
		//폴더 정보
		File info = new File("C:/img");
		//파일명만 뽑아 보기
		String[] files = info.list();//파일명만 뽑기
		for(String f : files) {
			System.out.println(f);//파일과 폴더 이름을 모두 출력
		}
		
		System.out.println();
		
		//폴더, 파일의 상세 정보
		File[] list = info.listFiles();//파일 객체 뽑아 내기
		String gubun = "[파일] ";
		for(File f : list) {
			if(f.isDirectory()) {
				gubun = "[폴더] ";
			}else {
				gubun = "[파일] ";
			}
			System.out.println(gubun + f.getName()+ " / " + f.length() + " byte");
		}
		
	}

}
