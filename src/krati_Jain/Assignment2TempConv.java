//4. *Write a Java program to convert temperature from Fahrenheit to Celsius degree.* Celsius = (fahrenheit - 32) * 5 / 9

package krati_Jain;

class Assignment2TempConv {

	float celsius;
	void convertTemperature(float fahrenheitTemp) {
	celsius = (fahrenheitTemp - 32) * 5 / 9;
	System.out.println("Fahrenheit Temperature " + fahrenheitTemp + " in Celsius is: " + celsius);
	}
	
	public static void main(String[] a) {
	Assignment2TempConv assignment2TempConv = new Assignment2TempConv();
	assignment2TempConv.convertTemperature(102);
	}
		
}
