//������ �̿��Ͽ� 2���� �ֻ��� ������ ����� �� ��.(�ΰ��� �ֻ����� 10�� �ݺ� ���� �� ���� ���� ����Ͻÿ�)

import java.util.Random;
import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		
		Random s1 = new Random();
		Random s2 = new Random();
		int sum = 0;
		
		System.out.print("�ݺ��� Ƚ��: ");
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		
		for(int i = 0; i < count; i++) {
			int number1 = s1.nextInt(6)+1;
			int number2 = s2.nextInt(6)+1;
			
		sum += number1;
		sum += number2;
		
		}
		System.out.print(count + "�� �ݺ��߽��ϴ�  ���� " + sum + "�Դϴ�.");
	}
	
}
