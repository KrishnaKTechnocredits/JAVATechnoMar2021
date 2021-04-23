package renuka.exam1;

public class AddNumbers {
	
	int [] add(int[] nums, int target) {
		int[] output = new int[2];
        for(int index=0; index <nums.length; index++) {
        	for(int innerIndex=0; innerIndex <nums.length; innerIndex++) {
        		if(nums[index]+ nums[innerIndex]==target) {
        			int count=0;
        			output[count]= innerIndex;
        			count++;
        			output[count]= index;
        			
        		}
        		
        	}
        	
        }return output;
	}
	
	
	
	

	public static void main(String[] args) {
		AddNumbers addNum = new AddNumbers();
		int[] nums= {2,11,15,7,4};
		int target = 9;
		int[] output = addNum.add(nums, target);
		for(int index=0; index <output.length; index++) {
			System.out.println(output[index]);
		}

	}

}
