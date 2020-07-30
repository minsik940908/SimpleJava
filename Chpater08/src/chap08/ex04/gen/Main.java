package chap08.ex04.gen;

public class Main {

	public static void main(String[] args) {
		
		Box<Integer> box = new Box<Integer>();//변수에 어떤 타입의 값이 들어갈지 명시
		box.setValue(123);
		int val = box.getValue();//어떤 타입의 값이 나올지 알 수 있다.
		System.out.println(val);


	}

}
