
public class test {
	public static void main(String[] args) {
		
		test t = new test();
		int n = t.sum(4);
		System.out.println(n);
		
		System.out.println(test.sum2(2));
	}
	
	public int sum(int x) {
		return x+1;
	}
	
	public static int sum2(int x) {
		return x+1;
	}
}
