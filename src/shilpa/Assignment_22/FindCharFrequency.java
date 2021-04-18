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
*/
package shilpa.Assignment_22;

public class FindCharFrequency {

	void getCharFrequency(String str, char targetChar) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == targetChar)
				count++;
		}
		System.out.println(targetChar + " -> " + count + " Times in " + str);
	}

	void getAllCharFreq(String str) {
		for (int index = 0; index < str.length(); index++) {
			if (index == str.indexOf(str.charAt(index)))
				getCharFrequency(str, str.charAt(index));
		}
	}

	void getAllCharFreqinArray(String[] str) {
		for (int index = 0; index < str.length; index++) {
			getAllCharFreq(str[index]);
		}
	}

	public static void main(String[] args) {
		FindCharFrequency findCharFrequency = new FindCharFrequency();
		System.out.println("********Output of getCharFrequency********");
		findCharFrequency.getCharFrequency("technocredits", 'e');
		System.out.println("");
		System.out.println("********Output of getAllCharFrequency********");
		findCharFrequency.getAllCharFreq("aakanksha");
		System.out.println("");
		System.out.println("********Output of getAllCharFrequencyArray********");
		String[] str = { "raj", "aarya", "aavruti", "shruti" };
		findCharFrequency.getAllCharFreqinArray(str);
	}
}