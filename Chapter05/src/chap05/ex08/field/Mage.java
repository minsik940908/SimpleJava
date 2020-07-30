package chap05.ex08.field;

public class Mage {

	public static void main(String[] args) {
		
		/*일반적인 객체화 사용 방법*/
		Fire fire = new Fire();
		System.out.println(fire.casting());
		Ice ice = new Ice();
		System.out.println(ice.casting());
		Light light = new Light();
		System.out.println(light.casting());
		
		/*다형성 사용*/
		System.out.println();
		Spell spell;
		spell = new Fire();
		System.out.println(spell.casting());
		spell = new Ice();
		System.out.println(spell.casting());
		spell = new Light();
		System.out.println(spell.casting());
		
		
		
		// TODO Auto-generated method stub

	}

}
