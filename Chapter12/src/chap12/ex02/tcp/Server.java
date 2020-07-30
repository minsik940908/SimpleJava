package chap12.ex02.tcp;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {

		//1. server socket 생성
		ServerSocket server = null;
		
		try {
			server = new ServerSocket();
			
			//2. client 님이 원하는 IP 개방(보통 내 PC IP)
			server.bind(new InetSocketAddress("192.168.0.17", 5001));// 다른 IP 입력하면 안됨
			
			//3. client 요청 대기
			while(true) {
				System.out.println("요청 대기중");
				//클라이언트가 요청 하면?
				Socket socket = server.accept();
				//socket 에는 접속자의 모든 정보가 들어있다.
				InetSocketAddress addr = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("접속 완료 >> " + addr.getAddress()+ " : " + addr.getPort());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
			try {
				//4. 문제가 생기면 소켓 종료(자원 반납)
				server.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
		}

	}

}
