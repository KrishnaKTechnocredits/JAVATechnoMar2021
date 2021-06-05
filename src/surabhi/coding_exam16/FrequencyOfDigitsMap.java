package surabhi.coding_exam16;

import java.util.Arrays;
import java.util.HashMap;

/*Test - 16 : 
Program 1 : freq of each digit
int[] arr = {1,2,1,1,3,4,5,3,3,4,5,5,2};

String getMaxFreqNumber(int[] arr){
	
}

output : 6 freq is 5*/

public class FrequencyOfDigitsMap {
	
	HashMap<Integer,Integer> getDigitFrequency(int[] input) {
		Integer numberKey=0;
		HashMap<Integer,Integer> hm=new HashMap<Integer, Integer>();
		for(int index=0;index<input.length;index++) {
			numberKey=input[index];
			if(hm.containsKey(numberKey)) {
				hm.put(numberKey, hm.get(numberKey)+1);
			}else {
				hm.put(numberKey, 1);
			}
		}
		return hm;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] ={1,2,1,1,3,4,5,3,3,4,5,5,2};
		HashMap<Integer, Integer> output=new FrequencyOfDigitsMap().getDigitFrequency(arr);
		System.out.println("Input of array :" +Arrays.toString(arr));
		System.out.println("Output of input array is :"+output);
	}

}
