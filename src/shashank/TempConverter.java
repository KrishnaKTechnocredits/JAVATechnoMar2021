package shashank;
class TempConvertor
{
	public void FahrenheitToCelsius (float temp)
	{
		System.out.println("Fahrenheit temperature "+temp+" in Celsius is "+((temp-32)* 5/9));
	}
	public static void main (String args [])
	{
		TempConvertor tempConvertor = new TempConvertor();
		tempConvertor.FahrenheitToCelsius(20.75f);
	}
}