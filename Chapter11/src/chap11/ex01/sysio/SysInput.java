package chap11.ex01.sysio;

import java.io.IOException;
import java.io.InputStream;

public class SysInput {

	public static void main(String[] args) {
		
		System.out.println("아무거나 입력 하세요");
		InputStream is = System.in;//키보드로 부터 입력 받음
		
		try {
			int ascii_code = is.read();
			System.out.println(ascii_code);
			char inChar = (char) ascii_code;
			System.out.println(inChar);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
