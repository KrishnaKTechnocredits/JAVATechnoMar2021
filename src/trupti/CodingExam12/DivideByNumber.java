package trupti.CodingExam12;

import java.util.ArrayList;

/*1) ArrayList<Integer> filerNumber(ArrayList<Integer> arr) [15 mins]
all the numbers, which is div by 3 or by 5 or by 3 & 5.

input : [10,2,3,6,15,44,32]
output : 10,3,6,15
 */

public class DivideByNumber {
	ArrayList <Integer> getDivisibleBy(ArrayList <Integer> input) {
		ArrayList<Integer> output=new ArrayList<Integer>();
		for(int index=0;index<input.size();index++) {
			if(input.get(index)%3==0) {
				output.add(input.get(index));
			}
			else if(input.get(index)%5==0){
				output.add(input.get(index));
			}
			else if (input.get(index)%3==0 && input.get(index)%5==0 ){
				output.add(input.get(index));
			}

		}return output;

	}

	public static void main(String[] args) {
		ArrayList<Integer> inputList=new ArrayList<Integer>();
		inputList.add(10);
		inputList.add(2);
		inputList.add(3);
		inputList.add(6);
		inputList.add(15);
		inputList.add(44);
		inputList.add(32);
		DivideByNumber dividebynumber =new DivideByNumber();
		ArrayList<Integer> answer=dividebynumber.getDivisibleBy(inputList);
		System.out.println(answer);
	}

}
