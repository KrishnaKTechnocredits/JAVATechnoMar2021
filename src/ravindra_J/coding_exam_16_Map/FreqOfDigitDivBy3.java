/*coding_exam_16 : 
program 2 : find freq of only numbers div by 3
int[] arr = {6,2,6,6,3,4,15,3,3,5,5,12,13,17,12};
*/
package ravindra_J.coding_exam_16_Map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FreqOfDigitDivBy3 {
	
	public Map<Integer, Integer> getNumberDivBy3(int[] arr) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int index = 0; index < arr.length; index++) {
			int temp = arr[index];
			
			if(map.containsKey(temp) && temp%3==0){
				map.put(temp, map.get(temp)+1);
			}
			else if(temp%3==0) {
				map.put(temp, 1);
			}
				
		}
		return map;
	}
	public static void main(String[] args) {
		int[] arr = {6,2,6,6,3,4,15,3,3,5,5,12,13,17,12};
		FreqOfDigitDivBy3 freq = new FreqOfDigitDivBy3();
		Map map = freq.getNumberDivBy3(arr);
		System.out.println(map);
	}
}
