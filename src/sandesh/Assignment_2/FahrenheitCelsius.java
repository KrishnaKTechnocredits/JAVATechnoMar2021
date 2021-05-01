package sandesh.Assignment_2;

public class FahrenheitCelsius {
	
	void computeCelsius(float fahrenheit) {
		float celsiusTemperature = ((fahrenheit - 32) * 5) /9;
		System.out.println("Celsius temperature equivalent of " + fahrenheit + " degrees fahrenheit is " + celsiusTemperature + " degrees celsius");
	}
	
	public static void main(String[] args) {
		FahrenheitCelsius fc1 = new FahrenheitCelsius();
		float fahrenheit = 98.6f;
		fc1.computeCelsius(fahrenheit);
	}
}
