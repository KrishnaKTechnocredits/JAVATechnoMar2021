package prachi.Assignment_21;

/*Assignment 21: 14th April'2021 
Assignment 20 (both program) without using Character class method.*/

public class StrOperations1 {

	static String str = "1rRpd3F9#K(E";

	void StrOperations1(String str) {

		int digitCnt = 0;
		int upperCnt = 0;
		int lowerCnt = 0;
		int specialCharCnt = 0;
		int length = str.length();

		for(int index = 0;index<str.length();index++) {

			if(str.charAt(index)>=65 && str.charAt(index)<=90)  
				upperCnt++;

			else if(str.charAt(index)>=97 && str.charAt(index)<=122)
				lowerCnt++;

			else if(str.charAt(index)>=48 && str.charAt(index)<=57) 
				digitCnt++;

			else
				specialCharCnt++;
		}
		
		System.out.println("Output of program without using character class methods:");
		System.out.println("Total digit: " + digitCnt);
		System.out.println("Total Letters: " + (upperCnt + lowerCnt));
		System.out.println("Total Uppercase: " + upperCnt);
		System.out.println("Total Lowercase: " + lowerCnt);
		System.out.println("Total Special char: " + specialCharCnt);
	}

	public static void main(String[] args) {
		StrOperations1 so1 = new StrOperations1();
		so1.StrOperations1(str);
	}
}
