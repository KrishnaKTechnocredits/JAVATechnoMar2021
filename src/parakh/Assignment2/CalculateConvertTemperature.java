/*Write a Java program to convert temperature from Fahrenheit to Celsius degree.
	 Celsius = (fahrenheit - 32) * 5 / 9

Create parameterized methods if possible.
*/

package parakh.Assignment2;

public class CalculateConvertTemperature {
	
	void convertTemperatureFromFahrenheitToCelsius(double temp) {
		System.out.println(" Temperature in Celcius Degree is: " + ((temp - 32) * 5 / 9));
	}
	
	public static void main(String args[]) {
		CalculateConvertTemperature convertTemperature = new CalculateConvertTemperature();
		convertTemperature.convertTemperatureFromFahrenheitToCelsius(98.5);
	}
}
