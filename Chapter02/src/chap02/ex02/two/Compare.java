package chap02.ex02.two;

public class Compare {

	public static void main(String[] args) {
		//비교연산
		//같다(==), 같지않다(!=)
		int v1 = 1;
		double v2 = 2.0;
		int v3 = 4;
		String v4 = "JAVA";
		String v5 = new String("JAVA");
		
		System.out.println(v1 == v2);//v1과 v2가 같은가?
		System.out.println(v1 != v2);//v1과 v2가 같지 않은가?
		//v1이 v3 보다 작은가?(미만)
		System.out.println(v1 < v3);
		//v4와 v5가 같은가?
		System.out.println(v4 == v5);
		//문자열을 비교 할때는 equals를 사용 하자
		System.out.println(v4.equals(v5));
		System.out.println();
		
		//AND(&&)와 OR(||)
		int val =6;
		
		if(val>1 && val<7) {
			System.out.println("val은 1보다 크고 7보다 작다.");
		}
		
		if(val%2==0 || val%3==0) {
			System.out.println("val은 2 또는 3의 배수이다.");
		}
		
		
		

	}

}
