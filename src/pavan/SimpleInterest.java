/*
 Write a Java program to compute simple interest   
	Simple Interest = (P x T x R)/100 
	Where, 
		P is the principle amount 
		T is the time [year] and 
		R is the rate
 */

package pavan;

class SimpleInterest{
	
	void interest (double amount, int year, float rate){
		double intr=((amount*year*rate)/100);
		System.out.println("Simple Interest is "+ intr);
	}	
	public static void main(String[]args){
		SimpleInterest simpleinterest= new SimpleInterest();
		simpleinterest.interest(100,5,4);
	}
}