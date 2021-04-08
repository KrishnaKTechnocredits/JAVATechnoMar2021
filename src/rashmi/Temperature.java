package rashmi;
public class Temperature{

	 void fahrToCelsius(int fahrenheit){
		int celsius = (fahrenheit - 32) *  5 / 9;
		System.out.println("Temp in celsius is " + celsius);
	}
	
	public static void main(String[] args){
		Temperature temperature = new Temperature();
		temperature.fahrToCelsius(100);
	}
}