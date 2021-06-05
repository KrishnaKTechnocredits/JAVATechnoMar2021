package monika.Array_Coding_Exam;
/*program 2 : find freq of only numbers div by 3
int[] arr = {6,2,6,6,3,4,15,3,3,5,5,12,13,17,12};
*/

import java.util.HashMap;

public class Test16_FindFreqAfterDiv {
	
	public static HashMap<Integer,Integer> getFreqOfNumDivBy3(int[] arr){
	HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(int num: arr) {
			if(num % 3 == 0) {
				if(hm.containsKey(num))
					hm.put(num, hm.get(num)+1);
				else
					hm.put(num, 1);
			}
		}return hm;		
	}
	public static void main(String[] args) {
		int[] arr = {6,2,6,6,3,4,15,3,3,5,5,12,13,17,12};
		HashMap<Integer,Integer> hm = getFreqOfNumDivBy3(arr);
		System.out.println(hm);
	}

}
