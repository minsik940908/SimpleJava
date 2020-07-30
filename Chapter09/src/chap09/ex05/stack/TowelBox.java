package chap09.ex05.stack;

import java.util.Stack;

public class TowelBox {

	public static void main(String[] args) {
		
		Stack<Towl> box = new Stack<Towl>();
		//넣을때 push
		box.push(new Towl("red"));
		box.push(new Towl("orange"));
		box.push(new Towl("yellow"));
		box.push(new Towl("green"));
		box.push(new Towl("blue"));
		box.push(new Towl("navy"));
		
		//수건을 뺄 때(pop, peek)
		//pop - 꺼내서 쓴다.(삭제)
		//peek - 확인하고 다시 넣는다.(읽기)
		
		//수건 하나씩 전부 꺼내는 법
		while(!box.isEmpty()) {
			//메서드 체이닝은 반환된 객체를 이용하여 그 객체의 메서드를 사용 하는 방법
			/*
			 Towl towel = box.pop();
			 towel.getColor();
			 => box.pop().getColor();
			 */
			System.out.println(box.pop().getColor() + " 색 수건 꺼냄");//메서드 체이닝
			System.out.println("상자에 남은 수건 : " + box.size());
			//System.out.println(box.peek().getColor()); 평생 한장의 수건만 확인(무한루프)
		}

	}

}
