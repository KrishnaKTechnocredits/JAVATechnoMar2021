package gauravk.Assignment_22;
/*
 * After Lecture - 14th_April_Session-23_Character_Class_Ascii_Value Assignment - 22 : 16th April'2021
Create a class with following functionality. [Estimated time: 40 mins]
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
And so on.... -------------------------------
 */
public class FrequencyOfCharactersInStringArray {

	String[] s = {"raj","aarya","aavruti","shruti"};
	
	void stringArray(String[] str) {
		for(int i=0; i<str.length; i++) {
			characterFrequency(str[i]);
		}
	}
	
	void characterFrequency(String st) {
		for(int i=0; i<st.length(); i++) {
			char ch = st.charAt(i);
			if(i==st.indexOf(ch))
				characterFreq(st,ch);
		}
		System.out.println("===============");
	}
	
	void characterFreq(String string1, char c) {
		int count=0;
		for(int i=0; i<string1.length(); i++) {
			if(string1.charAt(i)==c)
				count++;
		}
		System.out.println(c+"--> "+count+" times in "+string1);
	}
	
	public static void main(String[] a) {
		FrequencyOfCharactersInStringArray frequencyOfCharactersInStringArray1 = new FrequencyOfCharactersInStringArray();
		frequencyOfCharactersInStringArray1.stringArray(frequencyOfCharactersInStringArray1.s);
	}
}
