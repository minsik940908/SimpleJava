package chap12.ex03.echo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {

	public static void main(String[] args) throws IOException {
		
		ServerSocket server = null;
		//1. server socket 생성
		try {
			server = new ServerSocket();
			//2. client 가 들어올 IP 개방
			server.bind(new InetSocketAddress("192.168.0.17", 5001));//2. client 가 들어올 IP 개방
			
			while(true) {//3. client 요청 대기
				System.out.println("요청 대기 중...");
				Socket socket = server.accept();
				InetSocketAddress addr = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println(">> " + addr.getAddress()+" : "+ addr.getPort());
				
				//-- 요청이 있으면 처리(데이터 받기, 데이터 보내기)
				// 스트림 준비(주 + 부)
				InputStream is = socket.getInputStream();
				//InputStreamReader reader = new InputStreamReader(new BufferedInputStream(is));
				ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(is));
				
				// 스트림 읽기
				//파일을 읽는 것이 아니므로 while 문을 쓸 수가 없다.
				String msg = ois.readUTF();
				
				System.out.println("[클라이언트 메시지] : " + msg);
				
				OutputStream os = socket.getOutputStream();
				OutputStreamWriter writer= new OutputStreamWriter(new BufferedOutputStream(os), "UTF-8");
				
				
				
				// 내보내기
				writer.write(msg);
				writer.flush();
				os.flush();
				
				//4. 할 일 다 했으면 비우고 종료
				writer.flush();
				
				ois.close();
				writer.close();
				is.close();
				os.close();
				socket.close();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
			server.close();
			System.out.println("서버 종료");
		}

	}

}
