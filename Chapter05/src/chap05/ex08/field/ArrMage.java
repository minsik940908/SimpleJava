package chap05.ex08.field;

public class ArrMage {

	public static void main(String[] args) {
		
		//Ice, Fire, Light => Spell
		Spell[] spellArr = new Spell[3];
		spellArr[0] = new Ice();
		spellArr[1] = new Fire();
		spellArr[2] = new Light();
		
		//주문을 하나씩 써 본다.
		for (int i = 0; i < spellArr.length; i++) {
			System.out.println(spellArr[i].casting());
		}
		
		System.out.println();
		
		for(Spell sp : spellArr) {
			System.out.println(sp.casting());
		}

	}

}
