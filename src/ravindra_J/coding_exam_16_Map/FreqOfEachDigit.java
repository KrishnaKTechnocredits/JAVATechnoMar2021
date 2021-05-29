/*coding_exam_16 : 
Program 1 : freq of each digit
int[] arr = {1,2,1,1,3,4,5,3,3,4,5,5,2};
*/
package ravindra_J.coding_exam_16_Map;

import java.util.HashMap;
import java.util.Map;

public class FreqOfEachDigit {
	public HashMap<Integer, Integer> getFreqOfEachDigit(int[] list){
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int keys : list) {
			if(map.containsKey(keys)){
				map.put(keys,map.get(keys)+1);
			}
			else {
				map.put(keys,1);	
			}
		}
		return map;
	}
	public static void main(String[] args) {
		int[] num = {1,2,1,1,3,4,5,3,3,4,5,5,2};
		//ArrayList<Integer> al = new ArrayList<Integer>());
		FreqOfEachDigit freqOfDigit = new FreqOfEachDigit();
		Map map = freqOfDigit.getFreqOfEachDigit(num);
		System.out.println(map);
	}
}
