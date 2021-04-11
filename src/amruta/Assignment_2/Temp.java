/* 4. Write a Java program to convert temperature from Fahrenheit to Celsius degree.
	 Celsius = (fahrenheit - 32) * 5 / 9 */

package amruta.Assignment_2;

class Temp{
		
		void convert(float fahrenheit){
			float celsius = (fahrenheit - 32) * 5 / 9;
			System.out.println("Temprature in Celsius is : "+celsius);
		}
		public static void main(String[] a){
			Temp t = new Temp();
			t.convert(80);
		}
}