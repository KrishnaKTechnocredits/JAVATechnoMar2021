/*
 Program 5: return true if you find a target number from given array else return false.
input : 10,23,23,44,23,10,23,4,23
target number : 45
output : Number 45 doesnt found in given array.

boolean isNumberPresent(int[] arr,int target){
	if(arr[index] == target)
		
}  
 */
package upasana.assignment_17;
import java.util.Scanner;
public class Target {
	boolean isNumberPresent(int[] arr,int target){
		for(int index=0;index<arr.length;index++){
			if(arr[index]==target)
				return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int[] arr= {10,23,23,44,23,10,23,4,23};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter target number ");
		int tar=sc.nextInt();
		boolean ans=new Target().isNumberPresent(arr,tar);
		if(ans==false)
			System.out.println("Number " +tar+"  doesnt found in given array");
		sc.close();
	}
}