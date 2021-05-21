/*Test -6 : [Complexity : Easy]
Find a Character having a maximum frequency.

input : globant india is hiring

output : i*/

package simmi.exam6;

public class CountCharacter {
	void count(String input) {
		int count = 1;
		int maxFreq = 0;
		char ch2 = ' ';
		
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == ' ')
			{
				
			}
			else {
				count = 1;
			
			for (int index1 = index + 1; index1 < input.length(); index1++) {
				char ch1 = input.charAt(index1);
				
				if (ch == ch1 && index == input.indexOf(ch))
					count++;
				}
			}
			if (count > maxFreq) {
				maxFreq = count;
				ch2 = ch;
			}
		}
		System.out.println("Frequency of " + ch2 + " " + maxFreq);
	}

	public static void main(String[] args) {
		String input = "globant india is hiring";
		CountCharacter countCharacter = new CountCharacter();
		countCharacter.count(input);
	}
}
