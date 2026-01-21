package amrutaM.stringAssignments;

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
*/
public class CharFrequency {

	void getCharFrequency(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch)
				count++;
		}
		System.out.println("Frequency of " + ch + " is : " + count);
	}

	void getAllCharFreq(String input) {
		int count1 = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (index == input.indexOf(ch))
				getCharFrequency(input, input.charAt(index));
		}
	}

	public static void main(String[] args) {
		String name = "aakanksha";
		CharFrequency charFrequency = new CharFrequency();
		charFrequency.getAllCharFreq(name);
	}

}
