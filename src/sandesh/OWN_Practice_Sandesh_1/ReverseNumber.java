package sandesh.OWN_Practice_Sandesh_1;

public class ReverseNumber {
	
	int getNumberReverse(int inputNum) {
		String numString = String.valueOf(inputNum);
		char[] chArray = numString.toCharArray();
		String reversedNumber = "";
		for (int reverseIndex = chArray.length-1; reverseIndex>=0; reverseIndex--)
			reversedNumber += chArray[reverseIndex];
		int reversedNumberInt = Integer.parseInt(reversedNumber); 
		return reversedNumberInt;
	}

	public static void main(String[] args) {
		int input = 123456;
		int reversedNum = new ReverseNumber().getNumberReverse(input);
		System.out.println(reversedNum);
	}
}
