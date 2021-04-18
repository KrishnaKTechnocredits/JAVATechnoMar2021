//WAP to print character of ASCII value, 97 to 122

package kajal.StringAndCharProgram;
import java.util.Scanner;

public class Assignment_18p4 {
		
		void printChar() {
			for(int i=97; i<=122; i++) {
				char ch= (char)i;
				System.out.println(ch);
			}	
		}
		
			public static void main(String [] arg) {
		
			Scanner sc= new Scanner(System.in);
		    new Assignment_18p4().printChar();
			
	}
}
