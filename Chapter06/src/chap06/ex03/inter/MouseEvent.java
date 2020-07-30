package chap06.ex03.inter;

public interface MouseEvent {

	//인터페이스 에서는 기본적으로 추상 메서드를 사용
	public void click(int button);
	
	public void dbclick(int button);
	
	public Double[] move();
	
	
	
	//일반 메서드 - JAVA 1.8 부터 가능
	public default void wheel(int i) {
		if(i == 1) {
			System.out.println("윗 방향으로 스크롤");
		}else {
			System.out.println("아랫방향으로 스크롤");
		}
	}
	
	//static 메서드 - JAVA 1.8 부터 가능
	public static void setDpi(int dpi) {
		System.out.println("감도조절 : " + dpi);
	}
}
