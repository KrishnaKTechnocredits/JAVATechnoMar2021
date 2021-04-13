package sandesh.Assignment_2;

public class SimpleInterest {
	
	void computeSI(int principal, float time, float rate) {
		float simpleInterestCalc = (principal * rate * time)/100;
		System.out.println("Calculated Simple Interest for Principal " + principal + " @ " + rate + " ROI for " + time + " years is " + simpleInterestCalc);
	}
	
	public static void main(String[] args) {
		SimpleInterest si1 = new SimpleInterest();
		int principal = 100;
		float time = 1;
		float rate = 7;
		si1.computeSI(principal, time, rate);		
	}
}
