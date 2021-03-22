import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		int score;
		
		do {
		Scanner input = new Scanner(System.in);
		System.out.print("성적을 입력하시오: ");
		score = input.nextInt();
		
		if(score >= 90) {
			if(score >=95)
			System.out.println("학점 A+");
			else
			System.out.println("학점 A");	
		}
		
		else if(score >= 80) {
			if(score >= 85)
			System.out.println("학점 B+");
			else
				System.out.println("학점 B");	
		}
		else if(score >= 70) {
			if(score >= 75)
			System.out.println("학점 C+");
			else
				System.out.println("학점 C");	
		}
		
		else if(score >= 60) {
			if(score >= 65)
			System.out.println("학점 D+");
			else
				System.out.println("학점 D");	
		}
		else 
			System.out.println("학점 F");
		
	}while (score != 0);
}
}



