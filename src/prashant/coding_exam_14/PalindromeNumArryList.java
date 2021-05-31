/*Return all the palindrome number from given array.
input: [123,121,989,1221,951]
output: [121,989,1221]

public ArrayList<Integer> getPalindrome(int numbser[]){
	//write your logic
}*/

package prashant.coding_exam_14;

import java.util.ArrayList;

public class PalindromeNumArryList {
	public ArrayList<Integer> getPalindrome(int[] number) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for (int index = 0; index < number.length; index++) {
			String tempstr = Integer.toString(number[index]);
			StringBuffer originalsb = new StringBuffer(tempstr);
			StringBuffer comparesb = new StringBuffer(tempstr);
			comparesb.reverse();
			if (originalsb.toString().equals(comparesb.toString())) {
				temp.add(number[index]);
			}
		}
		return temp;
	}
	public static void main(String[] args) {
		PalindromeNumArryList Palindrome = new PalindromeNumArryList();
		int[] numArr = { 123, 121, 989, 1221, 951 };
		ArrayList<Integer> output = Palindrome.getPalindrome(numArr);
		System.out.println("palindrome number from given array is " + output);
	}
}
