package chap12.ex08.webserver;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) throws Exception {
		
		// 스레드 풀 가동
		int n = Runtime.getRuntime().availableProcessors();//Cpu에서 가용 할 수 있는 스레드 갯수
		ExecutorService pool = Executors.newFixedThreadPool(n);
		
		//서버소켓 생성
		ServerSocket server = new ServerSocket(8085);
		
		while(true) {
			System.out.println("서버 접속 요청 대기");
			Socket socket = server.accept();
			//스레드가 할일 지정
			Runnable runnable = new Runnable() {
			
				@Override
				public void run() {
					
					try {
						//소켓에서 주 스트림 + 보조 스트림
						DataInputStream dis = new DataInputStream(socket.getInputStream());
						//읽어오기
						byte[] arr = new byte[65536];
						dis.read(arr);
						//문자열 화 해서 찍어보기
						String request = new String(arr);
						System.out.println(request);
						arr = new byte[65536];						
						
						//응답(response) 하기
						PrintStream ps = new PrintStream(socket.getOutputStream());
						//헤더
						ps.print("HTTP/1.1 200 \r\n");
						ps.print("Content-type: text/html \r\n");
						ps.print("\r\n");// 200은 정상을 의미
						//바디
						String msg = "<h3>success receive</h3>";
						byte[] resp = msg.getBytes();
						ps.write(resp, 0, resp.length);
						//자원 반납
						ps.flush();
						ps.close();
						dis.close();
						
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			};
			pool.submit(runnable);//반환값 받을떄 까지 blocking
		}
		

	}

}
