package bhavana_assignment_17;
/*From given array return max number.
input : 22,35,65,88,11,23,45
output : 88*/

public class MaxNumber {

	void maxNumber(int[] arr){
		int maxNum=0;
		for(int index=0;index<arr.length;index++) {
			if(arr[index]>maxNum)
				maxNum=arr[index];
		}
		System.out.println("The maximum number is:"+maxNum);
	}
	
	public static void main(String[] args) {
		int[] array= {22,35,65,88,11,23,45};
		MaxNumber mn=new MaxNumber();
		mn.maxNumber(array);
	}
}
