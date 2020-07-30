package chap12.ex04.chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		
		//1. Server socket 생성
		try {
			//자신의 IP를 개방할 경우는 이전에 해왔던 bind 과정 생략 가능
			ServerSocket server = new ServerSocket(5001);
			//2. 연결 수락	
			Socket socket = null;// join과 같은 기능
			
			System.out.println("연결 대기중");
			socket = server.accept();
			System.out.println(server.getInetAddress()+" 님이 접속 했습니다.");
			//3. 발신 전용 스레드 생성
			Sender sender = new Sender(socket);
			sender.start();
			//4. 수신 전용 스레드 생성
			Receiver receiver = new Receiver(socket);
			receiver.start();
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
