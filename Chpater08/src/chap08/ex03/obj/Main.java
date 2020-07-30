package chap08.ex03.obj;

public class Main {

	public static void main(String[] args) {

		Box box = new Box();
		box.setValue(123);
		int val = (int)box.getValue();//꺼내온 값이 어떤 형태인지 모르므로 캐스팅 해야 한다.
		System.out.println(val);

	}

}
