package monika.Assignment17_Array;
/*Program 7: From given array return min number.
input : 22,35,65,88,11,23,45
output : 11*/
public class FindMinNumUsingArray {
	
	int getMinNum(int[] arr) {
		int min = arr[0];
		for(int index=1;index<arr.length;index++) {
			if(min>arr[index])
				min=arr[index];
		}
		return min;
	}
	
	public static void main(String[] args) {
		FindMinNumUsingArray obj = new FindMinNumUsingArray();
		int[] arr = {22,35,65,88,11,23,45};
		System.out.println("Minimum no. is : "+obj.getMinNum(arr));
	}
}
