package trupti;
/*Assignment 2:Write a Java program to compute simple interest   
	Simple Interest = (P x T x R)/100 
	Where, 
		P is the principle amount 
		T is the time [year] and 
		R is the rate*/

class SimpleInterest{

	void interest(int p,int t,double r){
		double sinterest=(p*t*r)/100;
		System.out.println("Simple interest for "+t+" years is "+sinterest);
	}
	public static void main(String[] args){
		SimpleInterest simpleinterest=new SimpleInterest();
		simpleinterest.interest(5000,2,2.5);
	}
}
