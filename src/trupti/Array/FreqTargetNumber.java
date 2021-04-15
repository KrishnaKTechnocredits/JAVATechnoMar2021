package trupti.Array;

import java.util.Scanner;

/*Assignment - 17 :Program 4:  From given numbers, return the frequency of target number.
input : 10,23,23,44,23,10,23,4,23
target number : 23         
output : Frequency of 23 is 4
 */
public class FreqTargetNumber {
	int [] getArray(Scanner scanner) {
		System.out.println("How many numbers you want to enter? ");
		int size=scanner.nextInt();
		int [] numberArr=new int[size];
		for(int index=0;index<numberArr.length;index++) {
			System.out.println("Enter Number "+ (index+1) + " : ");
			numberArr[index]=scanner.nextInt();
		}
		return numberArr;
	}
	
	int getFrequencyCount(int [] numArray, int targetNum) {
		int cntFrequency=0;
	
		for(int index=0;index<numArray.length;index++) {
			if(numArray[index] == targetNum)
				cntFrequency++;
		}
		
		return cntFrequency;
	}
	
	public static void main(String[] args) {
		FreqTargetNumber freqtargetnumber=new FreqTargetNumber();
		Scanner scanner=new Scanner(System.in);
		
		int [] noArray=freqtargetnumber.getArray(scanner);
		
		System.out.println("Enter Target Number : ");
		int targetNum=scanner.nextInt();
		
		int countFrequency=freqtargetnumber.getFrequencyCount(noArray, targetNum);
		System.out.println("Frequency of "+targetNum+" is "+countFrequency+".");
		scanner.close();
	}

}
