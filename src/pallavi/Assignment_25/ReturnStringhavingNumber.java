package pallavi.Assignment_25;

/*Write a method which will return all String from given array which contains atleast one number. Main method should print the output.
Input : {"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"}
Output : HP1w Pd3R4K9 Aashvi25*/

public class ReturnStringhavingNumber {

	boolean checkDigit(String name) {
		int index;
		boolean flag = false;
		for (index = 0; index < name.length(); index++) {
			if (Character.isDigit(name.charAt(index))) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	String[] nameArray(String[] arr) {
		String[] output = new String[arr.length];
		int indexOut = 0;
		for (int index = 0; index < arr.length; index++) {
			boolean checkIndex = checkDigit(arr[index]);
			if (checkIndex) {
				output[indexOut] = arr[index];
				indexOut++;
			}
 
		}
		return output;

	}

	public static void main(String[] args) {
		String[] name = { "TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25" };
		ReturnStringhavingNumber returnStringhavingNumber = new ReturnStringhavingNumber();
		String[] newOutput = returnStringhavingNumber.nameArray(name);
		for (int index = 0; index < newOutput.length; index++) {
			if (newOutput[index] != null) {
				System.out.print(" " + newOutput[index] + " ");
			}

		}

	}
}
