/* 3. Write a Java program to compute simple interest   
	Simple Interest = (P x T x R)/100 
	Where, 
		P is the principle amount 
		T is the time [year] and 
		R is the rate  */
		
package amruta.Assignment_2;

class SimpleInterest{

	void simple_interest(int Principle, int Time, double Rate){
		double si = (Principle*Time*Rate)/100;
		System.out.println("Simple Interest is : "+si);
	}
	
	public static void main(String[] arg){
		SimpleInterest s1 = new SimpleInterest();
		s1.simple_interest(5000,5,3.81);
	}
}