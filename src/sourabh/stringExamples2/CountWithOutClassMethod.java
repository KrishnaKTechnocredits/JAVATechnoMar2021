/*1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.
*/
package sourabh.stringExamples2;

public class CountWithOutClassMethod {
	int digitCount=0, lettersCount=0, upperCaseCount=0, lowerCaseCount=0, specialCharCount=0;
	void getCount(String str) {
		for(int index=0; index< str.length(); index++) {
			int asciiValue= str.charAt(index);
			if(asciiValue>=48 && asciiValue<=57)
				digitCount++;
			else if(asciiValue>=65 && asciiValue<=122)
				lettersCount++;
			else
				specialCharCount++;
			
			if(asciiValue>=65 && asciiValue<=90)
				upperCaseCount++;
			if(asciiValue>=97 && asciiValue<=122)
				lowerCaseCount++;
		}
		System.out.println("Total digit: "+digitCount);
		System.out.println("Total Letters: "+lettersCount);
		System.out.println("Total Uppercase: "+upperCaseCount);
		System.out.println("Total Lowercase: "+lowerCaseCount);
		System.out.println("Total Special char: "+specialCharCount);
	}
	public static void main(String[] args) {
		CountWithOutClassMethod countWithOutClassMethod= new CountWithOutClassMethod();
		countWithOutClassMethod.getCount("1rRpd3F9#K(E");
	}
}
