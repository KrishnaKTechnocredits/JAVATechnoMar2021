//coding exam16
package rupali.codingexam;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class MaxFreqHashMap {
	int getMaxFreqNumber(int[] input) {
		HashMap<Integer,Integer> setOfnum= new HashMap<Integer,Integer>();
		
		for(int index=0;index<input.length;index++){
			if(setOfnum.containsKey(input[index]))
				setOfnum.put(input[index], setOfnum.get(input[index])+1);
			else
				setOfnum.put(input[index], 1);
		}
		int maxfreq=0;
		int maxfreqnum=0;
		Set<Integer> keys=setOfnum.keySet();
		for(int index: keys) {
			if(setOfnum.get(index)>maxfreq)
				maxfreq=setOfnum.get(index);
				maxfreqnum=index;
		}
		return maxfreqnum;
		
	}
	public static void main(String[] args) {
	int[] input= {6,2,6,6,3,4,15,3,3,5,5,1,12,13,17,12};
	System.out.println(Arrays.toString(input));
	int output=new MaxFreqHashMap().getMaxFreqNumber(input);
	 System.out.println(output+" is occured maximum time in given array");
	}
}
