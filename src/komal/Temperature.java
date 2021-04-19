//Write a Java program to convert temperature from Fahrenheit to Celsius degree.
//Celsius = (fahrenheit - 32) * 5 / 9
	 
package komal;

class Temperature{
	
	void Convert(int fahrenheit){
		int Celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Temperature in celsius is "+Celsius);
	}
	
	public static void main(String[] args){
		Temperature temp = new Temperature();
		temp.Convert(76);
	}
}
		