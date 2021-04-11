package surabhi.assignment16_25;

import java.util.Scanner;

/*Program 8:  return the name having maximum length.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : Technocredits*/

public class ArrayStringMaxLength {
	
	String getMaxStringValue(String[] str) {
		String maxStr=str[0];
		for(int index=1;index<str.length;index++) {
			if((str[index].length())>maxStr.length()) {
				maxStr=str[index];
			}
		}
		return maxStr;
	}
	
	void printMaxString(String maxstr) {
		System.out.println("Max length string is :"+maxstr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayStringMaxLength arrayStringMaxLength=new ArrayStringMaxLength();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the number of elements in array :");
		int size=scanner.nextInt();
		String[] arr=new String[size]; 
		for (int index=0;index<size;index++) {
			System.out.println("Enter the Array String element number at "+index);
			arr[index]=scanner.next();
		}
		String maxString=arrayStringMaxLength.getMaxStringValue(arr);
		arrayStringMaxLength.printMaxString(maxString);
		
	}

}
