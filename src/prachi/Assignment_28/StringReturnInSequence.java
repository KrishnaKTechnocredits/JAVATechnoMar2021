package prachi.Assignment_28;

/*Assignment - 28 : 24th April'2021
Write a method to return String having all numeric numbers first followed by Capital letter followed by Small letter. 
String msg = "Te1Ch2noCr4e_%$d8iTs9"
output : 12489TCCTehnoredis*/

public class StringReturnInSequence {
	String getStringInSequence(String str) {
		
		String digitStr = "";
		String capsStr = "";
		String smallStr = "";
		String specChar = "";
		
		for(int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index))) {
				digitStr = digitStr + str.charAt(index);
			}
			else if(Character.isUpperCase(str.charAt(index))) {
				capsStr=capsStr + str.charAt(index);
			}
			else if(Character.isLowerCase(str.charAt(index))) {
				smallStr = smallStr + str.charAt(index);
			}
			else
				specChar = specChar + str.charAt(index);
		}
		String output = digitStr+capsStr+smallStr+specChar;
		return output;
	}

	public static void main(String[] args) {
		StringReturnInSequence msg = new StringReturnInSequence();
		System.out.println("The sequential string output is: " +"\n"+ msg.getStringInSequence("Te1Ch2noCr4e_%$d8iTs9"));
	}
}
