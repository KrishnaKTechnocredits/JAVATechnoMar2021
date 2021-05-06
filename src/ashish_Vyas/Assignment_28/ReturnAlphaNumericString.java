package ashish_Vyas.Assignment_28;

/*Write a method to return String having all numeric numbers first followed by Capital letter followed by Small letter. 
String msg = "Te1Ch2noCr4e_%$d8iTs9"
output : 12489TCCTehnoredis*/

public class ReturnAlphaNumericString {

	String getAlphaNumeric(String word) {
		String num = "";
		String uppercase = "";
		String lowercase = "";
		String outputString;
		
		for (int index=0;index<word.length();index++) {
			char ch = word.charAt(index);
			if(Character.isDigit(ch)) 
				num = num+ch;
			else if (Character.isUpperCase(ch))
				uppercase = uppercase +ch;
			else if (Character.isLowerCase(ch))
				lowercase =lowercase +ch;	
			}
		outputString = num+uppercase+lowercase;
				return outputString;
		}
	public static void main(String[] args) {
		ReturnAlphaNumericString returnAlphaNumericString = new ReturnAlphaNumericString();
		String output = returnAlphaNumericString.getAlphaNumeric("Te1Ch2noCr4e_%$d8iTs9");
		System.out.println(output);
	}
}
