package sai.Assignment28;

public class StringAllCharacters {

	public static void main(String[] args) {
		StringAllCharacters stringAllCharacters =new StringAllCharacters();
		String output=stringAllCharacters.getStringChars("Te1Ch2noCr4e_%$d8iTs9");
		System.out.println(output);

	}

	String getStringChars(String str) {
		String digitString="";
		String upperCaseString="";
		String lowerCaseString="";
		for(int index=0;index<str.length();index++) {
			if(Character.isDigit(str.charAt(index))) 
				digitString=digitString+str.charAt(index);
			else if (Character.isUpperCase(str.charAt(index)))
				upperCaseString=upperCaseString+str.charAt(index);
			else if(Character.isLowerCase(str.charAt(index)))
				lowerCaseString=lowerCaseString+str.charAt(index);

		}
		return digitString+upperCaseString+lowerCaseString;
	}
}
