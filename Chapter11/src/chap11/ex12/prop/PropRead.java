package chap11.ex12.prop;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;

public class PropRead {

	public static void main(String[] args) throws IOException {
		
		//1. properties 객체 생성
		Properties prop = new Properties();
		
		//2. 읽어올 경로 지정
		String path = "src/chap11/ex12/prop/read.properties";
		
		//3. 스트림 준비
		FileInputStream fis = new FileInputStream(path);
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		//4. 불러오기
		prop.load(bis);
		/*
 		System.err.println(prop);

		System.out.println(prop.getProperty("id"));
		System.out.println(prop.getProperty("pass"));
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("team"));
		System.out.println(prop.getProperty("job"));
		*/
		
		for(Object key : prop.keySet()) {
			System.out.println(key + " = " + prop.get(key));
		}
		//5. 자원 반납
		bis.close();
		fis.close();

	}

}
