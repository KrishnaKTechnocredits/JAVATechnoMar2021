package surabhi.coding_exam16;

import java.util.HashMap;

/*program 3 : return the number having max freq.
int[] arr = {6,2,6,6,6,6,3,4,15,3,3,5,5,12,13,17,12};*/

public class MaxFreqDigitMap {
	int getMaxFreqDigit(int[] input){
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		int maxCount=0, number=0;
		Integer numberKey=0;
		for(int index=0;index<input.length;index++) {
			numberKey=input[index];
			if(hm.containsKey(numberKey)) {
				hm.put(numberKey,hm.get(numberKey)+1);
				if(maxCount<hm.get(numberKey)) {
					maxCount=hm.get(numberKey);
					number=numberKey;
				}
			}else {
				hm.put(numberKey, 1);
			}
		}
		System.out.println(hm);
		return number;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr={6,2,6,6,6,6,3,4,15,3,3,5,5,12,13,17,12};
		int output=new MaxFreqDigitMap().getMaxFreqDigit(arr);
		System.out.println("Max frequency Number is "+output);
	}

}
