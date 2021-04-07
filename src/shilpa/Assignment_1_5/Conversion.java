//Write a Java program to convert temperature from Fahrenheit to Celsius degree.

package shilpa.Assignment_1_5;

class Conversion{
	
	void convert(int fahrenheit){		
		int celsius=(fahrenheit -32)*5/9;
		System.out.println("Temperature in Celcius is: "+ celsius);
	}
	
	public static void main(String[] arg){
		Conversion c1 = new Conversion();
		c1.convert(98);
		
	}
}