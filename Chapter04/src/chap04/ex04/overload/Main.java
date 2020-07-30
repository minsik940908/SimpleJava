package chap04.ex04.overload;

public class Main {

	public static void main(String[] args) {
		//overload는 사용자 입장으로 봐야 한다.
		//overload가 없으면 메서드의 인자값의 갯수나 타입만 변해도 새로운 네이밍이 필요해 진다.
		//오버로드는 같은 이름의 함수를 여러개 만들 수 있다.(매개변수의 갯수와 데이터타입은 달라야 한다.)
		//자바는 쓰는 사람 입장에서 쓰기좋게
		
		//모델, 가격, 색상
		NoteBook nb1 = new NoteBook("gram",1500000,"흰색");
		//모델, 색상
		NoteBook nb2 = new NoteBook("gram+","검정");
		//모델, 가격
		NoteBook nb3 = new NoteBook("ion",1600000);
		//가격, 색상
		//NoteBook nb4 = new NoteBook(1700000,"메탈");
		
		nb1.prin();
		nb3.prin();
	}

}
