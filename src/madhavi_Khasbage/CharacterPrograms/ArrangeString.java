package madhavi_Khasbage.CharacterPrograms;

/*Assignment - 28 : 24th April'2021

Write a method to return String having all numeric numbers first followed by Capital letter followed by Small letter. 
String msg = "Te1Ch2noCr4e_%$d8iTs9"
output : 12489TCCTehnoredis */

public class ArrangeString {

	String getArrangedString(String str) {
		String strArange = "", strDigit = "", strUpper = "", strLower = "", StrSpecial = "";

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				strDigit += ch;
			} else if (Character.isUpperCase(ch)) {
				strUpper += ch;
			} else if (Character.isLowerCase(ch)) {
				strLower += ch;
			} else {
				StrSpecial += ch;
			}
		}
		strArange = strDigit + strUpper + strLower + StrSpecial;
		return strArange;
	}

	public static void main(String[] args) {
		ArrangeString objArg = new ArrangeString();
		System.out.println(objArg.getArrangedString("Te1Ch2noCr4e_%$d8iTs9"));
	}

}
