//4. Write a Java program to convert temperature from Fahrenheit to Celsius degree.
//Celsius = (fahrenheit - 32) * 5 / 9

package mayur;

class Temperature
{
	void degree(float F)
	{
		float C = (F-32)*5/9;
		System.out.println("Temperature in celcius is " +C);
	}
	
	public static void main(String[] args)
	{
		Temperature temperature = new Temperature();
		temperature.degree(104);
		
	}
}