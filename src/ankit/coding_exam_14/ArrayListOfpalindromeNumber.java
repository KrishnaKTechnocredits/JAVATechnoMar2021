/*26th May Coding Exam-14 : Collection

1. Return all the palindrome number from given array.
input: [123,121,989,1221,951]
output: [121,989,1221]
 */

package ankit.coding_exam_14;

import java.util.ArrayList;

class ArrayListOfpalindromeNumber {
	static ArrayList<Integer> getpalindromeNumber(ArrayList<Integer> intArrList){
		ArrayList<Integer> output = new ArrayList<Integer>();
		for(int index = 0 ; index < intArrList.size(); index++){
			int targetNum = intArrList.get(index);
			boolean flag = ispalindrome(targetNum);

			if(flag){
				output.add(intArrList.get(index));
			}
		}return output;
	}

	private static boolean ispalindrome(int targetNum){
		int temp = targetNum;
		int sum = 0;
		while(temp>0){
			int rem = temp % 10;
			sum = sum *10 + rem;
			temp = temp/10;
		}
		if(targetNum == sum)
			return true;
		else
			return false;
	}

	public static void main(String[] args){
		int[] intArr = {123,121,989,1221,951};
		ArrayList<Integer> intArrList = new ArrayList<Integer>();

		for(int index = 0; index < intArr.length ; index++){
			intArrList.add(intArr[index]);
		}
		System.out.println("Input ArrayList : "+intArrList);
		System.out.println("Output Array List of Palindrome Numbers :"+getpalindromeNumber(intArrList));
	}
}