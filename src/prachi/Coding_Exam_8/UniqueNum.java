package prachi.Coding_Exam_8;

/*Program 1: Return Unique elements from given array. [30 mins max]
input : {10,2,3,10,3,55,61,2};
Ouput : {10,2,3,55,61}
Hint : create new array Called output, insert eligible numbers and return output array.
Hint : Method should take int array as parameter and return an array.*/

public class UniqueNum {
	static int[] input= {10,2,3,10,3,55,61,2};
	
	int[] uniqueNum(int[] input) {
		int[] output=new int[input.length];
		int cnt=0;
		boolean isDuplicateNum=false;
		
		for(int index=0;index<input.length;index++) {
			isDuplicateNum=false;
			
			for(int innerIndex=index+1;innerIndex<input.length;innerIndex++) {
				if(input[index]==input[innerIndex]) {
					isDuplicateNum=true;
					break;
				}
			}
			if (isDuplicateNum == false) {
				output[cnt] = input[index];
				cnt++;
				}
			}
		
		return output;
	}

	public static void main(String[] args) {
		UniqueNum arrayUniqueNumbers =new UniqueNum();
		int[] output=arrayUniqueNumbers.uniqueNum(input);
		for (int index=0;index<output.length && output[index]!=0; index++) {
			System.out.print(output[index]+",");
		}
	}
}
