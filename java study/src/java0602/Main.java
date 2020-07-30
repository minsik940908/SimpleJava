package java0602;

public class Main {

	public static void main(String[] args) {
		CommonData data = new CommonData();
		
		Producer pro = new Producer(data);
		Consumer con = new Consumer(data);
		
		pro.start();
		con.start();

	}

}
