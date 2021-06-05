package madhavi_Khasbage.Coding_Exam_16;
/*program 3 : return the number having max freq.
int[] arr = {6,2,6,6,6,6,3,4,15,3,3,5,5,12,13,17,12};*/

import java.util.HashMap;
import java.util.Set;

public class FindNumMaxFrq {	
	String getMaxFrqNum(int[] arr) {
		String maxNumFrq="";
		HashMap<Integer, Integer> intFrqMap = new HashMap<Integer, Integer>();
		int cnt = 0;
		for (int index = 0; index < arr.length; index++) {
			int currentInt = arr[index];
			if (intFrqMap.containsKey(currentInt)) {
				intFrqMap.put(currentInt, intFrqMap.get(currentInt) + 1);				
			} else {
				intFrqMap.put(currentInt, 1);
			}
		}
		int maxFreq=0;
		int maxFrqNumber=0;
		Set<Integer> keys= intFrqMap.keySet();
		for(Integer currentKey : keys) {
			if(intFrqMap.get(currentKey)>maxFreq) {
				maxFreq=intFrqMap.get(currentKey);
				maxFrqNumber=currentKey;
			}			
		}
		maxNumFrq="Number :"  + maxFrqNumber + " Frequency:" + maxFreq;
		
		return maxNumFrq;
	}

	public static void main(String[] args) {
		FindNumMaxFrq objFrq = new FindNumMaxFrq();
		int[] arr = { 6,2,6,6,6,6,3,4,15,3,3,5,5,12,13,17,12 };
		System.out.println("Input: { 6,2,6,6,6,6,3,4,15,3,3,5,5,12,13,17,12 } ");
		String strOutput = objFrq.getMaxFrqNum(arr);
		System.out.println(strOutput);
	}
}
