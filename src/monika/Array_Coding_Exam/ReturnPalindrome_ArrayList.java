package monika.Array_Coding_Exam;

/*26th May Coding Exam-14 : Collection

1. Return all the palindrome number from given array.
input: [123,121,989,1221,951]
output: [121,989,1221]

public ArrayList<Integer> getPalindrome(int numbser[]){
	//write your logic
}*/
import java.util.ArrayList;

public class ReturnPalindrome_ArrayList {

	private boolean isPalindrome(int num) {
		int temp = num;
		int reverseNum = 0;
		String s = "";
		while (temp > 0) {
			int mod = temp % 10;
			s = s + mod;
			temp = temp / 10;
		}
		reverseNum = Integer.parseInt(s);
		if (num == reverseNum)
			return true;
		else
			return false;
	}

	public ArrayList<Integer> getPalindromeArr(int[] inputArr) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		for (int num : inputArr) {
			boolean resultFlag = isPalindrome(num);
			if (resultFlag) {
				arrList.add(num);
			}
		}
		return arrList;
	}

	public static void main(String[] args) {
		int[] inputArr = { 123, 121, 989, 1221, 951 };
		ReturnPalindrome_ArrayList obj = new ReturnPalindrome_ArrayList();
		ArrayList<Integer> arrList = obj.getPalindromeArr(inputArr);
		System.out.println(arrList);
	}
}
