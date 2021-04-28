package purva.Assignment_26;

public class ReturnMaxDigitString {
	
	String maxDigitString(String[] input) {
		int max = 0;
		String maxDigit ="";
		for(int index = 0;index<input.length;index++) {
			int count =0;
			for(int innerIndex =0;innerIndex<input[index].length();innerIndex++) {
				if(Character.isDigit(input[index].charAt(index))){
					count++;
				}
			}
			if(count>max) {
				max =count;
				maxDigit = input[index];
			}
		}
		System.out.println("output: "+maxDigit);
		return maxDigit;
	}
	
	public static void main(String [] a) {
		String[] input = {"P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93"};
		ReturnMaxDigitString returnMaxDigitString = new ReturnMaxDigitString();
		returnMaxDigitString.maxDigitString(input);
		
	}

}
