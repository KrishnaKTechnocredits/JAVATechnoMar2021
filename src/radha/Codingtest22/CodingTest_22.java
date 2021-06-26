/*
WAP to return the sum of all elements of an array, except ignore sections of numbers starting with 6 and extending to the next 9. Return 0 for No numbers.

input 1: [1,3,5]

output 1: 9

input 2 : [4,5,6,12,2,9,1,3]

output 2: 13

input 3 : [2,1,6,9,11,6,19,12,9,2]

output 3: 16

input 4 : [6,1,4,5,9]

output 4 : 0
 */
package radha.Codingtest22;

public class CodingTest_22 {
	
	int getSum(int[] arr){
		int sum=0;
		boolean flag = true;
		for(int index=0; index<arr.length;index++) {
			if(arr[index]!=6 && flag)
				sum+=arr[index];
			else if(arr[index]==6 && flag==true)
				flag= false;
			else if(arr[index]==9 && flag==false)
				flag= true;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		CodingTest_22 test22 = new  CodingTest_22();
		int [] input1 = {1,3,5};
		int sum1 = test22.getSum(input1);
		System.out.println("Sum of the numbers ignoring section 6 to 9 : "+sum1);
		int[] input2 = {4,5,6,12,2,9,1,3};
		int sum2 = test22.getSum(input2);
		System.out.println("Sum of the numbers ignoring section 6 to 9 : "+sum2);
		int[] input3 = {2,1,6,9,11,6,19,12,9,2};
		int sum3 = test22.getSum(input3);
		System.out.println("Sum of the numbers ignoring section 6 to 9 : "+sum3);
		int[] input4 = {6,1,4,5,9};
		int sum4 = test22.getSum(input4);
		System.out.println("Sum of the numbers ignoring section 6 to 9 : "+sum4);
	}
}
