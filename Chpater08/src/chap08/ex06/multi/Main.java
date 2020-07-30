package chap08.ex06.multi;

public class Main {

	public static void main(String[] args) {
		
		Employee<Integer, String, Integer, Integer, Long, Float, Boolean, String> emp 
			= new Employee<Integer, String, Integer, Integer, Long, Float, Boolean, String>();
		
		emp.setAge(40);
		System.out.println(emp.getAge());
		
		
	}

}
