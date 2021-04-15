//Program 1: Write a method which will return "Techno" if Uppercase character count is higher then LowerCase character count, otherwise return "Credits". Print output in main method.
package prashant.Assignment_19;

import java.util.Scanner;

public class CharLowerUpperCnt {

	String upperlowercnt(String str) {
		int uppcasecnt = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z')
				uppcasecnt++;
		}
		if (uppcasecnt > str.length() - uppcasecnt)
			return "Techno";
		else
			return "Credits";
	}

	public static void main(String[] args) {
		CharLowerUpperCnt upperlower = new CharLowerUpperCnt();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String str = sc.next();
		String str1 = upperlower.upperlowercnt(str);
		System.out.println(str1);
		sc.close();
	}
}