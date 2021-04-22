/*
 * /*
 * 1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters
 *  without using Character class  function.
 */
package rupali.assignment21;
import java.util.Scanner;

public class CharCount {
	int ucount=0;
	int lcount=0;
	int numcount=0;
	int scount=0;
	int lettercount;
	
	void lettercount(String s) {
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch>=65 && ch<=90  || ch>=97 && ch<=122)
					lettercount++;
		}	
			System.out.println("Total letters present in a String are " + lettercount);
			
		
	}
	
	void digitcount(String s) {
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch>=48 && ch<=57)
					numcount++;
		}
			System.out.println("Total letters present in a String are " + numcount);
			
		
	}
	
	void ucasecount(String s) {
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch>=65 && ch<=90 )
					ucount++;
		}	System.out.println("Total letters present in a String are " + ucount);
	}
	
	void lcasecount(String s) {
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch>=97 && ch<=122)
					lcount++;
		}
		System.out.println("Total letters present in a String are " + lcount);
	}
	
	void specialcasecount(String s) {
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 32 && ch <= 47 || ch >= 58 && ch <= 64 || ch >= 91 && ch <= 96 || ch >= 123 && ch <= 126)
					scount++;
		}
		System.out.println("Total letters present in a String are " + scount);
	}
		
	public static void main(String[] args) {
		CharCount charCount=new CharCount();
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		charCount.lettercount(str);
		charCount.ucasecount(str);
		charCount.lcasecount(str);
		charCount.digitcount(str);
		charCount.specialcasecount(str);
		
	}
	

}
