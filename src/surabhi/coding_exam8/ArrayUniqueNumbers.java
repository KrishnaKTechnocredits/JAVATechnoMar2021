package surabhi.coding_exam8;

/*Program 1: Return Unique elements from given array. [30 mins max]
input : {10,2,3,10,3,55,61,2};
Ouput : {10,2,3,55,61}
Hint : create new array Called output, insert eligible numbers and return output array.
Hint : Method should take int array as parameter and return an array.*/

public class ArrayUniqueNumbers {
	
	int[] getUniqueNumbers(int [] input) {
		int[] output=new int[input.length];
		int count=0;
		int duplicate=0;
		boolean isDuplicate=false;
		for(int index=0;index<input.length;index++) {
			isDuplicate=false;
			for(int innerIndex=index+1;innerIndex<input.length;innerIndex++) {
				if(input[index]==input[innerIndex]) {
					isDuplicate=true;
				}
			}
			if(!isDuplicate) {
				if(count<input.length) {
					output[count]=input[index];
					count++;
				}
			}
		}
		return output;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayUniqueNumbers arrayUniqueNumbers =new ArrayUniqueNumbers();
		int[] input= {10,2,3,10,3,55,61,2};
		int[] output=arrayUniqueNumbers.getUniqueNumbers(input);
		for (int index=0;index<output.length && output[index]!=0; index++) {
			System.out.println(output[index]);
		}
		
	}

}
