//Find all character frequency from each name given in String array.

package krati_Shukla.String;

public class AllCharFreqString {
	
	void CheckAllNames(String[] input) {
		
		AllCharFreq allChar = new AllCharFreq();
		int length = input.length;
		
		for(int i=0; i<length; i++) {
			String str = input[i];
			for(int index=0; index<str.length(); index++) {
				char ch = str.charAt(index);
				if(str.indexOf(ch) == index)
					allChar.Frequency(ch, str);
			}
		}
	}
	
	
	public static void main(String[] a) {
		AllCharFreqString allCharFreqString = new AllCharFreqString();
		String[] input = {"raj", "aarya", "aavruti", "shruti"};
		allCharFreqString.CheckAllNames(input);
	}

}
