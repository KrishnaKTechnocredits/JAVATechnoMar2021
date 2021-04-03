/*
3. Write a Java program to compute simple interest   
	Simple Interest = (P x T x R)/100 
	Where, 
		P is the principle amount 
		T is the time [year] and 
		R is the rate
*/
package aparna.assignment2;

class SimpleIntrest {

	void simpleIntrestCalculation(double PrincipleAmount, double time, double rate) {
		double simpleIntrestCalc = (PrincipleAmount * time * rate) / 100;
		System.out.println("Simple Intrest of given data is :-> " + simpleIntrestCalc);

	}

	public static void main(String[] args) {
		SimpleIntrest simpleIntrestcalc1 = new SimpleIntrest();
		simpleIntrestcalc1.simpleIntrestCalculation(2000.567, 5.4, 90.5);

	}
}