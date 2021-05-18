/*Program 3: Write a method which will return sum of each all numbers in each String. 
Main method should print the 
 * output.*/
package shilpa.Assignment_25;

public class ReturnSumOfNosInStrOfArr {

	int[] getSumOfNosInStrOfArr(String[] str) {
		int num = 0;
		int[] sum = new int[str.length];
		// String[] str1 = new String[str.length];
		for (int index = 0; index < str.length; index++) {
			for (int index1 = 0; index1 < str[index].length(); index1++) {
				char ch = str[index].charAt(index1);
				if (Character.isDigit(ch)) {
					// str1[index] = str[index];{
					num = Integer.parseInt(String.valueOf(ch));
					sum[index] = sum[index] + num;
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		ReturnSumOfNosInStrOfArr returnSumOfNosInStrOfArr = new ReturnSumOfNosInStrOfArr();
		String[] str2 = { "TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25" };
		int[] sum = new int[str2.length];
		sum = returnSumOfNosInStrOfArr.getSumOfNosInStrOfArr(str2);
		System.out.println("Strings which Contain Numbers from given array are");
		for (int i = 0; i < str2.length; i++) {
			if (sum[i] != 0)
				System.out.println("Sum of Digits from String " + "[" + str2[i] + "] is:- " + sum[i]);
		}

	}
}
