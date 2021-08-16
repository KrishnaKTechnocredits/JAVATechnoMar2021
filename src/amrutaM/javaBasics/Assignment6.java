package amrutaM.javaBasics;

/*Assignment - 6 .: 7th Aug-2021 .
Create two parameterized methods in same class. 

Write a method to compute simple interest   
	Simple Interest = (P x T x R)/100 
	Where, 
		P is the principle amount 
		T is the time [year] and 
		R is the rate

 Write a method to convert temperature from Fahrenheit to Celsius degree.
	 Celsius = (fahrenheit - 32) * 5 / 9
*/
public class Assignment6 {

	void simpleInterest(int principal, int year, double rate) {
		double simpleInterest = 0.0;
		simpleInterest = (principal * year * rate) / 100;
		System.out.println("Simple interest is -> "+simpleInterest);
	}

	void convertTemperature(double tempInFahrenheit) {
		double celsius = 0.0;
		celsius = (tempInFahrenheit - 32) * 5 / 9;
		System.out.println(tempInFahrenheit + " degree Fahrenheit is equal to " + celsius + " degree celsius");
	}

	public static void main(String[] args) {
		Assignment6 assignment6 = new Assignment6();
		assignment6.simpleInterest(2000, 2, 7.5);
		assignment6.convertTemperature(105);

	}
}
