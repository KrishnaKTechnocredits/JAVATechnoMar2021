package kangan.assignments.assignment2;

public class SimpleInterest {

	void simpleInterest(double principle, int time, double rate) {
		double interest = (principle*time*rate)/100;
		System.out.println("Simple Interest is : " + interest);
	}
	public static void main(String[] args) {
		SimpleInterest simpleInterest = new SimpleInterest();
		simpleInterest.simpleInterest(100.50, 2, 6.5);
	}
}
