package chap03.ex03.multiArr;

public class TwoD {

	public static void main(String[] args) {
		//4층 4호 royal 아파트 만들기
		String royal[][] = new String[4][4];
		
		for (int i = 0; i < royal.length; i++) {
			for (int j = 0; j < royal[i].length; j++) {
				royal[i][j] = i + "층 " + j + "호";
				System.out.println(royal[i][j]);
			}
		}
		//2층 3호 구디 아파트
		int[][] gudi = {
				{00,01,02,03}, 
				{10,11,12,13}, 
				{20,21,22,23}
		
	};

   }
}
