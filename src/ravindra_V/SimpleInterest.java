// Assignment 2_Ravindra_vaidande

package ravindra_V;

class SimpleInterest{
	
	void calculate(int principal, int time, int rate){
		double SI =(principal * time * rate)/ 100;
		System.out.println("Simple Interest is " + SI);
	}

	public static void main(String[] args){
		SimpleInterest simpleInterst = new SimpleInterest();
		simpleInterst.calculate(2000,2,20);
	}
}	
