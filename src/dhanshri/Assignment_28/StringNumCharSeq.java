package dhanshri.Assignment_28;

public class StringNumCharSeq {
	
	String outputString(String input) {
	String output = "";
	String digit= "" ;
	String upperCase= "";
	String lowerCase= "";
	
	for (int index = 0; index < input.length(); index++) {
		if (Character.isDigit(input.charAt(index)))
			digit = digit + input.charAt(index);
		else if (Character.isUpperCase(input.charAt(index)))
			upperCase =upperCase+ input.charAt(index);
		else if (Character.isLowerCase(input.charAt(index)))
			lowerCase = lowerCase+ input.charAt(index);
	}
	output = digit + upperCase + lowerCase;
	return output;
}

public static void main(String[] args) {
StringNumCharSeq stringNumCharSeq = new StringNumCharSeq();
	String output = stringNumCharSeq.outputString("Te1Ch2noCr4e_%$d8iTs9");
	System.out.println(output);
}

}
