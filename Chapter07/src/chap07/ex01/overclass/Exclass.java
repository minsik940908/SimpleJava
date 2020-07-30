package chap07.ex01.overclass;

public class Exclass {
	
	public Exclass(){//생성자
		System.out.println("외부 클래스 객체 생성");
	}

	/*1.인스턴스 멤버 클래스 - 전형적인 내부 클래스 - 가끔식 볼일이 있다*/ 
	public class InsClass {
		public InsClass() {//생성자
			System.out.println("멤버 클래스 객체 생성");
		}
		int field;
		void method() {
			System.out.println(field + " 을 출력하는 method 실행");
		}
	}// static 멤버를 사용 할 수 없다.(내부 클래스 자체가 static 영역에 저장되어 있지 않아서)
	
	
	/*2.정적(static) 멤버 클래스 - 외부 클래스가 객체화 하면 사용 못함 - 잘 안쓰임*/
	public static class StaticClass{//static 클래스는 객체화가 가능하지만 객체화 하면 static 멤버들은 못쓴다.
		public StaticClass() {
			System.out.println("static class 객체화");
		}
		int field;//필드
		void method() {//메서드
			System.out.println(field + " 을 출력하는 method 실행");
		}
		
		static int stField;
		static void stMethod() {
			System.out.println(stField + " 을 출력하는 static method 실행");
		}
	}
	
	/*3.로컬 인스턴스 클래스 - 메소드 안에서만 사용 가능 - 잘 안쓰임*/
	void localMehod() {
		class Locla {
			Locla(){
				System.out.println("Locla 객체화");
			}
			int field;
			void method() {
				System.out.println(field + " 을 출력하는 local method 실행");
			}
		}
		Locla lo = new Locla();
		lo.field = 5;
		lo.method();
	}
	
}

