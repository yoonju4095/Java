class Bank {
		   double getInterestRate() {
		      return 0.0;
		   }
		}

		class BadBank extends Bank {
		   double getInterestRate() {
		      return 10.0;
		   }
		}

		class NormalBank extends Bank {
		   double getInterestRate() {
		      return 5.0;
		   }
		}

		class GoodBank extends Bank {
		   double getInterestRate() {
		      return 3.0;
		   }
		}

		class BestBank extends Bank {
		   double getInterestRate() {
		      return 1.0;
		   }
		}
public class BankTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BadBank b1 = new BadBank();
	      NormalBank b2 = new NormalBank();
	      GoodBank b3 = new GoodBank();
	      BestBank b4 = new BestBank();
	      System.out.println("BadBank�� ������ : " + b1.getInterestRate());
	      System.out.println("NormalBank�� ������ : " + b2.getInterestRate());
	      System.out.println("GoodBank�� ������ : " + b3.getInterestRate());
	      System.out.println("BestBank�� ������ : " + b4.getInterestRate());
	}

}
