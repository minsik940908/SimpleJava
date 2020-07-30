package chap08.ex04.gen;

public class Box<T> {//뭐가 들어올지 모르겠지만 넣을때 뭐가 들어올지 지정
	
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	
}
