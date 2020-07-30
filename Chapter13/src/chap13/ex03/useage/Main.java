package chap13.ex03.useage;

public class Main {

	public static void main(String[] args) {
		//정석적인 방법
		OperationA lamda = (int a, int b) -> {
			System.out.println(a+b);
		};
		lamda.plus(3, 4);
		
		//매개변수 타입생략 가능
		OperationA lamdaA = (a, b) -> {
			System.out.println(a+b);
		};
		lamdaA.plus(3, 4);
		
		//매개변수가 하나만 있다면 괄호도 생략 가능 - 매개변수가 한개일 경우 
		OperationB lamdaB = a -> {
			System.out.println(a*a);
		};
		lamdaB.squar(4);
		
		//매개변수가 없을 경우
		OperationC lamdaC = () -> {
			System.out.println("매개 변수 없이 작동");
		};
		lamdaC.process();
		
		//실행 내용 없이 반환만 할 경우
		OperationD lamdaD = msg -> msg;
		System.out.println(lamdaD.echo("받은걸 돌려 준다."));
	}

	
	
	
	interface OperationA{
		void plus(int a, int b);
	}
	interface OperationB{
		void squar(int a);
	}
	interface OperationC{
		void process();
	}
	interface OperationD{
		String echo(String msg);
	}
}
