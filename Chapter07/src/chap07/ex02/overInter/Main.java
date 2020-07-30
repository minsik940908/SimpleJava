package chap07.ex02.overInter;

public class Main {

	public static void main(String[] args) {

		Element button = new Element();//예) 버튼
		button.regist(new OnClickListener());//버튼에 클릭시 일어날 이벤트 등록
		button.trigger();//이벤트 촉발
		
		System.out.println();
		
		button.regist(new OnKeyListener());
		button.trigger();
		/*
		Element input = new Element();
		input.regist(new OnKeyListener());
		input.trigger();
		*/

	}

}
