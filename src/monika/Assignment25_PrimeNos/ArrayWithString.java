package monika.Assignment25_PrimeNos;
/*Program 2: Write a method which will return all String from given array which contains atleast one number. Main method should print the output.
Input : {"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"}
Output : HP1w Pd3R4K9 Aashvi25*/

public class ArrayWithString {

	String[] getStringHavingOneNumber(String[] arr) {
		String[] resultArr = new String[3];
		int count = 0;
		//boolean isDigitFlag = false;
		for (int index = 0; index < arr.length; index++) {
			for (int innerindex = 0; innerindex < arr[index].length(); innerindex++) {
				if (Character.isDigit(arr[index].charAt(innerindex))) {
					resultArr[count] = arr[index];
					count++;
					break;
				}
			/*		isDigitFlag = true;
				} else 
					if (isDigitFlag) {
						isDigitFlag = false;
						break;
					}*/
			}
		}
		return resultArr;
	}

	public static void main(String[] args) {
		ArrayWithString obj = new ArrayWithString();
		String[] arr = {"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"};
		String[] captureResultArr;
		captureResultArr = obj.getStringHavingOneNumber(arr);
		for(int count=0;count<captureResultArr.length;count++)
			System.out.println(captureResultArr[count]);
	}

}
