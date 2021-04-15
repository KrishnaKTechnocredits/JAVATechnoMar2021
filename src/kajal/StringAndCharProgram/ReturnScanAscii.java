//WAP to return(using return method) asci value of character given by user, using scanner 

package kajal.StringAndCharProgram;

import java.util.Scanner;

public class ReturnScanAscii {
	
	 static int callAscii(char c) {
		int ascii = c;
		return ascii;
		
		}
	
		public static void main(String [] arg) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("enter character to print Ascii value");
		char c=sc.next().charAt(0);
		
		ReturnScanAscii t= new ReturnScanAscii();
		t.callAscii(c);
				
		System.out.println(callAscii(c));
		}

}
