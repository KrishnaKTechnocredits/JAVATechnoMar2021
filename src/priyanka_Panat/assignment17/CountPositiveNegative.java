/*
 Assignment - 17 : 10th April'2021   
Program 3:  From given numbers, count the negative and positive numbers.
input : 10,23,26,-27,-88,87,-65 
output : negative -> 3
         positive -> 4
 */

package priyanka_Panat.assignment17;

import java.util.Scanner;

public class CountPositiveNegative {
	int countpositive=0;
	int countnegative=0;
	
	void findPositiveNegativeNo(int[] num){
		for(int index=0;index<num.length;index++) {
			if(num[index]>=0){
				countpositive++;
			}
			else
			{
				countnegative++;
			}
			
		}
		System.out.println("No of positive numbers= " +countpositive);
		System.out.println("No of positive numbers= " +countnegative);
	}
	
	public static void main(String[] args) {
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the elements in an array");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		new CountPositiveNegative().findPositiveNegativeNo(arr);
		sc.close();
		}



}
