/*
 * 26th May Coding Exam-14 : Collection

1. Return all the palindrome number from given array.
input: [123,121,989,1221,951]
output: [121,989,1221]

public ArrayList<Integer> getPalindrome(int numbser[]){
	//write your logic
}


 */
package rupali.codingexam;
import java.util.*;


public class NumberPalindrome {
	public ArrayList<Integer> getPalindrome(int[] number){
		int temp1,temp2;
		ArrayList<Integer> output=new ArrayList<Integer>();
		for(int index=0;index<number.length;index++){
			temp1=number[index];
			temp2=0;
			while(temp1>0){
				temp2=temp2*10+temp1%10;
				temp1=temp1/10;
			}
			if(number[index]==temp2)
				output.add(number[index]);
		}
		return output;
	}
	public static void main(String[] args) {
		int[] input= new int[]{123,121,989,1221,951};
		NumberPalindrome numberpalindrome=new NumberPalindrome();
		System.out.println("The given integer array is: ");
		System.out.println(Arrays.toString(input));
		ArrayList<Integer> output=numberpalindrome.getPalindrome(input);
		System.out.println("Palindrome numbers are:"+output);
	}
}

