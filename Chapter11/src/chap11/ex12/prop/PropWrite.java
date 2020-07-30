package chap11.ex12.prop;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropWrite {

	public static void main(String[] args) throws IOException {

		//1. properties 객체 생성 - Map interface에 속한다.
		Properties prop = new Properties(); // 속성값 둘 다 String 이어야 한다
		
		//2. properties에 원하는 값을 담는다.(key, value) 
		prop.put("id", "admin");
		prop.put("pass", "1234");
		prop.put("name", "Park min-sik");
		prop.put("phone", "01012341234");
		
		//3. properties 객체를 파일로 내보내기(파일 위치는 일반적으로 프로젝트 안에 위치)
		String path = "src/chap11/ex12/prop/profile.properties";
		
		// 스트림 준비
		FileOutputStream fos = new FileOutputStream(path);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		// 저장
		prop.store(bos, "simple comment");
		System.out.println("저장 완료");
		
		//4. 내보내기 + 자원 닫기
		fos.flush();
		bos.flush();
		bos.close();
		fos.close();
	}

}
