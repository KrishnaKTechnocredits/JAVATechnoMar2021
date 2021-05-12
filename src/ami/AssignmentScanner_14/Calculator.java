/*
 Calculator program using Scanner class.
 
 */

package ami.AssignmentScanner_14;

import java.util.Scanner;

public class Calculator {
	void add(int num1 , int num2){
		int answer = num1 + num2;
		System.out.println("Addition of two variable is "+ answer);
		}
		
	void sub(int num1 , int num2){
		int answer1 = num1 - num2;
		System.out.println("Substraction of Two Variable is "+ answer1);
		}
		
	void multi(int num1 , int num2){
		int answer2 = num1 * num2;
		System.out.println("Multiplication of two variable is " + answer2);
		}
		
	void div(int num1 , int num2){
		int answer3 = num1 / num2;
		System.out.println("Divison of two variable is " + answer3);
		}
	
	public static void main(String[] a) {
		Calculator ca = new Calculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any 2number for addition: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		ca.add(num1 , num2);
		System.out.println("********************************");
		ca.sub(num1 , num2);
		System.out.println("********************************");
		ca.multi(num1 , num2);
		System.out.println("********************************");
		ca.div(num1 , num2);
		
	} 
}
