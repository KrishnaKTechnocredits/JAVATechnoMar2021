package ashish_Vyas.Assignment_21;

public class Count {

	@SuppressWarnings("deprecation")
	void getCaseCount(String str) {
		int digitCount = 0;
		int lettercount = 0;
		int upperChCount = 0;
		int lowerChCount = 0;
		int specialChar = 0;

		for (int index = 0; index < str.length(); index++) {

			if (Character.isDigit(str.charAt(index)))
				digitCount++;

			if (Character.isLetter(str.charAt(index)))
				lettercount++;

			if (Character.isUpperCase(str.charAt(index)))
				upperChCount++;

			if (Character.isLowerCase(str.charAt(index)))
				lowerChCount++;

			//if (Character.isSp(str.charAt(index)))
			if (!Character.isDigit(str.charAt(index)) && !Character.isLetter(str.charAt(index)) && !Character.isSpace(str.charAt(index))) 
				specialChar++;
		}

		System.out.println("Total digit:" + digitCount + "\n" + "Total Letters:" + lettercount + "\n" + "Total Uppercase:" + upperChCount + "\n"+ "Total Lowercase:" +lowerChCount + "\n"+ "Total Special char:" + specialChar);
	}
	public static void main(String[] args) {
		Count count = new Count();
		count.getCaseCount("1rRpd3F9#K(E");
		
	}
}