/*return all the palindrome number from given array.
input: [123,121,989,1221,951]
output: [121,989,1221]

public ArrayList<Integer> getPalindrome(int numbser[]){
	//write your logic
}*/
package sangeeta.CodingExam;

import java.util.ArrayList;

public class CodingExam14_P1 {

	ArrayList<Integer> getPalindrom(ArrayList<Integer> numarr) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int index = 0; index < numarr.size(); index++) {
			int num = numarr.get(index);
			int ans = 0;
			while (num > 0) {
				int Reminder = num % 10;
				num = num / 10;
				ans = ans * 10 + Reminder;
			}
			if (ans == numarr.get(index))
				output.add(numarr.get(index));
		}
		return output;
	}

	public static void main(String[] args) {
		CodingExam14_P1 codingExam14_P1 = new CodingExam14_P1();
		ArrayList<Integer> numarr = new ArrayList<Integer>();
		numarr.add(123);
		numarr.add(121);
		numarr.add(989);
		numarr.add(1221);
		numarr.add(951);
		ArrayList<Integer> output = codingExam14_P1.getPalindrom(numarr);
		System.out.println("Palindrom numbers are: " + output);
	}
}
