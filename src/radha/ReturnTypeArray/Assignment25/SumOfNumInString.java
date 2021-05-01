/*
Program 3:  Write a method which will return sum of each all numbers in each String. Main method should print the output.
Input : {"Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9","Kan3gan4", "1Sandesh3"}
Output : 6 14 12 15 7 4
 */
package radha.ReturnTypeArray.Assignment25;

public class SumOfNumInString {
	
	int[] getSumOfNumbersInString(String[] name) {
		int[] output = new int[name.length];
		for (int index = 0; index < name.length; index++) {
			int sum =0;
			for (int strIndex = 0; strIndex < name[index].length(); strIndex++) {
				char letter = name[index].charAt(strIndex);
				if(Character.isDigit(letter)) {
					sum+=Character.getNumericValue(letter);
					output[index] = sum;
				}
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		SumOfNumInString sum = new SumOfNumInString();
		String[] names = {"Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9","Kan3gan4", "1Sandesh3"};
		int[] sumArr= sum.getSumOfNumbersInString(names);
		System.out.println("An Array of Sum of the numbers in each string");
		for (int i=0; i< sumArr.length;i++) {
			System.out.print(sumArr[i]+" ");
		}
	}
}
