package chap04.ex08.sBlock;

public class Monitor {
	String company;
	String model;
	int price;
	static String color;
	
	static {//static 필드를 초기화 시키고 싶을경우
		//static 초기화는 프로그램 시작과 동시에 일어난다.
		System.out.println("static 필드 초기화");
		color = "black";
	}
	public Monitor(String company, String model, int price) {//생성자
		System.out.println("일반 필드 초기화");
		this.company = company;
		this.model = model;
		this.price = price;
	}


}
