/*
 Write a Java program to convert temperature from Fahrenheit to Celsius degree.
	 Celsius = (fahrenheit - 32) * 5 / 9
 */

package pavan;
class TempConverter{
	void converter(float temp){
		double Ctemp= ((100- 32)* 5/9);
		System.out.println("Celcius to Fahrenheit teamp is "+ Ctemp);
	}
	public static void main (String[]agrs){
		TempConverter tempConverter= new TempConverter();
		tempConverter.converter(100);
	}
}