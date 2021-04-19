//Program 1: From given numbers, count the odd and even numbers.

package krati_Shukla.Array;

public class OddEven {
	
	void calculate(int[] num, int length) {
		int evenCount=0;
		for(int index=0; index<length; index++) {
			if(num[index]%2 == 0)
				evenCount++;
		}
		length = length - evenCount;
		System.out.println("Odd numbers are "+length+" , Even number are :"+evenCount);
		
	}
	
	public static void main(String[] a) {
		OddEven oddEven = new OddEven();
		int[] num = {10,23,26,27,88,87,65};
		oddEven.calculate(num, num.length);
	}

}
