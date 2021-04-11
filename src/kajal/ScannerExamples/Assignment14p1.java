package kajal.ScannerExamples;
import java.util.Scanner;

public class Assignment14p1 {
     
	static int add(int num1, int num2) {
		return num1+num2;
		}
	
	static int sub(int num1, int num2) {
		return num1-num2;
		}
	
	static int multiplication(int num1, int num2) {
		return num1*num2;
		}
	
	static int division(int num1, int num2) {
		return num1/num2;
		}
	
	public static void main(String [] args) {
		int a,b;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number");
		a=scanner.nextInt();
		System.out.println("Enter second number");
		b=scanner.nextInt();
		
		add(a,b);
		sub(a,b);
		multiplication(a,b);
		division(a,b);
		
		System.out.println("1.Addition is:" + add(a,b) + "   2.Substraction is:" + sub(a,b) + "   3.multiplication is:" + multiplication(a,b) + "   4.Division is:" + division(a,b));
		int total = add(a,b) + sub(a,b) +  multiplication(a,b) + division(a,b) ;
		System.out.println("total of all equation is : " + total);
	}		
}


