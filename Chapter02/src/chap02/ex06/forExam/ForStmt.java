package chap02.ex06.forExam;

public class ForStmt {

	public static void main(String[] args) {
		//for(이녀석이;만족한다면;증가 또는 감소)
		//반복 횟수가 정해져 있는 경우
		//물 10잔 떠오기
		/*for(int cup=1; cup <= 10; cup++) {
			System.out.println("물 " +cup+"컵 떠 왔습니다");
		}*/
		
		//2중 for문
		//물 한잔에 커피 2스푼씩 해서 10잔의 커피를 만들어 보자
		for(int cup=1; cup <= 10; cup++) {
			System.out.println("물 " +cup+"컵 떠 왔습니다");
			for(int spoon=1;spoon<=2;spoon++) {
				System.out.println("커피 "+spoon+" 스푼 넣기");
			}
		}

	}

}
