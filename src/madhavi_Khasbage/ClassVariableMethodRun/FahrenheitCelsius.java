package madhavi_Khasbage;

class FahrenheitCelsius
{
	void CalFahrenheitCelsius(int intfahrenheit){
		float celsius = (intfahrenheit - 32) * 5 / 9;
		System.out.println("Fahrenheit  = " + intfahrenheit);		
		System.out.println("Celsius degree = " + celsius);
	}
	
	public static void main(String[] agrs){
		FahrenheitCelsius objFarCel =new FahrenheitCelsius();
		objFarCel.CalFahrenheitCelsius(124);		
	}	
}