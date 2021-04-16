package assignment_19;

public class CountUpperCaseChar {

	String checkUpperLowerCaseCount(String str) {
		int size = str.length(), upperCount=0, lowerCount = 0;
		for(int index =0 ; index < size-1 ; index++) {
			if(str.charAt(index) == Character.toUpperCase(str.charAt(index))) {
				upperCount++;
				lowerCount = size - upperCount;
			}
		}
		if (upperCount > lowerCount) {
			return "Techno";
		}return "Credit";
	}		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "TechnoCredit";
		CountUpperCaseChar countUpperCaseChar = new CountUpperCaseChar();
		String Str = countUpperCaseChar.checkUpperLowerCaseCount(str);
		System.out.println("output :" +Str);
	}

}
