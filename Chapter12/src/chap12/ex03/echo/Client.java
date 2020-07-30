package chap12.ex03.echo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws IOException {
		
		//1. socket 생성
		Socket socket = new Socket();
		
		//2. 접속 요청
		socket.connect(new InetSocketAddress("192.168.0.17", 5001));
		
		//3. 데이터 전송 + 4. 돌아온 데이터 수신
		
		OutputStream os = socket.getOutputStream();
		//OutputStreamWriter writer = new OutputStreamWriter(new BufferedOutputStream(os), "UTF-8");
		ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(os));
		
		oos.writeUTF("Hello Server Hello Server Hello Server Hello Server");

		// 자원 반납
		oos.flush();
		os.flush();
		
		InputStream is = socket.getInputStream();
		//InputStreamReader reader = new InputStreamReader(new BufferedInputStream(is));
		ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(is));
		
		String msg = ois.readUTF();
		System.out.println("[내가 보낸 메시지] : " + msg);
		
		// 자원 반납
		oos.close();
		os.close();
		is.close();
		ois.close();
		socket.close();
		

		

	}

}
