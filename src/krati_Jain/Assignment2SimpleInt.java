//Write a Java program to compute simple interest

package krati_Jain;

class Assignment2SimpleInt {
	int simpleInterest;
	
	void interestcal (int principle, int rate, int time) {
	simpleInterest = (principle * rate * time) / 100;
	System.out.println("Simple Interest is: " + simpleInterest);
	}

	public static void main(String[] a) {
	Assignment2SimpleInt assignment2SimpleInt = new Assignment2SimpleInt();
	assignment2SimpleInt.interestcal(25000, 7, 12);
	}
	
}
