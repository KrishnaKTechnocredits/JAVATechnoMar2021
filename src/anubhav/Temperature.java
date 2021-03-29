//4. Write a Java program to convert temperature from Fahrenheit to Celsius degree.
//	 Celsius = (fahrenheit - 32) * 5 / 9

package anubhav;

class Temperature{
		void conversion(int fahrenheit){
		int celcius=((fahrenheit - 32)*5/9);
		System.out.println("Temperature in Celcius is " + celcius);
	}
	
	public static void main (String[] args){
		Temperature temperature= new Temperature ();
		temperature.conversion(95);
	}
} 