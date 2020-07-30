package chap08.ex07.classtype;

public class Main {

	public static void main(String[] args) {
		//emp 에는 Info 클래스 형태의 값이 들어 갑니다.
		Employee<Info> emp = new Employee<Info>();
		
		Info info = new Info();//그래서 인포를 먼저 만들고
		info.setAge(40);//인포 안에 값을 넣고
		info.setEmp_no(123);
		info.setName("김지훈");
		
		emp.setInfo(info); // 그 Info를 emp 안에 넣는다.
		
		//사용시 Info를 먼저 꺼내오고
		Info result = emp.getInfo();
		//꺼내온 Info에서 값을 추출 한다.
		System.out.println(result.getAge());
		System.out.println(result.getEmp_no());
		System.out.println(result.getName());

	}

}
