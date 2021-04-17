//Find one character frequency from given name.

package krati_Shukla.String;

public class OneCharFreq {
	
	void Frequency(String str, char ch) {
		int count=0;
		
		int length = str.length();
		for(int index=0; index<length; index++) {
			if(str.charAt(index) == ch)
				count++;
		}
		System.out.println(ch+" -> "+count+" times in "+str);
	}
	
	public static void main(String[] a) {
		OneCharFreq oneCharFreq = new OneCharFreq();
		String input = "technocredits";
		char ch = 'e';
		oneCharFreq.Frequency(input,ch);
	}

}
