/*
 * 4. Write a Java program to convert temperature from Fahrenheit to Celsius degree.
	 Celsius = (fahrenheit - 32) * 5 / 9
*/
package ravindra_J.Assignment_no_1_5;	 
class Temperature_Converter{
	void temperatureConverter(int num1){
		int fahrenheit = num1;
		int Celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Temperature in celecius is - " +Celsius);
	}
	public static void main(String [] args){
		Temperature_Converter temperature_converter = new Temperature_Converter();
		temperature_converter.temperatureConverter(99);
	}
}