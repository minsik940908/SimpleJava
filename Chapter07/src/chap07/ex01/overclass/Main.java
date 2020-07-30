package chap07.ex01.overclass;

public class Main {

	public static void main(String[] args) {
		//1. 인스턴스 멤버 클래스
		Exclass ex = new Exclass();//외부 클래스 객체화
		//ex는 이미 객체화 되었기 때문에 앞에 new 가 붙을 수 없다.
		Exclass.InsClass ins = ex.new InsClass();//객체화 된 클래스 내부의 클래스 객체화
		ins.field = 3;
		ins.method();
		System.out.println();
		
		//2. 정적 클래스(객체화 하면 staitc 멤버를 사용할 수 없고, 객체화 하지 않으면 인스턴스 멤버를 사용 할 수 없다.
		//정적 멤버 사용
		Exclass.StaticClass.stField = 32;
		Exclass.StaticClass.stMethod();
		System.out.println();
		//인스턴스 멤버 사용
		Exclass.StaticClass stIns = new Exclass.StaticClass();//Exclass와 staticclass 둘다 static영역에 있기 때문에 직접 객체화
		stIns.field = 10;
		stIns.method();
		System.out.println();
		
		//3.로컬 클래스
		ex.localMehod();
	}

}
