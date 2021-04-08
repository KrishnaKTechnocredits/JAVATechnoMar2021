package trupti.scanner;
import java.util.Scanner;
public class ScannerCalculator {
	
	void add(int x,int y)
	{
		int answer=x+y;
		System.out.println("Addition of two numbers is "+answer);
	}
	void subtract(int x,int y)
	{
		int answer=x-y;
		System.out.println("Subtraction of two numbers is "+answer);
	}
	void multiplication(int x,int y)
	{
		int answer=x*y;
		System.out.println("Multiplication of two numbers is "+answer);
	 }
	 void division(int x,int y)
	{
		int answer=x/y;
		System.out.println("Division of two numbers is "+answer);
	}

	public static void main(String[] args) {
		ScannerCalculator scannercalculator=new ScannerCalculator();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter First number:");
		String inputNumber1=scanner.nextLine();
		int number1=Integer.parseInt(inputNumber1);
		System.out.println("Enter Second number :");
		String inputNumber2=scanner.nextLine();
		int number2=Integer.parseInt(inputNumber2);
		scannercalculator.add(number1,number2);
		scannercalculator.subtract(number1,number2);
		scannercalculator.multiplication(number1,number2);
		scannercalculator.division(number1,number2);
		}
}
