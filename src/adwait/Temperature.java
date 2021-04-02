package adwait;

class Temperature{
	void convert (double fahrenheit){
		double celcius = (fahrenheit - 32)*5 / 9;
		System.out.println("fahrenheit "+fahrenheit+" is "+celcius+" Celcius");
	}
	
	public static void main (String [] args){
		Temperature temperature = new Temperature();
		temperature.convert(100);
	}
}