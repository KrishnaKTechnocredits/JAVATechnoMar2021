package upasana;

class Temp{
	
	void Celsius(float fahrenheit){
		System.out.println("Temperature in Celsius is "+((fahrenheit - 32)*5/9));
	}
	
	public static void main(String[] args){
		Temp temp = new Temp();
		temp.Celsius(80);
	}
}