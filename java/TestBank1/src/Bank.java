class Bank1{
	double getInterestRate() {
		return 0.0;
	}
}
class BadBank extends Bank{
	double getInterestRate() {
		return 10.0;
	}
}
class NormalBank extends Bank{
	double getInterestRate() {
		return 5.0;
	}
}
class GoodBank extends Bank{
	double getInterestRate() {
		return 3.0;
	}
}


public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BadBank b1 = new BadBank();
		NormalBank b2 = new NormalBank();
		GoodBank b3 = new GoodBank();
		System.out.println("BadBank의 이자율: " + b1.getInterestRate());
		System.out.println("NormalBank의 이자율: " + b2.getInterestRate());
		System.out.println("GoodBank의 이자율: " + b3.getInterestRate());
	}

}
