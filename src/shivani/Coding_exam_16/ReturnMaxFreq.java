package shivani.Coding_exam_16;

import java.util.HashMap;
import java.util.Set;

/*program 3 : return the number having max freq.
int[] arr = {6,2,6,6,6,6,3,4,15,3,3,5,5,12,13,17,12};*/
public class ReturnMaxFreq {
	
	String rturnNumWithMaxFreq(int[] arr){
		int count =0;
		int max = 0;
		
		HashMap<Integer,Integer> output = new HashMap<Integer,Integer>();
		
		for(int index =0;index<arr.length;index++) {
			
		int temp = arr[index];
		if(output.containsKey(temp)) {
			
			
			output.put(temp, output.get(temp)+1);
		}
			else
				output.put(temp, 1);
		}
		
		Set<Integer> keys = output.keySet();
		for (int currentKey : keys) {
			if (output.get(currentKey) > max) {
				max = output.get(currentKey);
				count = currentKey;
			}
		}
		
		return "Number having Max Frequency is :"+count +" "+ "Frquency is :"+max;
	}
	
	public static void main(String[] args) {
		ReturnMaxFreq returnMaxFreq = new ReturnMaxFreq();
		int[]arr= {6,2,6,6,6,6,3,4,15,3,3,5,5,12,13,17,12};
		System.out.println(returnMaxFreq.rturnNumWithMaxFreq(arr));
	}
	
}
