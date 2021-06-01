package madhavi_Khasbage.ArrayPrograms;

/*Program 3:  Write a method which will return sum of each all numbers in each String. Main method should print the output.
Input : {"Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9","Kan3gan4", "1Sandesh3"}
Output : 6 14 12 15 7 4*/

public class SumOfNumInString {

	String findStringHavingNum(String[] arrStr) {
		String finalString = "";
		int sum = 0;
		for (int index = 0; index < arrStr.length; index++) {
			for (int index1 = 0; index1 < arrStr[index].length(); index1++) {
				if (Character.isDigit(arrStr[index].charAt(index1)) == true) {
					sum += Integer.parseInt(String.valueOf(arrStr[index].charAt(index1)));					
				}
			}
			finalString += sum + " ";
			sum = 0;
		}
		return finalString;
	}

	public static void main(String[] args) {
		SumOfNumInString numInStr = new SumOfNumInString();
		String[] arr = { "Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9", "Kan3gan4", "1Sandesh3" };
		System.out.println(numInStr.findStringHavingNum(arr));
	}
}
