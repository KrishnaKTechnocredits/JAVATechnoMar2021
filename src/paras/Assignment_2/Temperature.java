//4. Write a Java program to convert temperature from Fahrenheit to Celsius degree.
//	 Celsius = (fahrenheit - 32) * 5 / 9

/*
Assignment 2 - Program 4 - Program Statement : Write a Java program to convert temperature from Fahrenheit to Celsius degree.
*/

package paras.Assignment_2;

class Temperature{

	void convert(float fahrenheit){
		float Celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Converted temperature from Fahrenheit to Celsius degree is " + Celsius);
	}
	
	public static void main(String[] args){
		Temperature temperature = new Temperature();
		temperature.convert(90f);
	}
}