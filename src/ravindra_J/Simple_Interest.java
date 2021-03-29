/*	Write a Java program to compute simple interest   
	Simple Interest = (P x T x R)/100 
	Where,P is the principle amount , T is the time [year] and R is the rate
 */
package ravindra_J;	
class Simple_Interest{
	void simpleInterest(int num1,int num2,int num3){
		int P = num1;
		int T = num2;
		int R = num3;
		int simpleInterest = (P*T*R)/100;
		System.out.println("Simple Interest of given Principle is - "+simpleInterest);
	}
	public static void main(String []args){
		Simple_Interest simple_interest = new Simple_Interest();
		simple_interest.simpleInterest(3500000,20,7);
		
	}

}