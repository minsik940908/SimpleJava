package chap12.ex07.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Receiver {

	public static void main(String[] args) throws Exception {
		
		//1. 서버소켓
		ServerSocket server = new ServerSocket(5001);
		
		while(true) {
			System.out.println("파일 수신 대기 중...");
			//2. 서버는 연결 요청에 대해서 수락
			Socket socket = server.accept();
			System.out.println("연결 요청 수락");
			//3. 파일 저장 위치 지정
			String path = "c:/download/";
			File dir = new File(path);
			if(!dir.exists()) {
				System.out.println("폴더 생성");
				dir.mkdirs();
			}
			
			//4. 소켓 -> 인풋 스트림
			BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
			DataInputStream dis = new DataInputStream(bis);
			String fileName = dis.readUTF();
			//5. 스트림 준비(주 + 보조)
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path+fileName));
			//6. 읽어온 파일 쓰기
			
			int data = 0;
			while((data = dis.read()) != -1) {
				bos.write(data);
				
			}
			
			/*
			byte[] arr = new byte[1024];
			while(dis.read(arr) != -1) {
				bos.write(arr);
				arr = new byte[1024];
			}
			*/
			
			System.out.println(fileName+ " 파일 전송 완료");
			//7. 자원 반납
			bos.flush();
			bis.close();
			dis.close();
			bos.close();
			socket.close();
		}
		
	

	}

}
