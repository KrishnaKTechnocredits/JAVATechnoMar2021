package madhavi_Khasbage.CharacterMethods;
import java.util.Scanner;

/*Program 1: Write a method which will return "Techno" if Uppercase 
character count is higher then LowerCase character count, otherwise return "Credits". Print output in main method.
input : TeCHnoSessionS
output : Credits
*/
public class Example2 {
	int cntUpperCase, cntLowerCase;

	String getString(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isUpperCase(ch)) {
				cntUpperCase++;
			} else if (Character.isLowerCase(ch)) {
				cntLowerCase++;
			}
		}
		if (cntUpperCase > cntLowerCase) {
			return "Techno";
		}
		return "Credits";
	}

	public static void main(String[] args) {
		Example2 exp = new Example2();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter string using uppercase and lowecase characters :");
		String str = scanner.nextLine();

		System.out.println("Output:" + exp.getString(str));
		System.out.println("Uppercase count:" + exp.cntUpperCase);
		System.out.println("Lowercase count:" + exp.cntLowerCase);
		scanner.close();
	}
}
