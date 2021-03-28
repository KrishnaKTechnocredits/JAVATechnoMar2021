/* 
 * Assignment 2 compute simple interest
 */
package purva;

class InterestRate{
     
	 void simpleint(int p, int t,double r){
		 double interest = (p * t * r)/100;
		 System.out.println("Simple interest is:"+interest);
	 }
	 
	 public static void main(String[] args){
		 InterestRate interestRate = new InterestRate();
		 interestRate.simpleint(20,5,3.4);
	 }
	 
}
		 