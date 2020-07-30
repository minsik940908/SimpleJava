package chap05.ex04.tune;

public class Main {

	public static void main(String[] args) {
		MyCar my = new MyCar();
		my.start();
		System.out.println("차의 속력은 : " + my.run());
		my.turbo = true;
		System.out.println("차의 속력은 : " + my.run());
		my.stop();

	}

}
