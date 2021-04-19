package trupti.Array;

import java.util.Scanner;

/*Assignment - 17 :Program 5:  return true if you find a target number from given array else return false.
input : 10,23,23,44,23,10,23,4,23
target number : 45
output : Number 45 doesnt found in given array.
 */
public class FindTargetNum {
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

	boolean isNumberPresent(int [] numArray, int targetNum) {

		for(int index=0;index<numArray.length;index++) {
			if(numArray[index] == targetNum)
				return true;
		}

		return false;
	}

	public static void main(String[] args) {
		FindTargetNum findtargetnum=new FindTargetNum();
		Scanner scanner=new Scanner(System.in);

		int [] noArray=findtargetnum.getArray(scanner);

		System.out.println("Enter Target Number : ");
		int targetNum=scanner.nextInt();

		boolean ans=findtargetnum.isNumberPresent(noArray, targetNum);
		if (ans==true) 
			System.out.println ("Number "+ targetNum+" is present in given array.");
		else
			System.out.println ("Number "+ targetNum+" does not found in given array.");
		scanner.close();
	}

}
