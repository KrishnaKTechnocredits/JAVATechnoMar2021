//Assignment2- Write a Java program to convert temperature from Fahrenheit to Celsius degree.

package radha;

class Temperature{
	void convert(double fhiet){
		double celsius = (fhiet-32)*5/9;
		System.out.println("Conversion from"+ " " +fhiet+ "Farenhiet is"+" " +celsius+"Degrees.");
	}
	
	public static void main(String[] args){
		Temperature temp = new Temperature();
		temp.convert(102.25);
	}
}