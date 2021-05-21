/*
 * Assignment - 22 : 16th April'2021
Create a class with following functionality. [Estimated time: 40 mins]
a) Find one character frequency from given name.
Input: name - technocredits
character - e
Output : e -> 2 time in technocredits
 */

package kajal.StringAndCharProgram;

public class Assignment22p1 {

	void charFrequency(String input, char target) {
		int cnt=0;
			for(int index=0; index<input.length(); index++)
			if(input.charAt(index)==target)
				cnt++;
				System.out.println("Frequency of target character is: "+ cnt);
	}
	
	public static void main(String [] args) {
		String str= "technocredits";
		char target = 'e';
		new Assignment22p1 ().charFrequency(str,target);
	}
}
