package krishna.Assignment_1_5;
class ConvertTemperature{
	
	void fahrenToCelsius(double fahrenheit){
		double Celsius;
		Celsius = (((fahrenheit - 32) * 5) / 9);
		System.out.println("converted temperatue in celsius is: "+Celsius);
	}
	public static void main(String[] args){
		ConvertTemperature convertTemperature= new ConvertTemperature();
		convertTemperature.fahrenToCelsius(4.5);
	}
} 