package mayur.assignment25;

public class NumberStrings {
	String[] getNumberStrings(String[] input) {
		
		String[] arrNum = new String[5];
		int index = 0;
		for (int num = 0; num < input.length; num++) { 
			boolean digitFlag = false;
			for (int innerNum = 0; innerNum < input[num].length(); innerNum++) {
				
				char chartoCheck = input[num].charAt(innerNum);
				if (Character.isDigit(chartoCheck)) {
					digitFlag = true;
					break;
				}
				
			}
			if (digitFlag == true) {
				arrNum[index] = input[num];
				index++;
			}
			
		}
		
		return arrNum;
		
	}
	public static void main(String[] args) {

		NumberStrings string = new NumberStrings();

		String[] input = { "TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25" };
		String[] arrString = string.getNumberStrings(input);

		System.out.println("Strings in the array with atleast 1 number in them are : ");
		for (int num = 0; num < arrString.length; num++) {
			if (arrString[num] != null)
				System.out.println(arrString[num]);

		}
	}


}


