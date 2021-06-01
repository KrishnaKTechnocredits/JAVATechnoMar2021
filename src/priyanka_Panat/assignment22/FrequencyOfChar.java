/*Assignment - 22 :  16th April'2021

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
package priyanka_Panat.assignment22;

public class FrequencyOfChar {

	void getCharFrequency(String str, char targetChar) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == targetChar)
				count++;
		}
		System.out.println("Frequency of character " + targetChar + " in given string " + str + " is : " + count);
	}

	void printAllCharFreq(String word) {
		for (int index = 0; index < word.length(); index++) {
			char ch = word.charAt(index);
			if (index == word.indexOf(ch))
				getCharFrequency(word, word.charAt(index));
		}
	}

	void printAllCharFreqinArray(String[] str) {
		for (int index = 0; index < str.length; index++) {
			printAllCharFreq(str[index]);
		}
	}

	public static void main(String[] args) {
		FrequencyOfChar frequencyOfChar = new FrequencyOfChar();
		frequencyOfChar.getCharFrequency("technocredits", 'e');
		System.out.println("-----------------------------------------------------");
		String word = "aakanksha";
		frequencyOfChar.printAllCharFreq(word);
		System.out.println("-----------------------------------------------------");
		String[] str = { "raj", "aarya", "aavruti", "shruti" };
		frequencyOfChar.printAllCharFreqinArray(str);

	}
}
