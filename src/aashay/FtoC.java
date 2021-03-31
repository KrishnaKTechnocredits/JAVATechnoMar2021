package aashay;
/*
 * Write a Java program to convert temperature from Fahrenheit to Celsius degree.
	 Celsius = (fahrenheit - 32) * 5 / 9
 */

class FtoC{
	int celsius;
	
	void conversion(int fn){
		celsius = (fn - 32) * 5 / 9;
		System.out.println("Conversion of Fahrenheit:"+fn+" to Celsius is:"+celsius);
	}
	public static void main(String[] args){
		FtoC fc = new FtoC();
		fc.conversion(50);
	}
	
}