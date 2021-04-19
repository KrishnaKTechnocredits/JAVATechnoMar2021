package meenu.assignment_22;

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
         And so on....	
*/
import java.util.Scanner;

public class CharFrequency {

	int getFreqOfTargetChar(String word, char targetChar) {
		int count = 0;
		for (int index = 0; index < word.length(); index++)
			if (word.charAt(index) == targetChar)
				count++;
		return count;
	}

	void getFreqOfAllChar(String word2) {
		for (int index = 0; index < word2.length(); index++) {
			int count = 0;
			char ch = word2.charAt(index);
			if (index == word2.indexOf(ch)) {
				count++;
				for (int innerIndex = index + 1; innerIndex < word2.length(); innerIndex++)
					if (ch == word2.charAt(innerIndex))
						count++;
				System.out.println("Count of '"+ch+"' in "+word2+" -> " + count);
			} else
				continue;
		}
	}
	
	void getFreqOfStrings(String[] arr) {
		for(int index = 0;index<arr.length;index++) {
			int count = 0;
			String word3 = arr[index];
			getFreqOfAllChar(word3);
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name : ");
		String word = scanner.next();
		System.out.println("Enter the character");
		String word1 = scanner.next();
		char ch = word1.charAt(0);
		CharFrequency charFrequency = new CharFrequency();
		System.out.println("Frequency of character "+ch+" in given string is : "+(charFrequency.getFreqOfTargetChar(word, ch)));		
	    System.out.println("Enter string : ");
	    String word2 = scanner.next();
	    charFrequency.getFreqOfAllChar(word2);
		System.out.println("how many names you want to enter: ");
		int size = scanner.nextInt();
		String[] names = new String[size];
		
		for(int index = 0;index<names.length;index++) {
			System.out.println("Enter the name:");
			String name = scanner.next();
			names[index] = name;
		}			
		charFrequency.getFreqOfStrings(names);		
	}
}
