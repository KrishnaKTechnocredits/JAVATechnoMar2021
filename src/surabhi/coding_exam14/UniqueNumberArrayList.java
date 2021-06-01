package surabhi.coding_exam14;

/*2. Return all the unique numbers from given array.
input: [1,8,6,3,4,5,2,3,6,9,8,4]
output: [1,8,6,3,4,5,2,9]*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueNumberArrayList {
	
	public static ArrayList<Integer> getUniqueNumbers(int numbers[]){
		Set<Integer> uniqueSetArray=new LinkedHashSet<Integer>();
		for(Integer arr: numbers) {
			uniqueSetArray.add(arr);
		}
		ArrayList<Integer> output=new ArrayList<Integer>(uniqueSetArray);
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1, 8,6,3,4,5,2,3,6,9,8,4};
		ArrayList output=getUniqueNumbers(arr);
		System.out.println(output);
	}

}
