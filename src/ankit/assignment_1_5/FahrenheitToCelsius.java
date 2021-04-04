/*4. Write a Java program to convert temperature from Fahrenheit to Celsius degree.
	 Celsius = (fahrenheit - 32) * 5 / 9

Create parameterized methods if possible.
*/
package ankit.assignment_1_5;

class FahrenheitToCelsius{
    int CelciusValue;
	
	void tempConverter(int f){
		CelciusValue  = ((f - 32) * 5 / 9);
		System.out.println("Entered value in Fahrenheit : "+ f);
	}
	
	void displayValues(){   
		System.out.println("Calculated value in Celsius : "+ CelciusValue);
	}
	
	public static void main(String[] args){
		FahrenheitToCelsius fahrenheitToCelsius = new FahrenheitToCelsius();
		fahrenheitToCelsius.tempConverter(45);
		fahrenheitToCelsius.displayValues();
	}
}