package chap03.ex02.arrValue;

public class Input {

	public static void main(String[] args) {
		int[] scores = new int[10];
		System.out.println(scores.length);//방 크기 확인
		
		//0번방 100
		scores[0] = 100;
		//1번방 50
		scores[1] = 50;
		//2번방 70
		scores[2] = 70;
		
		for (int i = 3; i < scores.length; i++) {
			scores[i] = 100;
		}
		

	}

}
