package chap11.ex11.obj;

import java.io.Serializable;

//Serializable 구현이 없으면 (역)직렬화가 불가능 하다.
// 퍼즐조각이 잔뜩 왔는데 완성도가 없음
public class Sample implements Serializable {
	
	int num = 11;
	String team = "edu";
	String job = "manager";
	
	public String method() {
		return "method 부르신 분";
	}
}
