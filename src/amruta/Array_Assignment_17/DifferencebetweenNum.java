
 /* 10th April 21 --- Assignment 17 ---- Program No 2 :

return a difference between sum of even number and odd numbers.	
	From given numbers, count the odd and even numbers.
	input : 10,23,26,27,88,87,65 
    output : evenSum - oddSum
	
	int getDifference(int[] input){
	
	}
*/

package amruta.Array_Assignment_17;

public class DifferencebetweenNum{
	
	int sumofEvenNum = 0, sumofOddNum = 0;
	
	void sumofnumbers(int[] num) {
		for(int index=0; index<num.length; index++) {
			
			if(num[index] % 2 == 0)
				sumofEvenNum = sumofEvenNum + num[index];
			else
				sumofOddNum = sumofOddNum + num[index];
		}	
		
		System.out.println("Sum of Even numbers in given array is: "+sumofEvenNum);
		System.out.println("Sum of Odd numbers in given array is: "+sumofOddNum);	
		
		if (sumofEvenNum > sumofOddNum) {
			int difference = sumofEvenNum - sumofOddNum;
			System.out.println("Difference between Sum of Even and Odd Number is : "+ difference);
		}else{
			int difference1 = sumofOddNum - sumofEvenNum;
			System.out.println("Difference between Sum of Even and Odd Number is : "+ difference1);
		}
	}
	
	public static void main(String[] args) {
		int[] num = {10,23, 26, 27, 88, 87, 65};
		
		new DifferencebetweenNum().sumofnumbers(num);		
	}
	
}

