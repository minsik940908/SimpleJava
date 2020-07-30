package chap06.ex02.absmethod;

public abstract class Abs {
	public abstract void must1();//추상화 메소드
	
	public abstract void must2();
	
	public void parent() {
		System.out.println("부모 메서드");
	}
}
