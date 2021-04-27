/*Write a method to return String having all numeric numbers first followed by Capital letter followed by Small letter. 
String msg = "Te1Ch2noCr4e_%$d8iTs9"
output : 12489TCCTehnoredis*/

package shilpa.Assignment_28;

public class ReturnString {
	String getStrWithCharAndNumbers(String str1) {
		String strdigit = "";
		String strupper = "";
		String strlower = "";
		for (int index = 0; index < str1.length(); index++) {
			if (Character.isDigit(str1.charAt(index))) {
				strdigit = strdigit + str1.charAt(index);
			} else if (Character.isUpperCase(str1.charAt(index))) {
				strupper = strupper + str1.charAt(index);
			} else if (Character.isLowerCase(str1.charAt(index))) {
				strlower = strlower + str1.charAt(index);
			}
		}
		return strdigit + strupper + strlower;
	}

	public static void main(String[] args) {
		ReturnString returnString = new ReturnString();
		System.out.println(returnString.getStrWithCharAndNumbers("Te1Ch2noCr4e_%$d8iTs9"));
	}

}
