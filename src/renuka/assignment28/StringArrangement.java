package renuka.assignment28;

/*Write a method to return String having all numeric numbers first followed by Capital letter followed by Small letter. 
String msg = "Te1Ch2noCr4e_%$d8iTs9"
output : 12489TCCTehnoredis*/


public class StringArrangement {
	
	String getTypeOfString(String str) {
		String digitStr = "";
		String lowerCaseStr = "";
		String upperCaseStr = "";
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index))) {
				digitStr = digitStr + str.charAt(index);
			} else if (Character.isLowerCase(str.charAt(index))) {
				lowerCaseStr = lowerCaseStr + str.charAt(index);
			} else if (Character.isUpperCase(str.charAt(index))) {
				upperCaseStr = upperCaseStr + str.charAt(index);
			}
		}
		return (digitStr + upperCaseStr + lowerCaseStr);
	}

	String[] getTypeOfString(String strArray[]) {
		String[] output = new String[strArray.length];
		for (int index = 0; index < strArray.length; index++) {
			String arrStringItem = getTypeOfString(strArray[index]);
			output[index] = arrStringItem;
		}
		return output;
	}

	public static void main(String[] args) {
		StringArrangement stringMsg = new StringArrangement();
		String str1 = "Te1Ch2noCr4e_%$d8iTs9";
		String[] strArray = { "Te1Ch2noCr4e_%$d8iTs9","R1e#n3u$k2a" };
		System.out.println("Output: " + stringMsg.getTypeOfString(str1));
		String outputFromArrayString[] = stringMsg.getTypeOfString(strArray);
		for (int index = 0; index < outputFromArrayString.length; index++) {
			System.out.print(outputFromArrayString[index] + " ");
		}
     }
}
