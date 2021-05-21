package mayur.coding_exam_8;


public class DuplicateArrayNumbers {
		int[] removeDuplicate(int[] input) {
			 int[] output = new int[input.length];
			 int count = 0; 
			 int duplicate = 0;
			 boolean isDuplicate = false;
			 
			for (int index = 0;index < input.length;index++) {
					isDuplicate = false;
					for(int innerIndex = index+1;innerIndex < input.length;innerIndex++ ) {
						if(input[index] == input[innerIndex]) {
							isDuplicate = true;
						}
						
					}
					
					if(!isDuplicate) {
						if(count < input.length) {
							output[count] = input[index];
							count++;
						}
					}
			}
			
			return output;
		}

		public static void main(String[] args) {
			DuplicateArrayNumbers arr = new DuplicateArrayNumbers();
	
			int []input = {10,2,3,10,3,55,61,2};
			int[] output = arr.removeDuplicate(input);
			for (int index=0;index<output.length && output[index]!=0; index++) {
			System.out.println("The array after removing duplicate character is " +output[index]);
		}

	}
}
