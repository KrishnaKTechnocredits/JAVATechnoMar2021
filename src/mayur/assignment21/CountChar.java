package mayur.assignment21;

import java.util.Scanner;

public class CountChar {

	void getStringCount(String str) {

		int upperCaseCnt = 0;
		int lowerCaseCnt = 0;
		int digits = 0;
		int letters = 0;
		int specialChar = 0;

		for(int index = 0;index<str.length();index++) {
			if(str.charAt(index)>=65 && str.charAt(index)<=90) { 
				upperCaseCnt++;
				letters++;
			}

			else if(str.charAt(index)>=97 && str.charAt(index)<=122) { 
					lowerCaseCnt++;
					letters++;
			}



			else if(str.charAt(index)>=48 && str.charAt(index)<=57) 
				digits++;

			else
				specialChar++;

			System.out.println("Upper case letters present in string are: " +upperCaseCnt);
			System.out.println("Lower case letters present in string are: " +lowerCaseCnt);
			System.out.println("Digits present in string are: " +digits);
			System.out.println(" Special Characters present in string are: " +specialChar);
			System.out.println("Letters present in string are: " +letters);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string: " );
		CountChar count = new CountChar();
		String str = scanner.next();
		count.getStringCount(str);
		scanner.close();
	}

} 