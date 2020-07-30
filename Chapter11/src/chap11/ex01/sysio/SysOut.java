package chap11.ex01.sysio;

import java.io.IOException;
import java.io.OutputStream;

public class SysOut {

	public static void main(String[] args) throws IOException {
		
		OutputStream os = System.out;//다형성
		/* 문자 다루기
		//97~122 까지 출력
		for(byte b = 97; b <= 122; b++) {
			os.write(b);
		}
		os.write(13);//enter
		os.flush();//스트림에 남아있는 데이터를 탈탈 털어 버린다.
		os.close();//자원을 사용한 후 반납 해야 한다.
		*/
		
		//문자열
		String str = "가나다라마바사아자차카타파하";
		
		os.write(str.getBytes());
		os.flush();//스트림에 남아있는 데이터를 탈탈 털어 버린다.
		os.close();//자원을 사용한 후 반납 해야 한다.(리소스 문제)
	}
	

}
