/*
4. Write a Java program to convert temperature from Fahrenheit to Celsius degree.
	 Celsius = (fahrenheit - 32) * 5 / 9 
*/
package aparna.assignment2;

class FarenheitToCelciusConversion {

	void fahrenheitToCelciusCalculation(float fahrenheit) {
		float Celsius = ((fahrenheit - 32) * 5 / 9);
		System.out.println("Conversion from fahrenheit to Celcius is :-> " + Celsius);

	}

	public static void main(String[] args) {
		FarenheitToCelciusConversion farenheitToCelciusCal1 = new FarenheitToCelciusConversion();
		farenheitToCelciusCal1.fahrenheitToCelciusCalculation(15);

	}
}