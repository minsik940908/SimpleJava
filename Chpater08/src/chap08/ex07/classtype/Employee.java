package chap08.ex07.classtype;

public class Employee<T> {
	
	private T info;

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}
	
}
