/*Create a class with following functionality. [Estimated time: 40 mins]
a) Find one character frequency from given name.
     Input: name - technocredits
               character - e
     Output : e -> 2 time in technocredits

b) Find all character frequency from given name.
     Input: name - aakanksha
     Output : a -> 4
	          k -> 2
              n -> 1
              s -> 1
              h -> 1
             
c) Find all character frequency from each name given in String array.
     Input : Array -> {"raj", "aarya", "aavruti", "shruti"}
     Output : r -> 1 time in raj
              a -> 1 time in raj
              j -> 1 time in raj
         =====================
	     a -> 3 time in aarya
             r -> 1 time in aarya
              y -> 1 time in aarya
         ====================
         And so on....	-------------------------------*/

package sangeeta.CharacterClassprograms2;

import java.util.Scanner;

public class FrequencyOfCharInArray {
	
	void freqOfCharInName(String str, char ch) {
		int count =0;
		for (int i = 0; i < str.length(); i++) {
			char strchar = str.charAt(i); 
			if(strchar == ch)
				count++;
		}
			System.out.println("Frequency of "+ ch+ " in a given string is "+count);
	}
	
	void freqOfAllLetters(String str) {
		System.out.println("-----------------------------------------------------------");
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(i == str.indexOf(ch))
				freqOfCharInName(str, ch);	
		}
	}
	
	void freqOfAllLettersInNameArray(String[] names) {
		System.out.println("-----------------------------------------------------------");
		for(int i = 0; i<names.length; i++) {
			String str1 = names[i];
			freqOfAllLetters(str1);
		}
	}
	
	public static void main(String[] a) {
		FrequencyOfCharInArray frequencyOfCharInArray = new FrequencyOfCharInArray();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Name ");
		String str = scanner.next();
		System.out.println("Enter Target Character ");
		String TargetChar = scanner.next();
		char ch = TargetChar.charAt(0);
		System.out.println("Enter size of array");
		int size = scanner.nextInt();
		String [] names = new String[size];
		System.out.println("Enter String Array ");
		for(int i = 0; i<names.length; i++) {
			names[i] = scanner.next();
		}
		frequencyOfCharInArray.freqOfCharInName(str,ch);
		frequencyOfCharInArray.freqOfAllLetters(str);
		frequencyOfCharInArray.freqOfAllLettersInNameArray(names);
	}
	
}
