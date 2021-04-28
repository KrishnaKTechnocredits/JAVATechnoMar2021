/*Program 3: Write a method which will return sum of each all numbers in each String. Main method should print the output.
Input : {"Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9","Kan3gan4", "1Sandesh3"}
Output : 6 14 12 15 7 4*/

package monika.Assignment25_PrimeNos;

public class PrintSumOfDigitsInString {
	int[] getSumOfDigits(String[] arr) {
		int[] resultArr = new int[arr.length];
		int sum = 0;
		boolean flag = false;
		for (int index = 0; index < arr.length; index++) {
			for (int innerindex = 0; innerindex < arr[index].length(); innerindex++) {
				if (Character.isDigit(arr[index].charAt(innerindex)))
					sum += Character.getNumericValue((arr[index].charAt(innerindex)));
			}
			if(sum > 0 ) {
				resultArr[index] = sum;
				sum = 0;
			}
		}
	return resultArr;}

	public static void main(String[] args) {
		PrintSumOfDigitsInString obj = new PrintSumOfDigitsInString();
		String[] arr = {"Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9","Kan3gan4", "1Sandesh3"};
		int [] captureResultArr = new int[arr.length];
		captureResultArr = obj.getSumOfDigits(arr);
		for(int count=0;count<captureResultArr.length;count++)
			System.out.println(captureResultArr[count]);	
	}
}
