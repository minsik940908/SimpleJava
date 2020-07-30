package chap12.ex02.tcp;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Cilent {

	public static void main(String[] args) throws IOException {
		
		//1.Socket 생성
		Socket socket = new Socket();
		
		//2. 접속 요청
		try {
			socket.connect(new InetSocketAddress("192.168.0.9", 5001));
			System.out.println("connect success");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			socket.close();//3. 할 일 다 끝났으면 자원 반납
			System.out.println("접속 종료");
		}

	}

}
