package monika.Assignment17_Array;
/*Program 3: From given numbers, count the negative and positive numbers.
input : 10,23,26,-27,-88,87,-65 
output : negative -> 3
         positive -> 4*/
public class CountNegativePositiveNumUsingArray {
	void getCount(int[] arr) {
		int positiveCount = 0, negativeCount =0;
		for(int index=0;index<arr.length;index++) {
			if(arr[index]>=0)
				positiveCount++;
			else
				negativeCount++;
		}
		System.out.println("negative : "+negativeCount+" \npositive no : "+positiveCount);
	}
	public static void main(String[] args) {
		int[] arr = {10,23,26,-27,-88,87,-65};
		CountNegativePositiveNumUsingArray obj = new CountNegativePositiveNumUsingArray();
		obj.getCount(arr);
	}	
}
