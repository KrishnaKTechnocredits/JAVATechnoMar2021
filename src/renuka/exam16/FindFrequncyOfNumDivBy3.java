package renuka.exam16;

/*program 2 : find freq of only numbers div by 3
int[] arr = {6,2,6,6,3,4,15,3,3,5,5,12,13,17,12};
*/

import java.util.HashMap;

public class FindFrequncyOfNumDivBy3 {

	HashMap<Integer,Integer> getfreqOfNumDivBy3(int[] input){
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(int index =0; index < input.length; index++) {
			int temp = input[index];
			if(temp % 3 ==0) {
				if(hm.containsKey(temp)) {
					hm.put(temp, hm.get(temp)+1);
				}
				else {
					hm.put(temp,1);
				}
			}
			
		}
		return hm;
	}

	public static void main(String[] args) {
		FindFrequncyOfNumDivBy3 findFrequncyOfNumDivBy3 = new FindFrequncyOfNumDivBy3();
		int[] arr = {6,2,6,6,3,4,15,3,3,5,5,12,13,17,12};
		System.out.println("Frequncy of Number Divided By 3 is: " + findFrequncyOfNumDivBy3.getfreqOfNumDivBy3(arr));
	}
 
}
