/*
Find a Character having a maximum frequency.

input : globant india is hiring

output : i
 */

package pavan.PavanB_coding_exam_6;

public class MaxCharFrequency {
	
	char getMaxFrequencyChar(String input) {
		int maxCount = 0;
		int count = 0;
		char ch = ' ';
		
		for(int index = 0; index < input.length(); index++) {
			char ch1 = input.charAt(index);
			
			for(int innerindex = 0; innerindex < input.length(); innerindex++) {
				if(ch1 == input.charAt(innerindex)) 
					count++;
			}
			if(maxCount < count) {
				maxCount = count;
				count = 0;
				ch = ch1;
			}else {
				count = 0;
			}
		}
		return ch;
	}
	
	public static void main(String[] args) {
		MaxCharFrequency maxCharFrequency = new MaxCharFrequency();
		char output = maxCharFrequency.getMaxFrequencyChar("globant india is hiring");
		System.out.println("Character having a maximum frequency is : " + output);
	}
	
	

}
