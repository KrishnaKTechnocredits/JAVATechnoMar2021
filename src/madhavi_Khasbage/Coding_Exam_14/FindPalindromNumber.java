package madhavi_Khasbage.Coding_Exam_14;

import java.util.ArrayList;
import java.util.Arrays;

/*1. Return all the palindrome number from given array.
input: [123,121,989,1221,951]
output: [121,989,1221]

public ArrayList<Integer> getPalindrome(int numbser[]){
	//write your logic  8:52
}*/

public class FindPalindromNumber {
	public ArrayList<Integer> getPalindrome(int numbser[]) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		int num = 0, n1, add = 0, temp = 0;
		for (int index = 0; index < numbser.length; index++) {
			num = numbser[index];
			temp = numbser[index];
			while (num > 0) {
				n1 = num % 10;
				add = (add * 10) + n1;
				num = num / 10;				
			}

			if (add == temp) {
				arrList.add(temp);
			}
			add=0;
		}
		return arrList;
	}

	public static void main(String[] args) {
		FindPalindromNumber findPalindrom = new FindPalindromNumber();	
		int[] arrInput = { 123, 121, 989, 1221, 951,636};
		System.out.println("Input:"+Arrays.toString(arrInput));
		System.out.println("These are the palindrome numbers from given array:" + findPalindrom.getPalindrome(arrInput));
	}
}
