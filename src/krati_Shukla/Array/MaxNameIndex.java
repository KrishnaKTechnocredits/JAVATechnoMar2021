//Program 8: return the name having maximum length.
//Program 9: return the index having maximum length from given string array.

package krati_Shukla.Array;

public class MaxNameIndex {
	
	int MaximumIndex(String[] input) {
		int index;
		String maxName = input[0];
		int maxLength = input[0].length();
		for(index=0; index<input.length; index++) {
			if (maxLength <input[index].length()) { 
				maxLength = input[index].length();
				maxName = input[index];
			}
		}
		System.out.println("Maximum length of "+maxName+" is "+maxLength );
		return index-1;
		
	}
	
	public static void main(String[] a) {
		MaxNameIndex maxNameIndex = new MaxNameIndex();
		String[] input = {"Maulik", "Krishna", "Technocredits", "Kangan", "Harshtechnocredits"};
		int index = maxNameIndex.MaximumIndex(input);
		System.out.println("The index of name with maximum length is "+index );
	}

}
