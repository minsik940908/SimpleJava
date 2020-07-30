package chap06.ex07.couple;

public class Main {

	public static void main(String[] args) {
		//고객이 주문한다.
		
		VingsuConcrete ving = new VingsuConcrete();
		ving.makeVingsu(new RedBeanVingsu());
		System.out.println();
		ving.makeVingsu(new ChocoVingsu());
	}

}
