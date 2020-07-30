package java0513;

public class Iterationstatements {

	public static void main(String[] args) {
		int i=0;
		int j = 0;
		int z = 0;
		//while 반복문
		while(i < 5) {
			System.out.println("while 문이 " + (i +1) + "번째 반복 실행중입니다.");
			i++;
		}
		System.out.println("while 문이 종료된 후 변수 i의 값은 "+ i + "입니다.");
		
		//do-while 반복문
		do {
			System.out.println("do-while 문이 " + (j +1) + "번째 반복 실행중입니다.");
			j++;
		}while(j<5);
		System.out.println("do-while 문이 종료된 후 변수 j의 값은 " + j + "입니다.");
		
		//for 반복문
		for(z = 0; z < 5; z++) {
			System.out.println("for 문이 "+ (z+1)+"번째 반복 실행중입니다");
		}
		System.out.println("for문이 종료된 후 변수 z의 값은 "+z+"입니다.");
		
		
	}
}
