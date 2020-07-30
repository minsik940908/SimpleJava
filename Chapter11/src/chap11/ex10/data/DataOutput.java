package chap11.ex10.data;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class DataOutput {

	public static void main(String[] args) {
		
		//1. 저장 경로 설정
		String path = "c:/img/temp/object.dat";
			
		try(
				FileOutputStream fos = new FileOutputStream(path, true);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				DataOutputStream dos = new DataOutputStream(bos);) {
			//2. (주)스트림 준비
			//3. 보조스트림(데이터, 버퍼)
			//4. 쓰기
			dos.writeUTF("박민식");
			dos.writeInt(1000);
			dos.writeBoolean(true);
			
			//5. 비우고 닫기(try-with-resource 로 생략)
			dos.flush();
			bos.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
