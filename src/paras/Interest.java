//3. Write a Java program to compute simple interest   
//	Simple Interest = (P x T x R)/100 
//	Where, 
//		P is the principle amount 
//		T is the time [year] and 
//		R is the rate

/*
Assignment 2 - Program 3 - Program Statement : Write a Java program to compute simple interest.
*/

package paras;

class Interest{
	
	void simpleInterest(float P, float T, float R){
		float Interest = P*T*R/100;
		System.out.println("Simple Interest is " + Interest);
	}
	
	public static void main(String[] args){
		Interest interest = new Interest();
		interest.simpleInterest(1500,5f,2.5f);
	}
}