//Write a Java program to compute simple interest   
//	Simple Interest = (P x T x R)/100 
//	Where, 
//		P is the principle amount 
//		T is the time [year] and 
//		R is the rate
package anubhav;

class SimpleInterest{
	void Interest (int P, int R, int T){
		int si= (P*R*T/100);
		System.out.println("Effective Simple Interest is " + si);
	}
	
	public static void main (String[] args){
		SimpleInterest simpleInterest= new SimpleInterest();
		simpleInterest.Interest(10000,5,10);
	}
}