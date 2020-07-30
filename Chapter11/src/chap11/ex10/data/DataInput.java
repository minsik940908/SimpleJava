package chap11.ex10.data;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInput {

	public static void main(String[] args) {
		
		//1. 읽어올 경로 지정
		String path = "c:/img/temp/object.dat";
		
		//2. 스트림 준비 -> 보조 스트림
		try(
				FileInputStream fis = new FileInputStream(path);
				BufferedInputStream bis = new BufferedInputStream(fis);
				DataInputStream dis = new DataInputStream(bis);
				) {
			//3. 읽어오기 -> 출력(입력한 순서와 데이터 타입을 맞춰서 불러야 한다.)
			String name = dis.readUTF();
			int salary = dis.readInt();
			boolean promotion = dis.readBoolean();
			System.out.println("이름 : " + name + " 급여 : " + salary + " 승진 대상 : " + promotion);
			
		} catch (Exception e) {
			
		}
		//4. 닫기(try-with-resource로 생략)
	}

}
