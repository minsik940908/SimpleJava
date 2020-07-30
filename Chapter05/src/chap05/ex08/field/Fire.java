package chap05.ex08.field;

public class Fire extends Spell {

	@Override
	public String casting() {
		
		return "불 마법" + super.casting();
	}

}
