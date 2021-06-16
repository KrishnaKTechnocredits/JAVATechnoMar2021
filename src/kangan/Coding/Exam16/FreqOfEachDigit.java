package kangan.Coding.Exam16;

/*Program 1 : freq of each digit
int[] arr = {1,2,1,1,3,4,5,3,3,4,5,5,2};*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FreqOfEachDigit {

	HashMap<Integer, Integer> getFreq(List<Integer> input1) {
		HashMap<Integer, Integer> output = new HashMap<Integer, Integer>();
		for(int index=0;index<input1.size();index++) {
			int temp = input1.get(index);
			if(output.containsKey(temp)) {
				int cnt=output.get(temp)+1;
				output.put(temp, cnt);
			}
			else {
				output.put(temp, 1);
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,1,1,3,4,5,3,3,4,5,5,2};
		Integer[] input = {1,2,1,1,3,4,5,3,3,4,5,5,2};
		List<Integer> input1 = Arrays.asList(input);
		FreqOfEachDigit freqOfEachDigit = new FreqOfEachDigit();
		HashMap<Integer, Integer> output =freqOfEachDigit.getFreq(input1);
		System.out.println(output);
	}
}
