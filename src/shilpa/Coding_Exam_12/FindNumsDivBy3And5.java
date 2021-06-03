/*Programming Test - 12 : 22nd May'2021
1) ArrayList<Integer> filerNumber(ArrayList<Integer> arr) [15 mins]
all the numbers, which is div by 3 or by 5 or by 3 & 5.

input : [10,2,3,6,15,44,32]
output : 10,3,6,15
*/
package shilpa.Coding_Exam_12;

import java.util.ArrayList;
import java.util.Scanner;

public class FindNumsDivBy3And5 {
	ArrayList<Integer> getNumDivBy3And5(ArrayList<Integer> arr) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int index = 0; index < arr.size(); index++) {
			if ((arr.get(index) % 3) == 0 || (arr.get(index) % 5) == 0) {
				output.add(arr.get(index));
			}
		}
		return output;

	}

	public static void main(String[] args) {
		FindNumsDivBy3And5 findNumsDivBy3And5 = new FindNumsDivBy3And5();
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> input = new ArrayList<Integer>();
		System.out.println("Enter Numbers");
		for (int index = 0; index < 7; index++) {
			input.add(scanner.nextInt());
		}
		ArrayList<Integer> output = findNumsDivBy3And5.getNumDivBy3And5(input);
		System.out.println("Numbers Divisible by 3 or 5 are\n" + output);

	}

}
