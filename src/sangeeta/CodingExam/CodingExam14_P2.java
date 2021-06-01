/* Return all the unique numbers from given array.
input: [1,8,6,3,4,5,2,3,6,9,8,4]
output: [1,8,6,3,4,5,2,9]

public ArrayList<Integer> getUniqueNumbers(int words[]){
	//write your logic
}*/

package sangeeta.CodingExam;

import java.util.ArrayList;

public class CodingExam14_P2 {

	public ArrayList<Integer> getUniqueNumbers(ArrayList<Integer> nums) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int index = 0; index < nums.size(); index++) {
			Integer num = nums.get(index);
			if (!output.contains(num))
				output.add(nums.get(index));
		}
		return output;
	}

	public static void main(String[] args) {
		CodingExam14_P2 codingExam14_P2 = new CodingExam14_P2();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(8);
		numbers.add(6);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(2);
		numbers.add(3);
		numbers.add(6);
		numbers.add(9);
		numbers.add(8);
		numbers.add(4);
		ArrayList<Integer> output = codingExam14_P2.getUniqueNumbers(numbers);
		System.out.println("Unique numbers in the array are: " + output);
	}
}
