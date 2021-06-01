package pallavi.coding_exam_12;

/*1) ArrayList<Integer> filerNumber(ArrayList<Integer> arr) [15 mins]
all the numbers, which is div by 3 or by 5 or by 3 & 5.
input : [10,2,3,6,15,44,32]
output : 10,3,6,15*/

import java.util.ArrayList;
import java.util.Scanner;

public class FilterNumber {

	ArrayList<Integer> filterNumber(ArrayList<Integer> input) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int index = 0; index < input.size(); index++) {
			if (input.get(index) % 3 == 0 || input.get(index) % 5 == 0) {
				output.add(input.get(index));
			}
		}
		return output;

	}

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		System.out.println("Enter the input");
		Scanner sc = new Scanner(System.in);
		for (int index = 0; index < 7; index++) {
			num.add(sc.nextInt());
		}

		ArrayList<Integer> output = new FilterNumber().filterNumber(num);
		System.out.println(output);

	}

}
