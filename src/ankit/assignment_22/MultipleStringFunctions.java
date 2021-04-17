package assignment_22;

public class MultipleStringFunctions {

	void getCharFrequencey(String str, char targetCharacter) {
		int charCount = 0;
		for(int index = 0 ; index < str.length() ; index++)
			if (targetCharacter == str.charAt(index)) {
				charCount++;
			}System.out.println(targetCharacter+ " -> "+charCount+" times in "+str);
	}

	void getAllCharacterFrequency(String str) {
		for(int index = 0; index < str.length();index++) {
			if(index == str.indexOf(str.charAt(index))) {
				getCharFrequencey(str, str.charAt(index));
			}
		}
	}

	void getArrayOfStringCharCount(String[] arr) {
		for (int index = 0 ; index < arr.length; index++) {
			System.out.println("--------------");
			getAllCharacterFrequency(arr[index]);
		}
	}

	public static void main(String[] args) {
		MultipleStringFunctions multipleStringFunctions = new MultipleStringFunctions();
		String str = "technocredits";
		//multipleStringFunctions.getAllCharacterFrequency(str);
		String[] arr = {"raj", "aarya", "aavruti", "shruti"};
		multipleStringFunctions.getArrayOfStringCharCount(arr);

	}
}

/*
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

Guys, please confirm assignment number - it should be 22, correct ?
 */
