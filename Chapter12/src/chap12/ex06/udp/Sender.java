package chap12.ex06.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class Sender {

	public static void main(String[] args) throws Exception {

		//1. DatagramSocket 생성
		DatagramSocket socket = new DatagramSocket();
		
		for(int i=0; i<3; i++) {
			String msg = "data-" + i;//2. 보낼 메세지 준비
			System.out.println("send data : " + msg);
			
			//3. 메시지를 DatagramPacket 에 담는다.
			DatagramPacket packet = 
					new DatagramPacket(msg.getBytes(), msg.length(), new InetSocketAddress("127.0.0.1", 5001));
			
			//4. DatagramPacket 전송
			socket.send(packet);
		}
		
		//5. 자원 반납
		socket.close();
	}

}
