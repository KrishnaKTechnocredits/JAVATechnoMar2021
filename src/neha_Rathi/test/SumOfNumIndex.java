package neha_Rathi.test;

public class SumOfNumIndex {
	int num1=0;
	int num2=0;
	
	void calculateIndex(int[] nums,int targetNum) {
		for(int index=0;index<nums.length;index++) {
			for(int innerIndex=0;innerIndex<nums.length;innerIndex++)
			if(nums[index]+nums[innerIndex]==targetNum) {
				num1= index;	
				num2= innerIndex;
			}
		}System.out.println("two indexs are: "+ num2 +" & "+ num1);
		
	}

	public static void main(String[] args) {
		SumOfNumIndex sumOfNumIndex= new SumOfNumIndex();
		int[] nums= {2,11,15,7,4};
		int targetNum=9;
		sumOfNumIndex.calculateIndex(nums,targetNum);
	}
}
