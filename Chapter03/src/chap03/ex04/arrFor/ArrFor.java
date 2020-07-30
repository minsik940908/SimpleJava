package chap03.ex04.arrFor;

public class ArrFor {

	public static void main(String[] args) {
		
		int score[] = {95, 75, 35, 88};
		/*
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}*/
		
		for(int s : score)
			System.out.println(s);
	}

}
