/*
Assignment - 22 :  16th April'2021

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

package paras.Assignment_22;

public class CharFrequency {
	
	void printCharFrequency(String input, char Target) {
		int count = 0;
		for(int index = 0; index < input.length(); index++) {
			if(input.charAt(index) == Target)
				count++;
		}
		System.out.println("Frequency of " + Target + " is - " + count);
	}
	
	void printFrequencyOfAllChar(String input) {
		for(int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if(input.indexOf(ch) == index)
				printCharFrequency(input, ch);
		}
	}
	
	void CharFrequencyFromArr(String[] input) {
		for(int index = 0; index < input.length; index++) {
			printFrequencyOfAllChar(input[index]);
		}
	}
	
	public static void main(String[] args) {
		CharFrequency charFrequency = new CharFrequency();
		System.out.println("Particular Character Frequency from String");
		charFrequency.printCharFrequency("technocredits", 'e');
		System.out.println("\nAll Characters Frequency from String");
		charFrequency.printFrequencyOfAllChar("aakanksha");
		System.out.println("\nAll Characters Frequency from String array");
		String[] arr = {"raj", "aarya", "aavruti", "shruti"};
		charFrequency.CharFrequencyFromArr(arr);
	}
}
