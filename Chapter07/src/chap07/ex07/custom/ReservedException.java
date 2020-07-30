package chap07.ex07.custom;

public class ReservedException extends RuntimeException {

	
	private static final long serialVersionUID = 1L;
	
	public ReservedException(String msg) {//생성자
		////throw new RuntimeException("테스트 런타임 예외 발생");
		super(msg);
	}

}
