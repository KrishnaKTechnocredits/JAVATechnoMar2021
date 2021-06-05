/*Test - 16 : 
Program 1 : freq of each digit
int[] arr = {1,2,1,1,3,4,5,3,3,4,5,5,2};

---------------------------------------------------
program 2 : find freq of only numbers div by 3
int[] arr = {6,2,6,6,3,4,15,3,3,5,5,12,13,17,12};

program 3 : return the number having max freq.
int[] arr = {6,2,6,6,6,6,3,4,15,3,3,5,5,12,13,17,12};

String getMaxFreqNumber(int[] arr){

}
 */
package ankit.coding_exam_16;

import java.util.HashMap;

public class FreqOfOnlyDivBy3 {

	static HashMap<Integer, Integer> getFreqOfEachDigits(int[] arr){
		HashMap<Integer, Integer> arrHM  = new HashMap<Integer, Integer>();

		for(int num : arr) {
			if(num % 3 == 0) {
				if(arrHM.containsKey(num) && num % 3 == 0) {
					arrHM.put(num, arrHM.get(num)+1);
				}else {
					arrHM.put(num, 1);
				}
			}
		}return arrHM;
	}

	public static void main(String[] args) {
		int[] arr = {6,2,6,6,3,4,15,3,3,5,5,12,13,17,12};
		System.out.println(getFreqOfEachDigits(arr));
	}
}
