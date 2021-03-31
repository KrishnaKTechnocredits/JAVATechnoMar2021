package sourabh;

class ConvertTemperature{
	void convert(int fahrenheit){
		float celsius = (fahrenheit - 32)*5/9;
		System.out.println("Temperature from Fahrenheit to Celsius is " +celsius );	
	}
	public static void main(String[] args){
		ConvertTemperature converttemperature= new ConvertTemperature();
		converttemperature.convert(98);	
	}

}