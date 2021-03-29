package ashtha;

class SimpleInterest {

	void SI (int P, int T, double R){
		double interest = (P*T*R)/100;
		System.out.println("The simple interest is "+interest);
	}
	
	public static void main (String[] a) {
		SimpleInterest simpleInterest = new SimpleInterest();
		simpleInterest.SI(1075,11,3.4);
	}
}
		