package chap12.ex04.chat;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

public class Receiver extends Thread {

	Socket socket = null;
	ObjectInputStream ois = null;
	
	public Receiver(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		
		/*재료 준비*/
		try {
			ois = new ObjectInputStream(socket.getInputStream());
			while(true) {
				String msg = ois.readUTF();//1. 수신내용 읽기
				//2. 출력 
				System.out.println("상대 > " + msg);//2. 출력 
			}
		} catch (IOException e) {
			try {
				ois.close();
				socket.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
			System.out.println("receiver thread 종료");
		}
		
	}
	
	
}
