package chap05.ex05.poly;

//첫째 : public 키워드는 해당 파일을 대표하는 클래스만 가질수 있다.
public class ChildOne extends ParentHouse {

		public void useRoom(){
			System.out.println("첫째가 방 하나를 사용.");
		}
}

//둘째
class ChildTwo extends ParentHouse{
	
	public void useRoom(){
		System.out.println("둘째가 방 하나를 사용.");
	}
}

class ChildThree extends ParentHouse{
	
	public void useRoom(){
		System.out.println("셋째가 방 하나를 사용.");
	}
}

class ChildFour extends ParentHouse{
	
	public void useRoom(){
		System.out.println("넷째가 방 하나를 사용.");
	}
}