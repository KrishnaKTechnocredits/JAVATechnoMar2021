/*Program 1:  From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65 
output : even -> 3
      odd ->  array.length - evenCount*/

package krati_Jain.Assignment_17;

public class CountOddEven {
	
	int count;
	void countEvenOddNumbers(int[] num) {
		for(int index=0; index<num.length; index++) {
			if (num[index]%2==0) {
					count++;
			}		
		}
	System.out.println("Count of Even numbers in the given array - " + count);
	System.out.println("Count of Odd numbers in the given array - " + (num.length-count));
	}
	
	public static void main(String[] args) {
		CountOddEven coe = new CountOddEven();
		int[] num = {11,22,33,44,55,66,77,88,99,0,2};
		coe.countEvenOddNumbers(num);
	}
	
		
}


