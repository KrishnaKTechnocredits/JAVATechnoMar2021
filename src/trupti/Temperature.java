package trupti;
/*Assignment 2 : Write a Java program to convert temperature from Fahrenheit to Celsius degree.
	 Celsius = (fahrenheit - 32) * 5 / 9   */

class Temperature{

	void temp(int f){
		int celsius=(f-32) * 5 / 9;
		System.out.println("Temperature from Fahrenheit "+f+" to Celsius degree is :"+celsius);
	}
	public static void main(String[] args){
		Temperature temperature=new Temperature();
		temperature.temp(90);
	}
}


