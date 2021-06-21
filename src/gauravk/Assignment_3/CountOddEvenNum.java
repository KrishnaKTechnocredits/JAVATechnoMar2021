package gauravk.Assignment_3;
/*#3

Program 1:  From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65 
output : even -> 3
      odd ->  array.length - evenCount
*/

public class CountOddEvenNum {
	int countOdd = 0;
	int countEven = 0;
	
	void evenCounter(int[] nums) {
		for(int i=0; i<nums.length; i++) {
			if(nums[i]%2==0)
				countEven++;
			else countOdd++;
		}
		System.out.println("There are "+countEven+" even numbers & "+countOdd+" odd numbers");
	}
	
	public static void main(String[] args) {
		int [] prog1 = {1,20,30,4,5};
		CountOddEvenNum countOddEvenNum1 = new CountOddEvenNum();
		countOddEvenNum1.evenCounter(prog1);
	}
}
