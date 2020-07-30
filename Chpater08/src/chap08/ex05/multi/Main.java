package chap08.ex05.multi;

public class Main {

	public static void main(String[] args) {
		MultiBox<String, Integer> box = new MultiBox<String, Integer>();//복수개 타입 지정
		box.setKey("홍길동");
		box.setValue(90);
		
		String name = box.getKey();
		int score = box.getValue();
		System.out.println(name + " : " + score);

	}

}
