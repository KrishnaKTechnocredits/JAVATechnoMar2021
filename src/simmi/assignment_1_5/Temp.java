 /*4. Write a Java program to convert temperature from Fahrenheit to Celsius degree.*/

package simmi.assignment_1_5;

class Temp
{
  void degree(float far)
  {
    float celsius = (far - 32)*5/9;
	System.out.println("Celsius is" + celsius);
  }
  public static void main(String[] args)
  {
    Temp t = new Temp();
	t.degree(64);
  }
}