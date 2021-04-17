/* Assignment 22:
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
package radha.ModularPrograms.Assigment22;

public class Assignment22 {

	void findFrequency(String str, char ch) {
		int counter = 0;
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == ch)
				counter++;
		}
		System.out.println("Frequency of " + ch + " is " + counter+" in "+str);
	}

	void findAllCharFreq(String word) {
		for (int index = 0; index < word.length(); index++) {
			if (index == word.indexOf(word.charAt(index)))
				findFrequency(word, word.charAt(index));
		}
	}
	
	void getAllCharFreqArray(String []str) {
		for(int arrIndex = 0; arrIndex < str.length; arrIndex++) {
			findAllCharFreq(str[arrIndex]);
			System.out.println("===================================");
		}
	}

	public static void main(String[] args) {
		Assignment22 assignment22 = new Assignment22();
		String input = "technocredits";
		assignment22.findFrequency(input, 'e');
		System.out.println("=============================================");
		assignment22.findAllCharFreq("aakanksha");
		System.out.println("=============================================");
		String []arr = {"raj", "aarya", "aavruti", "shruti"};
		assignment22.getAllCharFreqArray(arr);
	}
}
