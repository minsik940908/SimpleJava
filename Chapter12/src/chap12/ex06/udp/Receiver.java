package chap12.ex06.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Receiver {

	public static void main(String[] args) throws Exception {
		
		//1. DatagramSocket 생성
		DatagramSocket socket = new DatagramSocket(5001);
		
		Thread th = new Thread() {

			@Override
			public void run() {
				while(true) {
					//2. DatagramPacket 생성(수신 용도)
					//본래 통신시 수신부와 송신부가 서로 규격을 정함
					DatagramPacket packet = new DatagramPacket(new byte[100], 100);
					
					//3. 데이터 수신
					try {
						socket.receive(packet);
						String data = new String(packet.getData(), "UTF-8").trim();//4. 수신받은 데이터 출력
						System.out.println(data);
					} catch (IOException e) {
						e.printStackTrace();
						System.out.println("예외 발생으로 스레드 종료");
						break;
					}
				}
			}
			
		};
		th.setDaemon(true);//데몬 스레드 생성으로 메인 종료시 함께 스레드가 정지 된다.
		th.start();
		Thread.sleep(3000);
		//5. 자원 반납
		socket.close();

	}

}
