package kangan.assignments.assignment2;

public class Temperature {

	void covertFtoC(float fahrenheit) {
		float celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Temperature in celsius is : " + celsius);
	}
	public static void main(String[] args) {
		Temperature temperature = new Temperature();
		temperature.covertFtoC(100);
	}
}
