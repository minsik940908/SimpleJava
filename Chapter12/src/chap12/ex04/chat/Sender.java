package chap12.ex04.chat;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Sender extends Thread {

	Socket socket = null;
	ObjectOutputStream oos = null;//수신부와 발신부가 모두 java 여야 한다.
	
	public Sender(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		
		try {
			Scanner scan = new Scanner(System.in);
			oos = new ObjectOutputStream(socket.getOutputStream());
			
			while(true) {
				String msg = scan.nextLine();//1. 입력 값을 받는다.
				System.out.println("당신 : " + msg);
				oos.writeUTF(msg);//2. outputstream 으로 내보낸다.
				oos.flush();//3. flush 내보낸다.
			}
		} catch (IOException e) {
			e.printStackTrace();
			try {
				oos.close();
				socket.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			System.out.println("sender thread 종료");
		}
	}

}
