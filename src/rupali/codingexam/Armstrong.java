/*
 * 1. return all the arm-strong number from given array.
input: [153,279,371,303,407]
output: [153,371,407]

public ArrayList<Integer> getArmStrongNumber(int number[]){
	//write your logic
}

 */
 package rupali.codingexam;
 import java.util.ArrayList;
 

public class Armstrong {
	public ArrayList<Integer> getArmstrongNumber(int[] numbers){
		ArrayList<Integer> number=new ArrayList<Integer>();
		int temp1=0,temp2=0,temp3=0;
		for(int index=0;index<numbers.length;index++) {
			temp1=0;
			temp3=0;
			temp2=numbers[index];
			while(temp2>0) {
				temp1=temp2%10;
				temp2=temp2/10;
				temp3=temp3+(temp1*temp1*temp1);
			}
			if(numbers[index]==temp3)
				number.add(temp3);
		}
		
		return number;
	}

	public static void main(String[] args) {
		int[] arr= {153,279,371,303,407};
		Armstrong armstrong=new Armstrong();
		System.out.println("Input array is: ");
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		System.out.println("Output array is: ");
		ArrayList<Integer> output = armstrong.getArmstrongNumber(arr);
		System.out.println(output);
	}
}
