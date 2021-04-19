package mayur.assignment17;

public class IsNumberPresent {
	boolean isNumberPresent(int[] input, int findNum) {
		boolean isNumPresent = false;
		for(int index=0; index<input.length; index++) {
			if(input[index] == findNum)
				isNumPresent = true;
			}
		return isNumPresent;
	}	

	public static void main(String[] args) {
		int[] input = {10,23,23,44,23,10,23,4,23};
		int findNum = 45;
		if(new IsNumberPresent().isNumberPresent(input, findNum))
			System.out.println("Number "+findNum +" found in given array.");
		else
			System.out.println("Number "+findNum +" does not found in given array.");
	}
			
	}


