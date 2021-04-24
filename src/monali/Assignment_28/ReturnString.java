package monali.Assignment_28;

public class ReturnString {

	String getString(String name) {
		String upperCase = "";
		String lowerCase = "";
		String digit = "";
		for(int i = 0; i < name.length(); i++) {
			if(Character.isDigit(name.charAt(i)))
				digit = digit + (name.charAt(i));
				else if(Character.isUpperCase(name.charAt(i)))
					upperCase = upperCase + (name.charAt(i));
				else if(Character.isLowerCase(name.charAt(i)))
					lowerCase = lowerCase + (name.charAt(i));
			
		}
		String output = digit + upperCase + lowerCase;
		System.out.println(output);
		return name;
	}
	
	public static void main(String[] args) {
		ReturnString m1 = new ReturnString();
		m1. getString("mona123LI234TONdaRE");
	}
}
