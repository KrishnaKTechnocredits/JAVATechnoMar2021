package sandesh.Assignment_32;

public class SwapStringsWithoutTemp {

	String[] getSwapppedStringsWithoutTemp(String str1, String str2) {
		str1 = str1+str2;
		//System.out.println(str1);
		str2 = str1.substring(0, str1.length()-str2.length());
		str1 = str1.substring(str1.length()-str2.length()-1, str1.length());
		String[] returnedArray = {str1, str2 };
		return returnedArray;
	}

	public static void main(String[] args) {
		String input1 = "Techno";
		String input2 = "Credits";
		String[] swappedArray = new SwapStringsWithoutTemp().getSwapppedStringsWithoutTemp(input1, input2);
		System.out.println("Initial state ---> " + " input1: " + input1 + ", input2: " + input2);
		System.out.println("After swap ---> " + " input1: " + swappedArray[0] + ", input2: " + swappedArray[1]);
	}
}
