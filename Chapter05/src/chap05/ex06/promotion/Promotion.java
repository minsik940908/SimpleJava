package chap05.ex06.promotion;

public class Promotion {

	public static void main(String[] args) {
		Vertebrate 척추동물;
		//개, 오리, 닭, 고양이는 모두 척추동물 안에 들어간다.
		척추동물 = new Chicken();
		척추동물 = new Duck();
		척추동물 = new Dog();
		척추동물 = new Cat();
		//개 - 조류(X)
		//Birds birds = new Dog();
		//닭 - 포유류(X)
		//Mamal mamal = new Chicken();
	
	}

}

class Vertebrate{}  //척추동물

class Mamal extends Vertebrate{}//포유류

class Cat extends Mamal{}

class Dog extends Mamal{}


class Birds extends Vertebrate{}//조류

class Duck extends Birds{}

class Chicken extends Birds{}