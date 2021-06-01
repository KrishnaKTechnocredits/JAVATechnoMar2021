package rupali.codingexam1;

public class Arrayexample2 {
	public static void main	(String[] args) {
		int[] nums=new int[] {7,12,56,62,25};
		int younger=nums[0];
		int older=nums[0];
		System.out.println("The ages of all family members are:");
		for(int i=1;i<nums.length;i++) {
			System.out.println(nums[i]);
		 	if(younger>nums[i])
					younger=nums[i];
			
			if(older<nums[i])
				older=nums[i];
		}
		System.out.println("The diffrence between younger and older member is "+(older-younger));
		
	}

}
