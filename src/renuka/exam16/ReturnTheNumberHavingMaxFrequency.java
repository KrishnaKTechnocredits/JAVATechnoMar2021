package renuka.exam16;

/*program 3 : return the number having max freq.
int[] arr = {6,2,6,6,6,6,3,4,15,3,3,5,5,12,13,17,12};
String getMaxFreqNumber(int[] arr){
}
output : 6 freq is 5
*/

import java.util.HashMap;
import java.util.Set;

public class ReturnTheNumberHavingMaxFrequency {
	String getNumHavingMaxFrequency(int[] input){
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(int index =0; index < input.length; index++) {
			if(hm.containsKey(input[index])) {
				hm.put(input[index], hm.get(input[index])+1);
			}
			else {
				hm.put(input[index],1);
			}	
		}
		int maxFreq = 0;
		int maxFreqNum = 0;
		Set<Integer> keys = hm.keySet();
		for(Integer currentKey : keys) {
			if(hm.get(currentKey) > maxFreq) {
				maxFreq = hm.get(currentKey);
				maxFreqNum = currentKey;
			}
		}
		
		
		return maxFreqNum +" Frequency is: " + maxFreq;
	}

	public static void main(String[] args) {
		ReturnTheNumberHavingMaxFrequency returnNumWithMaxFrequncy = new ReturnTheNumberHavingMaxFrequency();
		int[] arr = {6,2,6,6,6,6,3,4,15,3,3,5,5,12,13,17,12};
		System.out.println(returnNumWithMaxFrequncy.getNumHavingMaxFrequency(arr));
	}

}
