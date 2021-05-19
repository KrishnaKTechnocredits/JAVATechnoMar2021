/*
Test -6 : [Complexity : Easy]
Find a Character having a maximum frequency.
input : globant india is hiring
output : i
*/
package shashank.coding_exam_6;

public class MaxFreqencyChar {

	public char getMaxFrequency(String str) {
		char ch=' ';
		int count[] = new int[127];
		for (int index = 0; index < str.length(); index++) {
			ch = str.charAt(index);
			count[ch]++;
		}
		int max = count[97];
		for (int index = 97; index < count.length; index++) {
			if (count[index] > max) {
				max = count[index];
				ch = (char)index;
			}
		}
		return ch;

	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxFreqencyChar maxFreqencyChar = new MaxFreqencyChar();
		String str = "globant india is hiring";
		char ch=maxFreqencyChar.getMaxFrequency(str);
		System.out.println("Maximun occurance charcter is "+ch);
	}

}
