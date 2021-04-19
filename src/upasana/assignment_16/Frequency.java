package upasana.assignment_16;

import java.util.Scanner;

public class Frequency {
	int count=0;
	void freqChar(String word,char ch) {
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)==ch){
				count++;
			}
		}
		System.out.println("e-> " +count );
	}
	
	public static void main(String[] args) {
		Frequency frequency = new Frequency();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.next();
		System.out.println("Enter character to find its frequency in the given string ");
		char ch = sc.next().charAt(0);
		frequency.freqChar(str,ch);
	}
}

