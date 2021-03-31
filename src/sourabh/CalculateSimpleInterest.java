package sourabh;

class CalculateSimpleInterest{
	void simpleinterest(double P, int T, double R){
		double SI= (P*T*R)/100;
		System.out.println("Simple Interest is " + SI);	
	}
	
	public static void main(String[] args){
		CalculateSimpleInterest calsimpleinterest= new CalculateSimpleInterest();
		calsimpleinterest.simpleinterest(5000.0, 2, 6.7);	
	}
}