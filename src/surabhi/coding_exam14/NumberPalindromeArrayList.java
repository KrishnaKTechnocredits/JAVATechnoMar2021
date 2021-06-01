package surabhi.coding_exam14;

/*1. Return all the palindrome number from given array.
input: [123,121,989,1221,951]
output: [121,989,1221]

public ArrayList<Integer> getPalindrome(int numbser[]){
	//write your logic
}*/

import java.util.ArrayList;

public class NumberPalindromeArrayList {

	public boolean isNumPalindrome(int num){
		int reminder=0;
		int temp=num;
		int sum=0;
		while(temp>0){
			reminder=temp%10;
			sum=sum*10+reminder;
			temp=temp/10;
		}
		if(sum==num){
			return true;
		}else{
			return false;
		}
	}
	
	
	public ArrayList<Integer> getPalindromeArray(int numbers[]){
		boolean isPalindrome=false;
		ArrayList<Integer> output=new ArrayList<Integer>(numbers.length);
		for(int num:numbers){
			isPalindrome=isNumPalindrome(num);
			if(isPalindrome){
				output.add(num);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberPalindromeArrayList numberPalindromeArrayList=new NumberPalindromeArrayList();
		int [] arr= {123,121,989,1221,951};
		ArrayList<Integer> output=numberPalindromeArrayList.getPalindromeArray(arr);
		System.out.println(output);
	}

}
