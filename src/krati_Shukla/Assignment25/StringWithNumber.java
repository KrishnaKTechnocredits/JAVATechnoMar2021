//Write a method which will return all String from given array which contains atleast one number. Main method should print the output.

package krati_Shukla.Assignment25;


public class StringWithNumber {
	
	String[] IsNumberPresent(String[] input) {
		 int length = input.length;
		 String[] output = new String[10];
		 
		 for(int index=0; index<length; index++) {
			 String newInput = input[index];
			 int newLength = newInput.length();
			 for (int newIndex=0; newIndex<newLength; newIndex++) {
				 char ch = newInput.charAt(newIndex);
						 if(Character.isDigit(ch)) {
							output[index] = newInput;
							break;
						 }
			 }
		 }
		return output;
	}
	
	public static void main(String[] a) {
		StringWithNumber stringWithNumber = new StringWithNumber();
		String[] str = {"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"};
		String[] out = stringWithNumber.IsNumberPresent(str);
		for(int i=0; i<out.length; i++) {
			if(out[i] != null)
				System.out.println(out[i]);
		}
	}

}
