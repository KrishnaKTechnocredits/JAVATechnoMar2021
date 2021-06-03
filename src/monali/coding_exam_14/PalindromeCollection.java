package monali.coding_exam_14;

import java.util.ArrayList;

public class PalindromeCollection {
	
	public ArrayList<Integer> getPalindrome(ArrayList<Integer> number){
		ArrayList<Integer> numbersList = new ArrayList<Integer>();
		for(int index = 0; index < number.size(); index++) {
			int temp = number.get(index);
			int ans = 0;
			int rev = 0;
			while(temp > 0) {
				ans = temp % 10;
				temp = temp / 10;
				rev = rev * 10 + ans;

			}
			if(number.get(index) == rev) 
				 numbersList.add(number.get(index));
			}
	return numbersList;
	}
	
	public static void main(String[] args) {
		PalindromeCollection palindrome = new PalindromeCollection();
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		numberList.add(123);
		numberList.add(121);
		numberList.add(989);
		numberList.add(1221);
		numberList.add(951);
		ArrayList<Integer> numbersList = palindrome.getPalindrome(numberList);
		System.out.println(numbersList);
	}
}
