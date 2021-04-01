package adwait;

class SimpleInterest {
	void interest (int p, int t, int r){
		int simpleInterest = (p*t*r) / 100;
		System.out.println("Simple Interest is: "+simpleInterest);
	}
	
	public static void main (String [] args){
		SimpleInterest simpleinterest = new SimpleInterest();
		simpleinterest.interest(1000,2,5);
	}
}