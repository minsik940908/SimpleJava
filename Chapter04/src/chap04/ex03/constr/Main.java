package chap04.ex03.constr;

public class Main {

	public static void main(String[] args) {
		//Robot을 복사해서 bot이라는 변수에 담기
		//Robot bot = new Robot();
		//System.out.println("로봇 복사");
		//로봇이 복사 될 때 이름과 목표를 정하기
		//이름 : B123, 목표 : 집안청소
		Robot bot = new Robot();
		Robot bot1 = new Robot("B123");
		Robot bot2 = new Robot("B123", "집안 청소");
	}

}
