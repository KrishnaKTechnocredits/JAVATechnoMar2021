/*  Assignment - 22 :  16th April'2021

Create a class with following functionality. [Estimated time: 40 mins]
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
         And so on....	-------------------------------
 */

package amruta.Assignment_22;

import java.util.Scanner;

public class FindFrequency {
	
//----------- a) one char frequency from given name -----------------
	
	void singleCharFrequency(String input,char target) {
		
		input = input.toUpperCase();
		target=Character.toUpperCase(target);
		
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == target)
				count++;
		}
		System.out.println("Frequency of "+target+" in "+input+" is --> "+count+"times");
	}
	
//------------- b) all character frequency from given name--------------
	
	void allCharFrequency(String input) {
		for (int index = 0; index < input.length(); index++) {   // this loop 
			char ch = input.charAt(index);
			if (index == input.indexOf(ch))	
				
				singleCharFrequency(input, ch);
		}
	}
	
//-------------c)all char frequency from each name given in string array------------
	
	void allCharInArrayfrequency(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			allCharFrequency(arr[index]);
			System.out.println("-------------------------------------------");
		}
	}

	public static void main(String[] args) {

		FindFrequency charFrequency = new FindFrequency();
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n----------------Frequency of target Character ---------------------------\n");
		System.out.println("Enter the String : ");
		String str = scanner.nextLine();
		System.out.println("Enter "
				+ "the Character to know the frequency : ");
		String str1 = scanner.next();
		char ch = str1.charAt(0);
		charFrequency.singleCharFrequency(str,ch);
		
		System.out.println("\n----------------Frequency of Characters in Given String---------------------------\n");
		
		//String input ="akanksha";
		System.out.println("Enter the String to know the frequency of every character : ");
		String input = scanner.next();
		charFrequency.allCharFrequency(input);
		
		System.out.println("\n--------------Frequency of Characters in given ARRAY of String----------------------\n");
		
		System.out.println("How many String elements you want in Array : ");
		int no = scanner.nextInt();
		System.out.println("Enter the Array elements : ");
		String[] arrofString = new String[no];
		
		for(int index = 0;index<arrofString.length;index++) {
			
			System.out.println("Enter the name:");
			String name = scanner.next();
			arrofString[index] = name;
		}
		//String[] arrofString = {"raj","aarya","aavruti","shruti"};
		charFrequency.allCharInArrayfrequency(arrofString);	

	}
	
}