package monika.Assignment15_16_both;

/*Assignment - 16 : 9th April'2021

Find the frequency of character from a given String array.
Note: Take String and character from the user using scanner class.

Input : technocredits
char : e
output : e -> 2*/
import java.util.Scanner;

public class IdentifyFrequencyOfChar {
	
	void getFrequencyOfChar(String s, char c) {
		int count = 0;
		for(int i = 0;i<s.length();i++) {
			if(Character.toUpperCase(s.charAt(i)) == Character.toUpperCase(c))
				count++;
		}System.out.println("Char : "+c+" appeared - "+count+" times in string "+s);
	}
	
	void getFrequencyOfCharDiffApproach(String s, char c) {
		int count = 0;
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i) == c)
				count++;
		}System.out.println("Char : "+c+" appeared - "+count+" times in string "+s);
	}
	
	void getFrequencyOfCharDiffApproach1(String s, char c) {
		int count = 0;
		String str = s.toUpperCase();
		char ch = Character.toUpperCase(c);
		
		for(int i = 0;i<str.length();i++) {
			if(str.charAt(i) == ch)
				count++;
		}System.out.println("Char : "+ch+" appeared - "+count+" times in string "+str);
	}
	
	public static void main(String[] args) {
		IdentifyFrequencyOfChar obj = new IdentifyFrequencyOfChar();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string 1 : ");
		obj.getFrequencyOfChar(sc.nextLine(),sc.next().charAt(0));
		sc.nextLine();
		
		System.out.println("Enter your string 2: ");
		obj.getFrequencyOfCharDiffApproach(sc.nextLine().toUpperCase(),Character.toUpperCase(sc.next().charAt(0)));
		sc.nextLine();
		
		System.out.println("Enter your string 3: ");
		String s = sc.nextLine();
		System.out.println("Enter your character : ");
		char c = sc.next().charAt(0);
		obj.getFrequencyOfCharDiffApproach1(s, c);
	}

}
