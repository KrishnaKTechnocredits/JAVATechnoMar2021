package rikin.assignment2;

class SimpleInterest{
	
	void interest(int P, int T, int R){
		int ans = (P * T * R)/100;
		System.out.println("Simple interest is " +ans);
	}
	
	public static void main (String [] args){
		SimpleInterest simpleInterest= new SimpleInterest();
		simpleInterest.interest(1000,1,3);
	}
}