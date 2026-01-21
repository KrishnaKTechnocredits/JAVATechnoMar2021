package amrutaM.Assignment25;

/*Program2: 
String str = "Ma1U2liK" 
output : MUK12ali
*/
public class P2_desiredString {
	void getDesiredString(String input) {
		String uppercase = "", lowercase="",digit="";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(input.charAt(index))) {
				uppercase += ch;
			} else if (Character.isDigit(ch)) {
				digit += ch;
			} else if (Character.isLowerCase(ch)) {
				lowercase += ch;

			}
		}
		System.out.println("Output is --> " + (uppercase+Integer.parseInt(digit)+lowercase));
	}

	public static void main(String[] args) {
		String input = "Ma1U2liK";
		new P2_desiredString().getDesiredString(input);
	}
}
