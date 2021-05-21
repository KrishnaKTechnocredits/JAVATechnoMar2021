package monika.Assignment17_Array;
/*Program 6: From given array return max number.
input : 22,35,65,88,11,23,45
output : 88*/
public class FindMaxNumUsingArray {
	
	void getFreq() {
		int arr[] = {22,35,65,88,11,23,45};
		int max = arr[0];
		for(int index=1;index<arr.length;index++) {
			if(max<arr[index])
				max = arr[index];
		}
		System.out.println("Highest no. is : "+max);
	}
	
	public static void main(String[] args) {
		FindMaxNumUsingArray obj = new FindMaxNumUsingArray();
		obj.getFreq();
	}
}
