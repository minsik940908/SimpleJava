package chap02.ex03.three;

public class Score {

	public static void main(String[] args) {
		
		int score = 50;
		//조건 ? 참 : 거짓
		//char grade = score > 90? 'A' : 'B';
		char grade = score >90? 'A' : score > 80? 'B' : 'C';
		System.out.println(grade);
	}

}
