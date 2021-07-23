package gauravk.Assignment_22;
/*
 * After Lecture - 14th_April_Session-23_Character_Class_Ascii_Value Assignment - 22 : 16th April'2021
Create a class with following functionality. [Estimated time: 40 mins]
a) Find one character frequency from given name.
Input: name - technocredits
character - e
Output : e -> 2 time in technocredits
 */
public class FrequencyCharacterInString {
	
	int frequencyFinder(String str, char c) {
		char [] ch = new char[str.length()];
		for(int i=0; i<str.length(); i++) {
			ch[i] = str.charAt(i);
		}
		int counter=0;
		for(int i=0; i<ch.length; i++) {
			if(ch[i]==(c))
				counter++;
		}
		return counter;
	}
	
	public static void main(String[] a) {
		int ctr = new FrequencyCharacterInString().frequencyFinder("technocredits", 'e');
		System.out.println("The target character is repeated "+ctr+" times in technocredits.");
	}

}
