package nikita.coding_exam_16;

import java.util.HashMap;

public class divisibleby3collection {

	static HashMap<Integer,Integer> frequencyofdigit(int[] arr){
		HashMap<Integer,Integer> arr1=new HashMap<Integer,Integer>();
		
		for(int num: arr) {
			if(num%3==0) {
				if(arr1.containsKey(num)) {
					arr1.put(num, arr1.get(num)+1);
				}else {
					arr1.put(num,1);
				}
			}
		}
		return arr1;
	}

public static void main(String args[]) {
	int [] arr= {6,2,6,6,3,4,15,3,3,5,5,12,13,17,12};
	HashMap<Integer,Integer> output= divisibleby3collection.frequencyofdigit(arr);
	//divisibleby3collection d=new divisibleby3collection();
	System.out.println(output);
}
}
