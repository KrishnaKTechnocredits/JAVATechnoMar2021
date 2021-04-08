/*Java Assignment 2: 22nd March 2021

3. Write a Java program to compute simple interest
Simple Interest = (P x T x R)/100
Where,
P is the principle amount
T is the time [year] and
R is the rate

 */

package vaibhav.Assignment_2;


class SimpleInterest{
	
	void simInterest (float P, float T , float R){
		float sInt = (P*T*R)/100;

		System.out.println("Principle amount is : " + P);
		System.out.println("Time in year is : " + T);
		System.out.println("Rate is : " + R);
		System.out.println("Simple interest is : " + sInt);
	}

		
	public static void main (String[] args){
		SimpleInterest simpleInterest = new SimpleInterest();
		simpleInterest.simInterest(1500,2,6.5f);
	}
}