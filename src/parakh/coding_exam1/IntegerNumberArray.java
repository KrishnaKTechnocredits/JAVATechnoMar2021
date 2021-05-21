package parakh.coding_exam1;

public class IntegerNumberArray {
	
	int[] numbers(int[] arr, int tar) {
		
		for(int i = 0; i < arr.length; i++) {
			for(int index = i + 1; index < arr.length; index++) {
				if(arr[i] + arr[index] == tar) {
					return new int[] {i, index};
				}
			}
		}
		return new int[] {};
	}
	
	public static void main(String args[]) {
		IntegerNumberArray intnumberarray = new IntegerNumberArray();
		int arr[] = {2, 11, 15, 7, 4};
		int[] getindex = intnumberarray.numbers(arr, 9);
		
		if(getindex.length == 2) {
			System.out.println(getindex[0] + " " + getindex[1]);
		}
	} 
	

}
