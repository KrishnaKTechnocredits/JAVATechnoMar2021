package monika.Assignment2;

/* Assignment 2: 
 *4. Write a Java program to convert temperature from Fahrenheit to Celsius degree.
	 Celsius = (fahrenheit - 32) * 5 / 9  */
	 
class TemperatureConversion{
void calculateInCelsius(int fahrenheit){
	int answer = ((fahrenheit - 32)*5)/9;
	System.out.println("Temperature in celsius is: " +answer);
}
public static void main(String[] args){
	TemperatureConversion temperatureConversion = new TemperatureConversion();
	temperatureConversion.calculateInCelsius(150);
}
}