/*Program 1 : return arrayList of triplet having maximum sum, index overlapping is not allowed.
input : [1,10,2,3,1,11,4,2,1] --> 8 --> length - 2, index = index+3
output : 3,1,11 -> 15*/

package krati_Shukla.Exam17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxTriplet {

	ArrayList<Integer> IsTriplet(Integer[] input) {
		List<Integer> list = Arrays.asList(input);
		ArrayList<Integer> output = new ArrayList<Integer>();
		int length = input.length;
		int div = length / 3;
		int sum=0;
		int maxSum=0;
		
		for(int index =0; index<(length-div); index=index+3){
		sum = list.get(index) + list.get(index+1) + list.get(index+2);
		if (maxSum < sum) {
			maxSum = sum;
			sum=0;
			output.removeAll(output);
			output.add(list.get(index));
			output.add(list.get(index+1));
			output.add(list.get(index+2));
		}
		}
		System.out.println("Maximum sum is : "+maxSum);
		return output;
	}

	public static void main(String[] args) {
		MaxTriplet maxTriplet = new MaxTriplet();
		Integer[] arr = { 1, 10, 2, 3, 1, 11, 4, 2, 1 };
		ArrayList<Integer> answer = maxTriplet.IsTriplet(arr);
		System.out.println("Array list is "+answer);
	}

}
