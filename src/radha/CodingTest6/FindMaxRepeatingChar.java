/*
Test -6 : [Complexity : Easy]
Find a Character having a maximum frequency.

input : globant india is hiring

output : i
 */
package radha.CodingTest6;

public class FindMaxRepeatingChar {
	
	char getMaxRepeatingCharacter(String input) {
		int max=0;
		char ch = ' ';
		for(int index=0; index<input.length();index++) {
			int count =0;
			char result1 = input.charAt(index);
			for(int innerIndex=index+1;innerIndex<input.length();innerIndex++) {
				char result2 = input.charAt(innerIndex);
				if(result1==result2) {
					count++;
				}
				if(count>max) {
					max=count;
					ch=result1;
				}
			}
		}
		return ch;
	}
	
	public static void main(String[] args) {
		FindMaxRepeatingChar repeatingChar = new FindMaxRepeatingChar();
		String input = "globant india is hiring";
		input = input.replaceAll(" " , "");
		char output = repeatingChar.getMaxRepeatingCharacter(input);
		System.out.println("Maximum occuring character is : "+output);
	}

}
