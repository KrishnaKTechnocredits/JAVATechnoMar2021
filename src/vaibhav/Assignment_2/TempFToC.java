/*Java Assignment 2: 22nd March 2021

4. Write a Java program to convert temperature from Fahrenheit to Celsius degree.
Celsius = (fahrenheit - 32) * 5 / 9

 */

package vaibhav.Assignment_2;

class TempFToC{
	
	void fahrenheitToCelsius (float fahrenheit){
		float celsius = (fahrenheit - 32) * 5 / 9;
		
		System.out.println("Temerature in fahrenheit is : " + fahrenheit);
		System.out.println("Temerature in celsius is : " + celsius);
	}
		
	public static void main (String[] args){
		TempFToC tempFToC = new TempFToC();
		tempFToC.fahrenheitToCelsius(103.5f);
	}
}