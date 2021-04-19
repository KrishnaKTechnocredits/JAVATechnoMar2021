/*
 * Program 4:  From given numbers, return the frequency of target number.
input : 10,23,23,44,23,10,23,4,23
target number : 23         
output : Freq of 23 is 4

Program 5:  return true if you find a target number from given array else return false.
input : 10,23,23,44,23,10,23,4,23
target number : 45
output : Number 45 doesnt found in given array.

boolean isNumberPresent(int[] arr,int target){
	if(arr[index] == target)
		
}  


 */
package rupali.assignment17;
import java.util.Scanner;



public class ArrayExample4 {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the legnth of Array");
		int l=s1.nextInt();
		System.out.println("Enter the intgers for array");
		int[] number= new int[l];
		for(int i=0;i<number.length;i++) 
			number[i]=s1.nextInt();
		System.out.println("Enter the number match");
		int t=s1.nextInt();
		new ArrayExample4().freqoftarget(number,t);
		
	}
	
	void freqoftarget(int[] num,int target) {
		int count=0;
		for (int index=0;index<num.length;index++) {
			if(num[index]==target)
				count++;
		}
		System.out.println(target+" number is appeared "+count+" times in the given array");
	}


}


