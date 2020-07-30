package chap04.ex04.overload;

public class NoteBook {

	String model;
	int price;
	String color;
	
	public NoteBook(String model, int price, String color) {
		this.model = model;
		this.price = price;
		this.color = color;
		System.out.println(model+price+color);
	}

	public NoteBook(String model, String color) {
		this.model = model;
		this.color = color;
		System.out.println(model+color);
	}

	public NoteBook(String model, int price) {
		this.model = model;
		this.price = price;
		System.out.println(model+price);
	}

	/*public NoteBook(int price, String color) {
		this.price = price;
		this.color = color;
		System.out.println(price+color);
	}*/
	
	public void prin() {
		System.out.println(model+price+color);
	}

	

}
