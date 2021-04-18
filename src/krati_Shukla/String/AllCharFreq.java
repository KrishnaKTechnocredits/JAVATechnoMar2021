//Find all character frequency from given name.

package krati_Shukla.String;

public class AllCharFreq {
	
	void Frequency(char ch, String str) { 
		int count=0;
		int length = str.length();
		for(int index=0; index<length; index++) {
			if(str.charAt(index) == ch)
				count++;
		}
		System.out.println(ch+ " -> "+count+ " time in "+str);
	}
	
	void CheckIndex(String str) {
		
		int length = str.length();
		for(int index=0; index<length; index++){
			char ch = str.charAt(index);
			if (str.indexOf(ch) == index)
				Frequency(ch, str);
		}
			
	}
		
	public static void main(String[] a) {
		AllCharFreq allCharFreq = new AllCharFreq();
		String input = "aakanksha";
		allCharFreq.CheckIndex(input);
	}

}
