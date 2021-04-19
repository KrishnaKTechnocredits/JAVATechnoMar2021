package ashwini.arrayAssignment17;
/*Program 4:  From given numbers, return the frequency of target number.
input : 10,23,23,44,23,10,23,4,23
target number : 23         
output : Freq of 23 is 4 */


import java.util.Scanner;


public class FindFrequencyOfTargatedNum {
	int targateNum;
	void frequencyOfTargetNumber(int[] array, int input) {
		targateNum=input;
		int frequncyOfnummber=0;
		for(int index=0;index<array.length;index++) {
			if(array[index]==input)
				frequncyOfnummber++;
		}
		System.out.println("Frequency od targeted number is :"+frequncyOfnummber);
		
	}
	
	public static void main(String[] args) {
		int array[]= {10,23,23,44,23,10,23,4,23};
		FindFrequencyOfTargatedNum findFrequencyOfTargatedNum =new FindFrequencyOfTargatedNum();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number who's frequency needs to find:");
		int targetNumber=sc.nextInt();
		findFrequencyOfTargatedNum.frequencyOfTargetNumber(array,targetNumber );
	}

}
