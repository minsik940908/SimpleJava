package chap12.ex07.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Sender {

	public static void main(String[] args) throws Exception {
		
		//1. 불러올 파일 위치 지정
		String path = "c:/img/back.jpg";
		File file = new File(path);
		//2. 소켓에서 스트림 준비(주+보조)
		Socket socket = new Socket("192.168.0.9", 5001);
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		OutputStream os = socket.getOutputStream();
		BufferedOutputStream bos = new BufferedOutputStream(os);
		DataOutputStream dos = new DataOutputStream(bos);
		
		//3. 파일명 전송
		String[] arr = path.split("/");
		dos.writeUTF(arr[arr.length-1]); 
		dos.flush();
		
		//4. 컴퓨터에서 파일을 읽어오기
		byte[] arr1 = new byte[1024];
		while(bis.read(arr1) != -1) {
			dos.write(arr1);//5. 읽어온 파일 전송
			arr1 = new byte[1024];
		}
		System.out.println("파일 전송 완료 : " + (file.length() / 1024) + "KB");
		
		//6. 자원 반납
		dos.flush();
		bis.close();
		fis.close();
		dos.close();
		bos.close();
		socket.close();

	}

}
