/*
 * Assignment - 22 : 16th April'2021
b) Find all character frequency from given name.
Input: name - aakanksha
Output : a -> 4
k -> 2
n -> 1
s -> 1
h -> 1
 */

package kajal.StringAndCharProgram;

public class Assignment22p2 {

	void frequency(String input) {
		
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (index == input.indexOf(ch)) {
				frequencyOfTargetChar(input, input.charAt(index));
			}
		}
	}
		void frequencyOfTargetChar(String input, char target) {
			int cnt=0;
				for(int index=0; index<input.length(); index++)
				if(input.charAt(index)==target)
					cnt++;
					System.out.println("Frequency of "+target+ " is: "+ cnt);
	}
	
		public static void main(String [] args) {
		String str= "aakanksha";
		new Assignment22p2().frequency(str);
	}
}
