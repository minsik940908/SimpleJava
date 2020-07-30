package chap04.ex02.classIns;

public class Main {

	public static void main(String[] args) {
		//Student 복사 하기
		//Student 클래스를 복사해서 Student 타입의 변수인 std에 담는다.
		Student std = new Student();
		Student std2 = new Student();
		//복사본들은 일련번호(클래스의 해쉬값)가 다르기 때문에 같다고 볼 수 없다.
		System.out.println(std);
		System.out.println(std2);
	}

}
