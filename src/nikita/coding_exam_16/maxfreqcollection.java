package nikita.coding_exam_16;

import java.util.HashMap;
import java.util.Set;

public class maxfreqcollection {

	void MaxNum(int[] arr) {
	HashMap<Integer, Integer> hm=new HashMap<Integer,Integer>();
	for(int index=0;index<arr.length;index++) {
		int currentnum=arr[index];
		if(hm.containsKey(currentnum)) {
			hm.put(currentnum, hm.get(currentnum)+1);
		}else {
			hm.put(currentnum,1);
		}
	}
	
	int maxfeq=0;
	int maxfeqnum=0;
	Set<Integer> keys=hm.keySet();
	for(int currentkey : keys) {
		maxfeq=hm.get(currentkey);
		maxfeqnum=currentkey;
	}
	System.out.println("The number is:"+ maxfeq + ":"+ maxfeqnum);
	
}
}