/*Programming Test - 11 : 21st May'2021
Verify given number is Palindrome or not.
input : 12323
output : number is not palindrome
input : 15251
output : number is palindrome*/

package krati_Jain.codingExam11;

public class NumPalindrome {

	public static void main(String[] args) {
		int numToCheck = 15251;
		NumPalindrome numPalindrome = new NumPalindrome();
		numPalindrome.isNumPalindrome(numToCheck);
	}

	void isNumPalindrome(int inputNum) { // 12323 //32321

		int temp = 0, tempNum = 0, revNum = 0, numToProcess = inputNum;

		while (numToProcess > 0) {
			tempNum = numToProcess % 10; // 3, 2, 3, 2
			revNum = (revNum * 10) + tempNum; // 323
			numToProcess = numToProcess / 10; // 1232, 123,12, 1/10
		}
		if (revNum == inputNum)
			System.out.println(inputNum + " is a palindrome number");
		else
			System.out.println(inputNum + " is NOT a palindrome number");

	}

}
