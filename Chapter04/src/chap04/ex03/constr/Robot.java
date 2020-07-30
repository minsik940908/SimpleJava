package chap04.ex03.constr;

public class Robot {
	
	public String name;
	public String goal;
	
	//오버로드는 같은 이름의 함수를 여러개 만들 수 있다.(매개변수의 갯수와 데이터타입은 달라야 한다.)
	//자바는 쓰는 사람 입장에서 쓰기좋게
	public Robot() {
		// TODO Auto-generated constructor stub
	}
	
	public Robot(String string) {
		// TODO Auto-generated constructor stub
	}
	
	//생성자는 복사하면서 해야 할 일을 넣는다.
	public Robot(String name, String goal) {//기본 생성자(객체 생성시 제일 먼저 실행)
		System.out.println("로봇 생성");
		System.out.println("이름 : "+name+"목표 : "+goal);
		//생성자로 받은 값을 클래스 전체에서 쓰고 싶을때 
		this.name = name;//this는 현재 클래스를 의미한다.
		this.goal = goal;
	}



}
