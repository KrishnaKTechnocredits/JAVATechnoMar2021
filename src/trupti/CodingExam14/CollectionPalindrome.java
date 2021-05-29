package trupti.CodingExam14;

import java.util.ArrayList;

/*1. return all the palindrome number from given array.
input: [123,121,989,1221,951]
output: [121,989,1221]

public ArrayList<Integer> getPalindrome(int number[]){
	//write your logic
}*/

public class CollectionPalindrome {

	boolean checkNumPalindrome(String str) {
		StringBuffer sb1=new StringBuffer(str);
		StringBuffer sb2=new StringBuffer(str);
		sb2.reverse();

		if(sb1.toString().equals(sb2.toString()))
			return true;
		else 
			return false;
	}

	ArrayList<Integer> getNumPalindrome(int number[]){
		ArrayList<Integer>output =new ArrayList<Integer>();
		for(int index=0;index<number.length;index++) {
			if(checkNumPalindrome(String.valueOf(number[index])))
				output.add(number[index]);
		}
		
		return output;
	}

	public static void main(String[] args) {
		int [] input= {123,121,989,1221,951};
		ArrayList<Integer>output=new CollectionPalindrome().getNumPalindrome(input);
		System.out.println(output);

	}

}
