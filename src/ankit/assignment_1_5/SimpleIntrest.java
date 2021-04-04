/*3. Write a Java program to compute simple interest   
	Simple Interest = (P x T x R)/100 
	Where, 
		P is the principle amount 
		T is the time [year] and 
		R is the rate
       */
	   
package ankit.assignment_1_5;	   
class SimpleIntrest{
    int simpleIntrest;
	
	void simpleIntrestCalculate(int p, int r, int t){
		simpleIntrest  = ((p*r*t)/100);
		System.out.println("Principle value is "+ p);
		System.out.println("Rate value is "+ r);
		System.out.println("Time value is "+ t);
	}
	
	void displayValues(){
	    
		System.out.println("Simple Intrest value is "+ simpleIntrest);
	}
	public static void main(String[] args){
		SimpleIntrest simpleIntrest = new SimpleIntrest();
		simpleIntrest.simpleIntrestCalculate(1000,5,5);
		simpleIntrest.displayValues();
	}
}