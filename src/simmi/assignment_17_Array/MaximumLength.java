/*Program 8:  return the name having maximum length.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : Technocredits*/

package simmi.assignment_17_Array;

public class MaximumLength {
	
	String maxLength() {
		String[] str = {"Maulik", "Krishna", "Technocredits", "Upasana", "Harsh"};
		String maxIndex = str[0];
		for(int index = 1; index<str.length; index++) {
			if(maxIndex.length() < str[index].length()) {
				maxIndex = str[index]; 
			}
		}
		return maxIndex;
	}
	
	public static void main(String[] args) {
		MaximumLength maximumLength = new MaximumLength();
		String maximum = maximumLength.maxLength();
		System.out.println(" Maximum length of the name in the given array is "+maximum);
	}
}
