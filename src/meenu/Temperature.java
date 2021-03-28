package meenu;

/* Assignment_2 -> Program_4: Write a Java program to convert temperature from Fahrenheit to Celsius degree.
	 Celsius = (fahrenheit - 32) * 5 / 9
*/

class Temperature{

	void convertToCelcius(float fahrenheit){
		float celsius = ((fahrenheit - 32)*5/9);
		System.out.println("Temperature in Celsius is "+ celsius);
	}
	
	public static void main(String[] args){
		Temperature temperature1 = new Temperature();
		temperature1.convertToCelcius(90);
	}
}	