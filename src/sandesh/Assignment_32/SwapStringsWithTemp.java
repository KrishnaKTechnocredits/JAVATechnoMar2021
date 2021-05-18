package sandesh.Assignment_32;

public class SwapStringsWithTemp {

	String[] getSwapppedStringsWithTemp(String str1, String str2) {
		String temp = str1;
		str1 = str2;
		str2 = temp;
		String[] returnedArray = {str1, str2 };
		return returnedArray;
	}

	public static void main(String[] args) {
		String input1 = "Techno";
		String input2 = "Credits";
		String[] swappedArray = new SwapStringsWithTemp().getSwapppedStringsWithTemp(input1, input2);
		System.out.println("Initial state ---> " + " input1: " + input1 + ", input2: " + input2);
		System.out.println("After swap ---> " + " input1: " + swappedArray[0] + ", input2: " + swappedArray[1]);
	}
}
	
