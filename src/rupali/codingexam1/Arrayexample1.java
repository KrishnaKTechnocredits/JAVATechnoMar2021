package rupali.codingexam1;

public class Arrayexample1 {
	public static void main(String[] args) {
		int[] nums=new int[] {2,3,6,7,4};
		int target=9;
		int[] output=new int[2];
	
		System.out.println("Input ");
		for(int index=0;index<nums.length;index++) {
			System.out.print(nums[index]+"  ");
		}
		System.out.println();
		System.out.println(" Target"+target);
		System.out.println("The indices of two number such that they add up to the target");
		for(int index=0;index<nums.length;index++) {
			for(int innerindex=index+1;innerindex<nums.length;innerindex++) {
				if((nums[index]+nums[innerindex])==target) {
					output[0]=index;
					output[1]=innerindex;
					System.out.println("Output"+output[0]+" "+output[1]);
				}
			}
		}
		
		
		
	}

}
