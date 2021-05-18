package purva.Assignment_25;

public class ReturnStringWithNumbers {
	
	String getStringWithNumber(String input) {
		String containsDigit ="";
		for(int index = 0;index<input.length();index++) {
			if(Character.isDigit(input.charAt(index)))
				containsDigit = input;			
		}
		return containsDigit;
	}
	
	String[] processArrayInput(String[] input) {
		String[] output = new String [input.length];
		for(int index = 0;index<input.length;index++) {
			output[index] = getStringWithNumber(input[index]);   	
	    }
		return output;
	}
	
	
	
	public static void main(String[] a) {
		ReturnStringWithNumbers returnStringWithNumbers = new ReturnStringWithNumbers();
		String[] input = {"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"};
		String[] finalOutput=returnStringWithNumbers.processArrayInput(input);	
		for(int index=0; index<finalOutput.length; index++) {
			if(finalOutput[index] != null)
				System.out.print(finalOutput[index]+" ");
		}
	}
}
