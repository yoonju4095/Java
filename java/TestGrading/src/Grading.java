import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		int score;
		
		do {
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�: ");
		score = input.nextInt();
		
		if(score >= 90) {
			if(score >=95)
			System.out.println("���� A+");
			else
			System.out.println("���� A");	
		}
		
		else if(score >= 80) {
			if(score >= 85)
			System.out.println("���� B+");
			else
				System.out.println("���� B");	
		}
		else if(score >= 70) {
			if(score >= 75)
			System.out.println("���� C+");
			else
				System.out.println("���� C");	
		}
		
		else if(score >= 60) {
			if(score >= 65)
			System.out.println("���� D+");
			else
				System.out.println("���� D");	
		}
		else 
			System.out.println("���� F");
		
	}while (score != 0);
}
}



