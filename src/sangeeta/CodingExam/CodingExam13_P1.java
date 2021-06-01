/*return all the arm-strong number from given array.
input: [153,279,371,303,407]
output: [153,371,407]

public ArrayList<Integer> getArmStrongNumber(int numbser[]){
	//write your logic
}*/

package sangeeta.CodingExam;

import java.util.ArrayList;

public class CodingExam13_P1 {

	public ArrayList<Integer> getArmstrongNumber(ArrayList<Integer> number) {
		int ans;
		int cube;
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int index = 0; index < number.size(); index++) {
			int temp = number.get(index);
			ans = 0;
			cube = 0;
			while (temp > 0) {
				ans = temp % 10;
				temp = temp / 10;
				cube = cube + (ans * ans * ans);
			}
			if (number.get(index) == cube) {
				output.add(number.get(index));
				temp = 0;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		CodingExam13_P1 codingExam13_P1 = new CodingExam13_P1();
		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(153);
		number.add(279);
		number.add(371);
		number.add(303);
		number.add(407);
		ArrayList<Integer> output = codingExam13_P1.getArmstrongNumber(number);
		System.out.println("Armstrong numbers are " + output);
	}
}
