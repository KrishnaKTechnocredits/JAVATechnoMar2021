package aashay;
/*
 * Write a Java program to compute simple interest   
	Simple Interest = (P x T x R)/100 
	Where, 
		P is the principle amount 
		T is the time [year] and 
		R is the rate
 */

class SimpleInterest{
	int principle, time;
	float rate;
	
	void interest(int pr, int tm, float rt ){
		float si = (pr * tm * rt)/100;
		System.out.println("Calculated simple interest is:"+si);
	}
	public static void main(String[] args){
		SimpleInterest sit = new SimpleInterest();
		sit.interest(1000,5,7.5f);
		sit.interest(1000,5,7.5f);
	}
}