//난수를 이용하여 2개의 주사위 게임을 만들어 볼 것.(두개의 주사위를 10번 반복 했을 때 누적 합을 출력하시오)

import java.util.Random;
import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		
		Random s1 = new Random();
		Random s2 = new Random();
		int sum = 0;
		
		System.out.print("반복할 횟수: ");
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		
		for(int i = 0; i < count; i++) {
			int number1 = s1.nextInt(6)+1;
			int number2 = s2.nextInt(6)+1;
			
		sum += number1;
		sum += number2;
		
		}
		System.out.print(count + "번 반복했습니다  합은 " + sum + "입니다.");
	}
	
}
