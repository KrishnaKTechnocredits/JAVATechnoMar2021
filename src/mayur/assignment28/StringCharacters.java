package mayur.assignment28;

public class StringCharacters {
	String getString(String str) {
		String digitStr="";
		String upperCase="";
		String lowerCase="";
		for(int index=0;index<str.length();index++) {
			if(Character.isDigit(str.charAt(index))) 
				digitStr=digitStr+str.charAt(index);
			else if (Character.isUpperCase(str.charAt(index)))
				upperCase=upperCase+str.charAt(index);
			else if(Character.isLowerCase(str.charAt(index)))
				lowerCase=lowerCase+str.charAt(index);

		}
		return digitStr+upperCase+lowerCase;
	}



	public static void main(String[] args) {
		StringCharacters stringChar =new StringCharacters();
		String output=stringChar.getString("Te1Ch2noCr4e_%$d8iTs9");
		System.out.println("Output :"+output);

	}

}
