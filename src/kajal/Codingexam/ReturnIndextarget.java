package kajal.Codingexam;

public class ReturnIndextarget {
	int num1=0;
	int num2=0;

	void checkIndex(int[] nums,int targetNum) {
		for(int index=0;index<nums.length;index++) {
			for(int innerIndex=0;innerIndex<nums.length;innerIndex++)
			if(nums[index]+nums[innerIndex]==targetNum) {
				num1= index;	
				num2= innerIndex;
			}
		}System.out.println("indexs are: "+ num2 +" & "+ num1);

	}

	public static void main(String[] args) {
		ReturnIndextarget returnIndextarget= new ReturnIndextarget();
		int[] nums= {2,11,15,7,4};
		int targetNum=9;
		returnIndextarget.checkIndex(nums,targetNum);
	}
}