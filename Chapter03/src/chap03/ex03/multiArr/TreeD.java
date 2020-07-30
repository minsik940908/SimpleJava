package chap03.ex03.multiArr;

public class TreeD {

	public static void main(String[] args) {
		// 4층 4호짜리 royal 아파트 방이 3개
		String[][][] royal = new String[4][4][3];
		royal[2][3][2] = "철수방";
		royal[0][0][0] = "영희방";
		
		for (int f = 0; f < royal.length; f++) {
			for (int h = 0; h < royal[f].length; h++) {
				for (int r = 0; r < royal[f][h].length; r++) {
					//royal[f][h][r] = f + "층 " + h + "호 " + r + "번 방 입니다.";
					if(royal[f][h][r] == null)
						royal[f][h][r] ="빈 방";
					System.out.println(f + "층 " + h + "호 " + r + "번 " + royal[f][h][r]);
				}
			}
		}

}

}
