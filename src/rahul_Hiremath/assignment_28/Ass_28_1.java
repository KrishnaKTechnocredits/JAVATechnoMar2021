/*Write a method to return String having all numeric numbers first followed by Capital letter followed by Small letter. 
String msg = "Te1Ch2noCr4e_%$d8iTs9"
output : 12489TCCTehnoredis*/

package rahul_Hiremath.assignment_28;

public class Ass_28_1 {

	String digits = "";
	String uppercase = "";
	String lowercase = "";
	String expected = "";

	String displayDigitsUppercaseLowercase(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch))
				digits = digits + ch;
			if (Character.isUpperCase(ch))
				uppercase = uppercase + ch;
			if (Character.isLowerCase(ch))
				lowercase = lowercase + ch;
		}
		expected = digits + uppercase + lowercase;
		return expected;
	}

	public static void main(String[] args) {

		Ass_28_1 ass_28_1 = new Ass_28_1();
		String str = "Te1Ch2noCr4e_%$d8iTs9";
		String expected = ass_28_1.displayDigitsUppercaseLowercase(str);
		System.out.println("Expected string: " + expected);
	}
}
