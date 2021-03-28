/*
 * Assignment 2_4
 * Write a Java program to convert temperature from Fahrenheit to Celsius degree.
 */
package neha_Rathi;

class Temperature {
	float celsiusValue;

	void converter(float fahrenheitValue) {
		celsiusValue = (fahrenheitValue - 32) * 5 / 9;
	}

	void display() {
		System.out.println("Converted temperature from Fahrenheit to Celsius degree & value is : " + celsiusValue);
	}

	public static void main(String[] args) {
		Temperature temperature = new Temperature();
		temperature.converter(99.9f);
		temperature.display();
	}
}