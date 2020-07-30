package chap05.ex07.cast;

public class Cast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mamal mal = new Dog();
		
		mal.brith();//고치긴 했지만.. 부모 거
		mal.eat();//부모 거
		//mal.bark();//자식집에 있는것
		
		Dog dog = (Dog)mal;//자식집으로 가서
		dog.bark();//사용 한다.
		
		// 상속받는 객체가 너무 많을 경우 원래 형태가 어떤 것인지 헷갈릴 수 있다.
		//instanceof 를 사용하면 내가 생각한 객체가 맞는지 확인 할 수 있다.
		mal = new Cat();
		if(mal instanceof Cat) {
			Cat cat = (Cat)mal;
			cat.mew();
		}else {
			System.out.println("이 객체는 고양이가 아닙니다.");
		}
		
	}

}
