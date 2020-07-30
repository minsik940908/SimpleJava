import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		//n까지의 소수
	 
		int input = 0; //n의 입력값 변수
		Scanner scan = new Scanner(System.in);
		System.out.println("n을 입력하세요");
		input = scan.nextInt();
		
		ArrayList<Integer> prime = new ArrayList<Integer>(input);//n까지의 수 입력받는 배열
		for(int i=0; i<input; i++)
		{
			prime.add(i+1);
		}
		
		for(int i=2; Math.pow(i, 2)<input; i++) {
			for(int j = 1; j<prime.size(); j++) {
				if(( prime.get(j) % i ) == 0) {
					if((prime.get(j) / i) == 1 ) {
						continue;
					}else
						prime.remove(j);					
				}
				
			}
		}
		prime.remove(0);
		
		for(int a : prime)
			System.out.println(a);
		

	}

}
