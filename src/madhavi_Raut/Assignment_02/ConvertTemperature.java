/*Assignment 02
 Program 04
 Write a Java program to convert temperature from Fahrenheit to Celsius degree.
	Celsius = (fahrenheit - 32) * 5 / 9
	Create parameterized methods if possible.*/

package madhavi_Raut.Assignment_02;

class ConvertTemperature {

	void convertTemperatureFromFahrenheitToCelsius(double temp) {
		System.out.println("Temperture in celcius is: " + ((temp - 32) * 5 / 9));
	}

	public static void main(String[] args) {
		ConvertTemperature convertTemperature = new ConvertTemperature();
		convertTemperature.convertTemperatureFromFahrenheitToCelsius(98.5);
	}
}
