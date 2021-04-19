/*Program 9: return the index having maximum length from given string array.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : 2*/

package simmi.assignment_17_Array;

public class MaximumIndex {
	
	int maxLength() {
		int index1 = 0;
		String[] str = {"Maulik", "Krishna", "Technocredits", "Upasana", "Harsh"};
		String maxIndex = str[0];
		for(int index = 1; index<str.length; index++) {
			if(maxIndex.length() < str[index].length()) {
				maxIndex = str[index]; 
				index1 = index;
			}
		}
		return index1;
	}
	
	public static void main(String[] args) {
		MaximumIndex maximumIndex = new MaximumIndex();
		int maximum = maximumIndex.maxLength();
		System.out.println(" Maximum length index is "+maximum);
	}
}
