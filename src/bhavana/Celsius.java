package bhavana;
class Celsius{
	
	void convert(float fahrenheit){
		float celsius;
		celsius=(fahrenheit-32)*5/9;
		System.out.println("Conversion is:" +celsius);
	}
	
	public static void main(String [] args){
		Celsius cel= new Celsius();
		cel.convert(45);
	}	
}