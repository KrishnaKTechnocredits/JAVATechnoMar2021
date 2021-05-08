package milind.Assignment_20;
//Wap to count digits,letters,upperCase character,lowerCase character,special character from predefined string

public class GetStringCount {
	int upperCount,lowerCount,isDigitCount;
	
	void idDigit(String str) {
		int size=str.length();
		for(int index=0;index < size;index++) {
			if(Character.isDigit(str.charAt(index))) {
				isDigitCount++;
			}
		}
		System.out.println("Digital count in Stringnis : "+isDigitCount);
	}
	void lettersCount() {
		int totalLettersCount=upperCount + lowerCount;
		System.out.println("Total Letters count : "+totalLettersCount);
	}
	void upperCaseCount(String str) {
		int size=str.length();	
		for(int index=0;index < size ;index++) {
			if(Character.isUpperCase(str.charAt(index))) {
				upperCount++;
			}
		}
		System.out.println("upper case count in String is: "+upperCount);
	}
	
	void lowerCaseCount(String str) {
		int size=str.length();	
		for(int index=0;index < size ;index++) {
			if(Character.isLowerCase(str.charAt(index))) {
				lowerCount++;
			}
		}
		System.out.println("Lower case count in String is: "+lowerCount);
	}
	void specialCharCount(String str) {
		int size=str.length();
		int specialCharCount=size - (upperCount+lowerCount+isDigitCount);
		System.out.println("Special Character count : "+specialCharCount);
	}
	public static void main(String[] args) {
		GetStringCount getStringCount=new GetStringCount();
		String str="AAA88bbb&^&$";
		int size=str.length();
		System.out.println("String is :"+str);
		System.out.println("---------");
		getStringCount.idDigit(str);
		getStringCount.upperCaseCount(str);
		getStringCount.lowerCaseCount(str);
		getStringCount.lettersCount();
		getStringCount.specialCharCount(str);
	}
}
