package milind;
/*. Write a Java program to convert temperature from Fahrenheit to Celsius degree.
	 Celsius = (fahrenheit - 32) * 5 / 9
 * 
 */
class Example5{
	void degree(float fahr){
		float celsius = (fahr - 32)*5/9;
		System.out.println("Celsius is "+celsius);
	}
	public static void main(String[] a){
		Example5 temperature=new Example5();
		temperature.degree(55);
	}
	}
	