package krishna.Assignment_28;
/*Write a method to return String having all numeric numbers first followed by Capital letter followed by Small letter. 
String msg = "Te1Ch2noCr4e_%$d8iTs9"
output : 12489TCCTehnoredis
*/

public class ReturnStringNumValueFirst {

	String returnNumValueFirst(String name) {
		String digitstr = "";
		String upperCase = "";
		String lowerCase = "";
		String specialCharacter = "";

		for (int index = 0; index < name.length(); index++) {
			if (Character.isDigit(name.charAt(index))) {
				digitstr = digitstr + name.charAt(index);
			} else if (Character.isUpperCase(name.charAt(index))) {
				upperCase = upperCase + name.charAt(index);
			} else if (Character.isLowerCase(name.charAt(index))) {
				lowerCase = lowerCase + name.charAt(index);
			} else {
				specialCharacter = specialCharacter + name.charAt(index);
			}
		}
		String output = digitstr + upperCase + lowerCase + specialCharacter;
		return output;
	}

	String[] valueStringArray(String[] nameArray) {

		String[] finalOutput = new String[nameArray.length];

		for (int innerIndex = 0; innerIndex < nameArray.length; innerIndex++) {
			finalOutput[innerIndex] = returnNumValueFirst(nameArray[innerIndex]);
		}
		return finalOutput;
	}

	public static void main(String[] args) {
		ReturnStringNumValueFirst returnStringNumValueFirst = new ReturnStringNumValueFirst();
		String output = returnStringNumValueFirst.returnNumValueFirst("Te1Ch2noCr4e_%$d8iTs9");
		System.out.println("Final output is String is :" + output);
		System.out.println("*******************************************************");
		
		String[] stringArray = new String[] { "P1u2r@#$2va", "1K2o&^mal", "9S4hiva&^n4i4", "1K@#2r3ati",
				"4M4a5$%#d5h1v1i93" };
		String[] nameArray = returnStringNumValueFirst.valueStringArray(stringArray);
		
		for (int index = 0; index < nameArray.length; index++) {
			System.out.println("Final output"+"  for  " +stringArray [index] +" is :" + nameArray[index]);
		}
	}
}
