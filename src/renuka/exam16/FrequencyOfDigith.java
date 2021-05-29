package renuka.exam16;


/*Program 1 : freq of each digit
int[] arr = {1,2,1,1,3,4,5,3,3,4,5,5,2};
*/

import java.util.HashMap;


public class FrequencyOfDigith {
	
	HashMap<Integer,Integer> getfreqOfEachDigit(int[] input){
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(int index =0; index < input.length; index++) {
			if(hm.containsKey(input[index])) {
				hm.put(input[index], hm.get(input[index])+1);
			}
			else {
				hm.put(input[index],1);
			}
		}
		return hm;
	}

	public static void main(String[] args) {
		FrequencyOfDigith findFrequncyOfDigit = new FrequencyOfDigith();
		int[] arr = {1,2,1,1,3,4,5,3,3,4,5,5,2};
		System.out.println("Frequncy of each Digit in array is: " + findFrequncyOfDigit.getfreqOfEachDigit(arr));
	}

}
