package chap03.ex02.arrValue;

public class OutPut {

	public static void main(String[] args) {
		
		int[] score = new int[10];
		
		for (int i = 0; i < score.length; i++) {
			score[i] = (i+1)*10;
		}
		
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
	}

}
