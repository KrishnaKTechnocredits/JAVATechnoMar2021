package monali.Scanner;

import java.util.Scanner;

public class Cal_14 {
	
	public static void main(String[] a) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter int");
		int x = sc.nextInt();
		System.out.println("Enter int");
		int y = sc.nextInt();
		int add = x + y;
		System.out.println("Addition is "+x+y);
		int sub = x - y;
		System.out.println("Subtraction is "+(x-y));
		int mul = x * y;
		System.out.println("Multiplication is "+x*y);
		int div = x / y;
		System.out.println("Division is "+x/y);
	}
		
		int add(int x, int y){
		    int z = x + y;
			return z;
			
		}
			
		int sub(int x1,int y1){
			int z = x1 - y1;
			return z;
		}
		
		int mul(int x2,int y2){
			int z = x2 * y2;
	        return z;
		}
		
		int div(int x3,int y3){
			int z = x3 / y3;
			return z;
		}
		void printTotalAnswer(int addAnswer, int subAnswer, int mulAnswer,int divAnswer){
			int total = addAnswer + subAnswer + mulAnswer + divAnswer;
			System.out.println(total);
		}
		
	}
		
	   