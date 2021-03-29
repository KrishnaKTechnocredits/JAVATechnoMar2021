/*Assignment no 2
   Write a Java program to convert temperature from Fahrenheit to Celsius degree.
   Celsius = (fahrenheit - 32) * 5 / 9*/
package pravin; 
class Conversion{

	void Celsius(int Num1){
		int fahrenheit = Num1;
		int Celsius = ((fahrenheit - 32) * 5) / 9 ;

		System.out.println("Celsius is " +Celsius);
	}

	public  static void main(String[] args){
		Conversion conversion = new Conversion();
		conversion.Celsius(98);
	}
}
