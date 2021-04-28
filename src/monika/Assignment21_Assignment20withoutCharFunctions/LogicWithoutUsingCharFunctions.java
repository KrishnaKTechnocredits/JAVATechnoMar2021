package monika.Assignment21_Assignment20withoutCharFunctions;
/*Assignment 20 
 * 1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2

Assignment20 part2
2) WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53*/

public class LogicWithoutUsingCharFunctions {
	
	static void getAscii() {
		for(int i = 33; i<=47;i++) {
			char c = (char)i;
			System.out.println("Special char : "+c);
		}
		for(int i = 48; i<=57;i++) {
			char c = (char)i;
			System.out.println("\n Digits : "+c);
		}
		
		for(int i = 58; i<=64;i++) {
			char c = (char)i;
			System.out.println("----special char : "+c);
		}
		
		for(int i = 65; i<=90;i++) {
			char c = (char)i;
			System.out.println("Caps Alphabets : "+c);
		}
		
		for(int i = 91; i<=96;i++) {
			char c = (char)i;
			System.out.println("\nspecial char Alphabets : "+c);
		}
		for(int i = 97; i<=122;i++) {
			char c = (char)i;
			System.out.println("-------lower Alphabets : "+c);
		}
		int i = 'a';
		char c = 19;
	}
	
	
	static void getOutput(String input) {
		int digitCount = 0, letterCount = 0, upperCount = 0, lowerCount = 0, specialCharCount = 0;
		
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if(ch >48 && ch <=57)
				digitCount++;
			else if(ch >= 65 && ch<=90 || ch>=97 && ch<=122 ) {
				letterCount++;
				if(ch >= 65 && ch<=90 )
					upperCount++;
				else if(ch >= 97 && ch <= 122)
					lowerCount++;			
			}
			else if(ch >=33 && ch<= 47 || ch>= 58 && ch <= 64 || ch>=91 && ch<=96)
				specialCharCount++;
		}
		
		System.out.println("Digit Count : "+digitCount);
		System.out.println("Letter Count : "+letterCount);
		System.out.println("Upper Count : "+upperCount);
		System.out.println("Lower Count : "+lowerCount);
		System.out.println("SpecialChar Count : "+specialCharCount);
	}
	
	public static void main(String[] args) {
		getOutput("1rRpd3F9#K(E");
		//getAscii();
	}

}