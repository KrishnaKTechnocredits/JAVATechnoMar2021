/* Coding Exam - 12 : 22nd May'2021 [15 mins]

Programming Test - 12 : 

1) ArrayList<Integer> filerNumber(ArrayList<Integer> arr) [15 mins]
all the numbers, which is div by 3 or by 5 or by 3 & 5.

input : [10,2,3,6,15,44,32]
output : 10,3,6,15
*/

package vaibhav.CodingExam12;

import java.util.ArrayList;
import java.util.Arrays;

public class FilterNumber {

	ArrayList<Integer> filterNum(ArrayList<Integer> input) {

		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int index = 0; index < input.size(); index++) {
			if ((input.get(index) % 3 == 0) || (input.get(index) % 5 == 0))
				output.add(input.get(index));
		}

		return output;
	}

	public static void main(String[] args) {

		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(10);
		arrList.add(2);
		arrList.add(3);
		arrList.add(6);
		arrList.add(15);
		arrList.add(44);
		arrList.add(32);

		ArrayList<Integer> output = new ArrayList<Integer>();
		FilterNumber filterNumber = new FilterNumber();
		output = filterNumber.filterNum(arrList);
		
		System.out.print ("Expected output is : ");
		
		for (int index =0; index<output.size(); index++) {
			System.out.print(output.get(index) + " ");
			 
		}
		
	}

}
