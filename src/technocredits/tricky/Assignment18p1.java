package technocredits.tricky;
import java.util.Scanner;

public class Assignment18p1 {
	
	void returnAscii(char ch) {
		int ascci = ch;
		System.out.println(ascci);
	}
	
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter character to return ASCII value: ");
		char ch = scanner.next().charAt(0); // a
		Assignment18p1 assign = new Assignment18p1();
		assign.returnAscii('c');
		/*String str = "Technocredits";
		int asci = 'a';
		for (int i=0; i<str.length(); i++)
			int 'a' = (int)str(i);
		
		System.out.println(str.charAt(1));
		System.out.println(asci);*/
		
	}
	
}