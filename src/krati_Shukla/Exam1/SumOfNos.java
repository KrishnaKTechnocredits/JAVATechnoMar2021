package krati_Shukla.Exam1;

public class SumOfNos {
	
	int[] TargetIndex(int[] input, int target) {
		int[] output = new int[2];
			
		int length = input.length;
		for(int index=0; index<length; index++) {
			for(int newIndex=1; newIndex<length; newIndex++) {
				int temp = input[index];
				temp = temp+input[newIndex];
				if (temp == target) {
					output[0]=index;
					output[1] = newIndex;
					break;
				}
			}
			
		}
		
		return output;
	}
	
	public static void main(String[] a) {
		SumOfNos sumOfNos = new SumOfNos();
		int[] input = {2,11,15,7,4};
		int target = 9;
		int[] indices = sumOfNos.TargetIndex(input, target);
		System.out.print("indices are :");
		for(int i=0; i<indices.length; i++) {
			System.out.print(indices[i]+" ");
		}
	}

}
