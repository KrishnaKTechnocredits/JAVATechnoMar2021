package madhavi_Raut.CodingExam.Exam_14;
/*Collection
1. Return all the palindrome number from given array.
input: [123,121,989,1221,951]
output: [121,989,1221]
public ArrayList<Integer> getPalindrome(int numbser[]){
//write your logic
}*/

import java.util.ArrayList;
public class FindPalindromeNumber {

	ArrayList<Integer> getPalindromeNumbers(int[] arrNum) {
		ArrayList<Integer> newArrList = new ArrayList<Integer>();
		for (int index = 0; index < arrNum.length; index++) {
			int num = arrNum[index];
			int temp = num, sum = 0;
			while (!(temp == 0)) {
				int mod = temp % 10;
				temp = temp / 10;
				sum = sum * 10 + mod;
			}
			if (num == sum) {
				newArrList.add(num);
			}
		}
		return newArrList;
	}
	
	public static void main(String[] args) {
		int[] arrNum = {123,121,989,1221,951};
		System.out.println("Palindrome numbers are:");
		System.out.println(new FindPalindromeNumber().getPalindromeNumbers(arrNum));
	}
}
