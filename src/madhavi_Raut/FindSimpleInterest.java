/*
 Assignment 2
 Program 03
 Write a Java program to compute simple interest
	Simple Interest = (P x T x R)/100
	Where,
	P is the principle amount
	T is the time [year] and
	R is the rate
 */

package madhavi_Raut;

class FindSimpleInterest {

	void computeSimpleInterest(int principal, int time, int rate) {
		System.out.println("Simple Interest is: " + (principal * time * rate) / 100);
	}

	public static void main(String[] args) {
		FindSimpleInterest findSimpleInterest = new FindSimpleInterest();
		findSimpleInterest.computeSimpleInterest(2500, 5, 2);
	}
}