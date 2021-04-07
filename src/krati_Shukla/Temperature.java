//Write a Java program to convert temperature from Fahrenheit to Celsius degree.

package krati_Shukla;

class Temperature
{
	void conversion(int f)
	{
		int Celsius;
		Celsius = (f-32)*5/9;
		System.out.println("The conversion from Fahrenheit to Celsius degree is "+Celsius);
	}
	public static void main (String[] a)
	{
		Temperature temperature = new Temperature();
		temperature.conversion(98);
	}
}
	
	