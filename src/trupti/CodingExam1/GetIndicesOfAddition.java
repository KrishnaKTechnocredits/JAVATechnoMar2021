package trupti.CodingExam1;

import java.util.Scanner;

public class GetIndicesOfAddition {
	int [] getArray(Scanner scanner) {
		
		System.out.println("How many numbers you want to enter ?");
		int size =scanner.nextInt();
		int [] numberArray=new int[size];
			for(int index=0;index<numberArray.length;index++) {
				System.out.println("Enter Number"+(index+1)+" : ");
				numberArray[index]=scanner.nextInt();
			}
			return numberArray;
	}
	
	int [] getIndices(int [] numArray,int targetNum) {
		int [] output=new int[2];
		int tempSum=0;
			for(int outerIndex=0;outerIndex<numArray.length;outerIndex++) {
				for (int innerIndex=0;innerIndex<numArray.length;innerIndex++) {
					if(numArray[innerIndex]!= numArray[outerIndex]) {
						tempSum=numArray[innerIndex]+ numArray[outerIndex];
						if (tempSum==targetNum) {
							output[0]=innerIndex;
							output[1]=outerIndex;
						}
					}
				}
			}
			return output;
	}

	public static void main(String[] args) {
		GetIndicesOfAddition getindicesofaddition=new GetIndicesOfAddition();
		Scanner scanner=new Scanner(System.in);
		int []noArray=getindicesofaddition.getArray(scanner);
		System.out.println("Enter target number :");
		int targetNum = scanner.nextInt();
		int []outputArray=getindicesofaddition.getIndices(noArray,targetNum);
		System.out.println("Output Array : ");
		for (int index=0;index<outputArray.length;index++) {
			if(index < outputArray.length-1)
				System.out.print(outputArray[index] + " , ");
			else
				System.out.print(outputArray[index]);
		}
			
	}

}
