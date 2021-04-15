//WAP to return chracter of given ascii value

package kajal.StringAndCharProgram;
import java.util.Scanner;

	public class Assignment_18p2 {
		
		void returnChar(int input) {
			//char d = (char)input;
			System.out.println((char)input);
		}
		public static void main(String [ ]args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter asci value");
			int input = sc.nextInt();
			new Assignment_18p2().returnChar(input);
		}
	}

