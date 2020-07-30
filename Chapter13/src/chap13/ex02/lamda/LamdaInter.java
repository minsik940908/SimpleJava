package chap13.ex02.lamda;

@FunctionalInterface //어노테이션 : 컴파일시 참고하는 기능
public interface LamdaInter {//람다식 사용 가능 인터페이스

	//인터페이스에 추상 메서드가 1개 이상이면 람다식 사용불가
	//람다식 사용시 오버라이드 된 메서드 이름을 쓰지 않기 때문에 혼돈이 생김
	
	int operation(int a, int b);
	
	//void sayMsg(String msg);
	
	/*
	 LamdaInter inter  = () -> {
	 
	 }
	 */
	
}
