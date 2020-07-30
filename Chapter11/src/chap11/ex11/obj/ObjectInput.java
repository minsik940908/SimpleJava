package chap11.ex11.obj;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;

public class ObjectInput {

	public static void main(String[] args) {
		
		//1. 읽어올 파일 경로
		String path = "c:/img/temp/obj.dat";
		
		//2. 주 스트림, 보조 스트림 선언
		try(
				FileInputStream fis = new FileInputStream(path);
				BufferedInputStream bis = new BufferedInputStream(fis);                                                                                            
				ObjectInputStream ois = new ObjectInputStream(bis);
				) {
			//3. 파일 내용 읽어오기
			Map<String, String> map = (Map<String, String>) ois.readObject();
			int[] score = (int[])ois.readObject();
			String msg = ois.readUTF();
			Sample sample = (Sample) ois.readObject();
			
			//확인
			System.out.println(map);
			System.out.println(score[0] + " "+score[1]+" "+score[2]+ " " + score[3] + " "+score[4]);
			System.out.println(msg);
			System.out.println(sample.job);
			System.out.println(sample.num);
			System.out.println(sample.team);
			System.out.println(sample.method());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//4. 자원 반납 : try-with-resource 사용

	}

}
