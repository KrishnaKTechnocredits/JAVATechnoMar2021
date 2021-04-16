package aashay.Array;
/*
 * Assignment - 17 : 10th April'2021

Program 1: From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65
output : even -> 3
odd -> array.length - evenCount

Program 2: return a difference between sum of even number and odd numbers.
From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65
output : evenSum - oddSum

int getDifference(int[] input){

}

Program 3: From given numbers, count the negative and positive numbers.
input : 10,23,26,-27,-88,87,-65
output : negative -> 3
positive -> 4


Program 4: From given numbers, return the frequency of target number.
input : 10,23,23,44,23,10,23,4,23
target number : 23
output : Freq of 23 is 4

Program 5: return true if you find a target number from given array else return false.
input : 10,23,23,44,23,10,23,4,23
target number : 45
output : Number 45 doesnt found in given array.

boolean isNumberPresent(int[] arr,int target){
if(arr[index] == target)

}

Program 6: From given array return max number.
input : 22,35,65,88,11,23,45
output : 88

Program 7: From given array return min number.
input : 22,35,65,88,11,23,45
output : 11


Program 8: return the name having maximum length.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : Technocredits


Program 9: return the index having maximum length from given string array.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : 2
 */



public class ArrayOddEvenNumbers {
	
	void oddEvenNumbers(int[] program1) {
		int evencnt=0;
		int oddcnt=0;
		for(int i = 0; i <= program1.length-1; i++) {
			if(program1[i]%2 == 0) {
				evencnt++;
			}
		}
		System.out.println("Even number count:"+evencnt+"\nOdd Number count: "+(oddcnt=program1.length-evencnt));
		
	}
	
	void diffOddEven(int[] program2) {
		int evenSum=0;
		int oddSum=0;
		int difference=0;
		for(int i = 0; i <= program2.length-1; i++) {
			if(program2[i]%2 == 0) {
				evenSum+= program2[i];
			}else {
				oddSum +=program2[i];
			}
				
			if(oddSum < evenSum) {
				difference = evenSum-oddSum;
			}else
				difference = oddSum-evenSum;
			
		}
		System.out.println("\nDifference in sum of even & sum of odd is: "+difference);
	}
	
	void numberNegativePositive(int[] program3) {
		int positiveCnt=0;
		int negativeCnt=0;
		for(int i = 0; i <= program3.length-1; i++) {
			if(program3[i] > 0) {
				positiveCnt++;
			}else
				negativeCnt++;
		}
		System.out.println("\nPositive number count:"+positiveCnt+"\nNegative Number count: "+(negativeCnt=program3.length-positiveCnt));
		
	}
	
	void numberFrequency(int[] program4, int num) {
		int numCnt=0;
	
		for(int i = 0; i <= program4.length-1; i++) {
			if(program4[i] ==num) {
				numCnt++;
			}
		}
		System.out.println("\n"+num+" Number frequency is "+numCnt);
	}
	
	boolean targetNumber(int[] program5, int num) {
			 boolean tnum = false;
			for(int i = 0; i <= program5.length-1; i++) {
				if(program5[i] ==num) {
					tnum= true;
				}
				else 
					tnum= false;
			}
		return tnum;
	}
	
	void maxNum(int[] program6) {
		int maxNum = program6[0];
		for(int i = 0; i <= program6.length-1; i++) {
			if(program6[i] > maxNum) {
				maxNum=program6[i];
			}
		}
		System.out.println("\nMaximum number from given array is:"+maxNum);
	}
	void minNum(int[] program7) {
		int minNum = program7[0];
		for(int i = 0; i <= program7.length-1; i++) {
			if(program7[i] < minNum) {
				minNum=program7[i];
			}
		}
		System.out.println("\nMinimum number from given array is:"+minNum);
	}
	
	void maxLength(String[] program8) {
		int maxLength = program8[0].length();
		int index=0;
		for(int i = 0; i <= program8.length-1; i++) {
			if(program8[i].length() > maxLength) {
				maxLength=program8[i].length();
				index= i;
			}
		}
		System.out.println("\n"+program8[index]+" has maximum lenght");
	}
	
	void minLength(String[] program9) {
		int minLength = program9[0].length();
		int index=0;
		for(int i = 0; i <= program9.length-1; i++) {
			if(program9[i].length() < minLength) {
				minLength=program9[i].length();
				index= i;
			}
		}
		System.out.println("\n"+program9[index]+" has minimum lenght");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayOddEvenNumbers oddEven = new ArrayOddEvenNumbers();
		
		int [] program1 = {10,23,26,27,88,87,65};
		oddEven.oddEvenNumbers(program1);
		
		int [] program2 = {10,23,26,27,88,87,65};
		oddEven.diffOddEven(program2);
		
		int [] program3 = {10,23,26,-27,-88,87,-65};
		oddEven.numberNegativePositive(program3);
		
		int [] program4 = {10,23,23,44,23,10,23,4,23};
		int num=23;
		oddEven.numberFrequency(program4,num);
		
		int [] program5 = {10,23,23,44,23,10,23,4,23};
		int targetNum=45;
		boolean tnum = oddEven.targetNumber(program5,targetNum);
		if(!tnum)
			System.out.println("\nTarget number"+targetNum+" doesnt found in given array. ");
		else
			System.out.println("\nTarget number"+targetNum+" present in given array. ");
		
		int [] program6 = {22,35,65,88,11,23,45};
		oddEven.maxNum(program6);
		
		int [] program7 = {22,35,65,88,11,23,45};
		oddEven.minNum(program7);
		
		String [] program8 = {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
		oddEven.maxLength(program8);
		
		String [] program9 = {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
		oddEven.minLength(program9);
		
		
		
		
		
			
		
		
		
	}

}
