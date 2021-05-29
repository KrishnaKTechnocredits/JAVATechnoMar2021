package surabhi.coding_exam16;

import java.util.Arrays;
import java.util.HashMap;
/*Test - 16 : 
program 2 : find freq of only numbers div by 3
int[] arr = {6,2,6,6,3,4,15,3,3,5,5,12,13,17,12};*/

public class FreqOfDigitDivBy3 {

	HashMap<Integer,Integer> getFrequencyOfDigitsDivBy3(int[] input){
		HashMap<Integer, Integer> hm=new HashMap<Integer,Integer>();
		Integer NumberKey=0;
		for(int index=0;index<input.length;index++) {
			NumberKey=input[index];
			if(NumberKey%3==0) {
				if(hm.containsKey(NumberKey)) {
					hm.put(NumberKey, hm.get(NumberKey)+1);
				}else {
					hm.put(NumberKey, 1);
				}
			}
		}
		return hm;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input={6,2,6,6,3,4,15,3,3,5,5,12,13,17,12};
		HashMap<Integer,Integer> output=new FreqOfDigitDivBy3().getFrequencyOfDigitsDivBy3(input);
		System.out.println("Input of array :" +Arrays.toString(input));
		System.out.println("Output of input array is :"+output);
	}

}
