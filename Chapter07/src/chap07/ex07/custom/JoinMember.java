package chap07.ex07.custom;

public class JoinMember {
	
	String[] reserved = {"admin", "tester", "manger"};//예약어 리스트
	
	public void regId(String userId) throws Exception {
		for (String word : reserved) {
			if(word.equals(userId)) {
				//throw new XXXException("message")//해당 예외를 발생 시키는 방법
				//throw new RuntimeException("테스트 런타임 예외 발생");
				//throw new Exception("테스트 예외 발생");//eclipse에서 잡아 줄 수 있음
				throw new ReservedException(userId + "은(는) 예약어 입니다.");
			}
		}
	}
}
