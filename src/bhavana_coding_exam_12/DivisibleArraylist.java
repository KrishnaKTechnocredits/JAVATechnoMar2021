package bhavana_coding_exam_12;

import java.util.ArrayList;
/*1) ArrayList<Integer> filerNumber(ArrayList<Integer> arr) [15 mins]
all the numbers, which is div by 3 or by 5 or by 3 & 5.

input : [10,2,3,6,15,44,32]
output : 10,3,6,15 */
public class DivisibleArraylist {

	ArrayList<Integer> filterNumber(ArrayList<Integer>input){
		ArrayList<Integer> output=new ArrayList<Integer>();
		for(int index=0;index<input.size();index++) {
			if(input.get(index)%3==0 || input.get(index)%5==0)
				output.add(input.get(index));
		}
		return output;
	}
	public static void main(String[] args) {
		DivisibleArraylist da= new DivisibleArraylist();
		ArrayList<Integer> input=new ArrayList<Integer>();
		input.add(10);
		input.add(2);
		input.add(3);
		input.add(6);
		input.add(15);
		input.add(44);
		input.add(32);
		System.out.println("Numbers divisible by 3 or 5 or both:");
		System.out.println(da.filterNumber(input));
		
	}
}
