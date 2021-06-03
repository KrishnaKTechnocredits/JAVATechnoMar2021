/*Write a method to return String having all numeric numbers first followed by Capital letter followed by Small letter. 
String msg = "Te1Ch2noCr4e_%$d8iTs9"
output : 12489TCCTehnoredis*/

package neha_Rathi.assignment28;

public class SortString {

	static String arrangeString(String input) {
		String numInput = "";
		String LowerInput = "";
		String UpperInput = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch))
				numInput += ch;
			else if (Character.isLowerCase(ch))
				LowerInput += ch;

			else if (Character.isUpperCase(ch))
				UpperInput += ch;
		}
		return numInput + UpperInput + LowerInput;
	}

	public static void main(String[] args) {
		System.out.println(arrangeString("Te1Ch2noCr4e_%$d8iTs9"));
	}
}
