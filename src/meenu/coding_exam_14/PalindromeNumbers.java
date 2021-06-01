package meenu.coding_exam_14;

import java.util.ArrayList;

/*1. Return all the palindrome number from given array.
input: [123,121,989,1221,951]
output: [121,989,1221]
*/

public class PalindromeNumbers {

	public ArrayList<Integer> getPalindromeNum(ArrayList<Integer> numbers){
		ArrayList<Integer> PalidromeNumList = new ArrayList<Integer>();
		for(int numList : numbers) {
			int tempNum = numList;
			int r = 0;
			int outputNum = 0;
			while(tempNum>0){
				r = tempNum%10;
				outputNum = (outputNum*10)+r; 
				tempNum = tempNum/10;				
			}
			if(outputNum == numList)
				PalidromeNumList.add(outputNum);
		}
		return PalidromeNumList;
	}

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(123);
		numbers.add(121);
		numbers.add(989);
		numbers.add(1221);
		numbers.add(951);
		
		PalindromeNumbers t141 = new PalindromeNumbers();
		System.out.println(t141.getPalindromeNum(numbers));
	}
}
