package pallavi.Assignment_28;

/*Write a method to return String having all numeric numbers first followed by Capital letter followed by Small letter. 
String msg = "Te1Ch2noCr4e_%$d8iTs9"
output : 12489TCCTehnoredis
*/
public class SortString {
	String finalOutput;
	String digit = "";
	String upperChar = "";
	String lowerChar = "";

	String sort(String str) {
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index))) {
				digit = digit + str.charAt(index);
			}

			if (Character.isUpperCase(str.charAt(index))) {
				upperChar = upperChar + str.charAt(index);
			}
			if (Character.isLowerCase(str.charAt(index))) {
				lowerChar = lowerChar + str.charAt(index);
			}

		}

		finalOutput = digit + upperChar + lowerChar;
		return finalOutput;

	}

	public static void main(String[] args) {

		String msg = "Te1Ch2noCr4e_%$d8iTs9";
		String output = new SortString().sort(msg);
		System.out.println(output);

	}

}
