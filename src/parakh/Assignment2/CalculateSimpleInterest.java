/*Write a Java program to compute simple interest   
	Simple Interest = (P x T x R)/100 
	Where, 
		P is the principle amount 
		T is the time [year] and 
		R is the rate
*/

package parakh.Assignment2;

public class CalculateSimpleInterest {
	
	void Interest(int principal, int rate, int time) {
		System.out.println(" Simple Interest is: " +(principal*rate*time/100));
	}
	
	public static void main(String args[]) {
		CalculateSimpleInterest simpleinterest = new CalculateSimpleInterest();
		simpleinterest.Interest(1000, 5, 2);
	}
}
