package chap05.ex05.poly;

public class Main {

	public static void main(String[] args) {
		// 첫째 부터 넷째 까지 userRoom을 사용해 보자
		ChildOne cdo = new ChildOne();
		cdo.useRoom();

		ChildTwo cdt = new ChildTwo();
		cdt.useRoom();
		
		ChildThree cdth = new ChildThree();
		cdth.useRoom();
		
		ChildFour cdf = new ChildFour();
		cdf.useRoom();
		
		/*
		 4개가 아니라 40~50개 정도라면?
		 변수선언만 오래걸릴 것이다.
		 코드도 계속 수정 되어야 한다.
		 그래서 우리는 다형성을 활용한다.
		 변수를 동시에 쓰는경우는 각각 선언하는것이 좋다.
		 */
		
		System.out.println();
		ParentHouse house;
		
		house = new ChildOne();
		house.useRoom();
		house = new ChildTwo();
		house.useRoom();
		house = new ChildThree();
		house.useRoom();
		house = new ChildFour();
		house.useRoom();
		//변수를 번갈아 쓰면서 쓸때 좋다.
		
		
	}

}
