package chap12.ex04.chat;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		
		//1. socket 생성(connect 생략 가능)
		try {
			Socket socket = new Socket("192.168.0.17", 5001);// 내가 접속한 서버의 모든정보가 저장
			System.out.println("접속 완료");
			//3. 발신 전용 스레드 생성
			Sender sender = new Sender(socket);
			sender.start();
			//4. 수신 전용 스레드 생성
			Receiver receiver = new Receiver(socket);
			receiver.start();
		} catch (IOException e) {
			System.out.println("접속 실패");
			e.printStackTrace();
		}
		

	}

}
