package surabhi.assignment16_25;

import java.util.Scanner;

/*Program 9:  return the index having maximum length from given string array.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : 2*/

public class ArrayMaxLengthIndex {

	int getMaxIndex(String[] str) {
		int maxIndex=0;String maxStr=str[0]; 
		for(int index=0;index<str.length;index++) {
			if((str[index].length())>maxStr.length()) {
				maxIndex=index;
				maxStr=str[index];
			}
		}
		return maxIndex;
	}
	
	void printMaxStringIndex(int maxIndex) {
		System.out.println("Max length string index is :"+maxIndex);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayMaxLengthIndex arrayMaxLengthIndex=new ArrayMaxLengthIndex();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the number of elements in array :");
		int size=scanner.nextInt();
		String[] arr=new String[size]; 
		for (int index=0;index<size;index++) {
			System.out.println("Enter the Array String element number at "+index);
			arr[index]=scanner.next();
		}
		int maxIndex=arrayMaxLengthIndex.getMaxIndex(arr);
		arrayMaxLengthIndex.printMaxStringIndex(maxIndex);
		
	}


}
