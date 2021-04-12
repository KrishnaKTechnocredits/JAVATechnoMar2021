package anubhav.arrayexamples;

  
public class NumberArrayOperations {
/*Program 1:  From given numbers, count the odd and even numbers.
	input : 10,23,26,27,88,87,65 
	output : 	even -> 3
	      		odd ->  array.length - evenCount*/
	
	void printEvenOddCount(int[] num) {
		System.out.println("----Count of Odd & Even elements in array----");
		int evenCount = 0;
		for(int index = 0; index<num.length; index++) {
			if(num[index] % 2 == 0) {
				evenCount++;
			}
		}
		System.out.println("Count of even elements in array   : " +evenCount);
		System.out.println("Count of Odd elements in array    : " +(num.length-evenCount));
	}

/*Program 2: return a difference between sum of even number and odd numbers.	
	From given numbers, count the odd and even numbers.
	input : 10,23,26,27,88,87,65 
    output : evenSum - oddSum*/
	
	void DiffBetweenSumOfEvenAndOdd(int[] num){
		System.out.println("----Sum of odd and even elements in array----");
		int evenSum=0;
		int oddSum=0;
		for (int index=0; index<num.length; index++) {
			if(num[index]%2 == 0)
				evenSum= evenSum + num[index];
			else
				oddSum= oddSum + num[index];
		}
		System.out.println("Sum of even numbers in the string : " + evenSum);
		System.out.println("Sum of odd numbers in the string  : " + oddSum);
		System.out.println("Difference of sum of even & odd   : " + (evenSum-oddSum));
	}	
	
/*Program 3: From given numbers, count the negative and positive numbers.
	input : 10,23,26,-27,-88,87,-65 
	output : negative -> 3
	         positive -> 4*/
	
	void positiveAndNegativeInArray(int[] num1) {
		System.out.println("----Count of positive & negative elements in array----");
		int positiveCount=0;
		int negativeCount=0;
		for (int index=0; index<num1.length; index++) {
			if (num1[index]>0)
				positiveCount++;
			else if
				(num1[index]<0)
				negativeCount++;
		}
		System.out.println("Count of positive elements in array: " + positiveCount);
		System.out.println("Count of negative elements in array: " + negativeCount);
		System.out.println("Count of 0's as element in array   : " + (num1.length-positiveCount-negativeCount));
	}
	
/*Program 4: From given numbers, return the frequency of target number.
  		input : 10,23,23,44,23,10,23,4,23
		target number : 23         
		output : Freq of 23 is 4*/
	
	void frequencyOfAnElement(int[] num1, int toCompare) {
		System.out.println("----Frequency of an element in the given array----");
		int freq=0;
		for (int index=0; index<num1.length; index++) {
			if (num1[index]==toCompare)
				freq++;	
		}
		System.out.println("Frequency of " + toCompare + " in array is        : " + freq);
	}
	
/*Program 5: return true if you find a target number from given array else return false.
	input : 10,23,23,44,23,10,23,4,23
	target number : 45
	output : Number 45 doesnt found in given array.*/
	
	boolean trueOrFalse(int[] num1, int toFind) {
		// System.out.println("----True of False----");
		for (int index=0; index<num1.length; index++) {
			if (num1[index]==toFind) {
				return true;
			}
		}
		return false;
	}
	
/*Program 6: From given array return max number.
	input : 22,35,65,88,11,23,45
	output : 88*/
		
	void maxInArray(int[] num1) {
		System.out.println("----Maximum element in an array----");
		int max= num1[0];
		for (int index=1; index<num1.length; index++) {
			if (max<num1[index])
					max=num1[index];
		}
		System.out.println("Maximum number in the array        : " + max);	
	}
	
/*Program 7: From given array return min number.
	input : 22,35,65,88,11,23,45
	output : 11*/
	
	void minInArray(int[] num1) {
		System.out.println("----Maximum element in an array----");
		int min= num1[0];
		for (int index=1; index<num1.length; index++) {
			if (min>num1[index])
					min=num1[index];
		}
		System.out.println("Minimum number in the array        : " + min);	
	}
	
	public static void main(String[] args) {
		NumberArrayOperations numberArrayOperations= new NumberArrayOperations();
		
		int[] arr1 = {14,2,3,-4,5,6,7,8,9,12,11,12,13};
		int[] arr2 = {-5,-4,-3,-2,-1,0,1,2,3,4,5,0,7};
		numberArrayOperations.printEvenOddCount(arr1);
		numberArrayOperations.DiffBetweenSumOfEvenAndOdd(arr1);
		numberArrayOperations.positiveAndNegativeInArray(arr2);
		numberArrayOperations.frequencyOfAnElement(arr1, 14);
		numberArrayOperations.trueOrFalse(arr1, 17);
		System.out.println("----True of False----");
		if (numberArrayOperations.trueOrFalse(arr1, 17)==true) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		numberArrayOperations.maxInArray(arr1);
		numberArrayOperations.minInArray(arr1);
	}
}
