package chap11.ex11.obj;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class ObjectOutPut {

	public static void main(String[] args) {

		//1. 저장 파일 경로 지정
		String path = "c:/img/temp/obj.dat";
		
		//2. 스트림 준비 + 보조 스트림 준비
		try(
				FileOutputStream fos = new FileOutputStream(path);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				ObjectOutputStream oos = new ObjectOutputStream(bos);
				) {
			//3. 쓰기
			//map
			Map<String,String> map = new HashMap<String, String>();
			map.put("name", "김지훈");
			map.put("phone", "010-2034-3205");
			oos.writeObject(map);
			
			//array
			oos.writeObject(new int[] {90, 95, 100, 10, 9});
			
			//String
			oos.writeUTF("기본 데이터 형도 받을 수 있다.");
			
			//클래스 객체 형태
			oos.writeObject(new Sample());
			
			//4. 내보내고 닫기 : try-with-resource로 생략
			fos.flush();
			bos.flush();
			oos.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}


		

	}

}
