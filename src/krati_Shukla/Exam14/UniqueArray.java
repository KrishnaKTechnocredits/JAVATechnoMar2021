/*Return all the unique numbers from given array.
input: [1,8,6,3,4,5,2,3,6,9,8,4]
output: [1,8,6,3,4,5,2,9]*/

package krati_Shukla.Exam14;


import java.util.ArrayList;


public class UniqueArray {
	
	public ArrayList<Integer> getUniqueNumbers(int[] words){
		ArrayList<Integer> output = new ArrayList<Integer>();
		
		for(int temp : words) {
			if (!output.contains(temp))
				output.add(temp);
			}
		
		/*for(int temp : words) {
			boolean flag = false;
			if (output.contains(temp)) {
				flag = true;
			}
			if(!flag) {
				output.add(temp);
				System.out.println(output);
			}*/
		return output;
	}
	public static void main(String[] args) {
		UniqueArray unique = new UniqueArray();
		int[] arr = {1,8,6,3,4,5,2,3,6,9,8,4,10};
		ArrayList<Integer> answer = unique.getUniqueNumbers(arr);
		System.out.println(answer);
	}

}
