package shivani.Coding_exam_10;
/*Print the first non-repeated character of String.
Input : abcgbca
output : g*/
public class ReturnNonReapeatedChar {
	char retrunNonrepeaedChar(String str) {
		char output=' ';
		for(int i =0;i<str.length();i++) {
			//String method.
		 str.charAt(i);
			char ch1 = str.charAt(i);
			if (str.indexOf(ch1) == str.lastIndexOf(ch1)) {
				output = str.charAt(i);
			
			break;
			}
			}
		return output;
	}
	public static void main(String[] args) {
		ReturnNonReapeatedChar returnNonReapeatedChar = new ReturnNonReapeatedChar();
	 char output=returnNonReapeatedChar.retrunNonrepeaedChar("abcgbcatg");
	 System.out.println(output);
	
	}

}
