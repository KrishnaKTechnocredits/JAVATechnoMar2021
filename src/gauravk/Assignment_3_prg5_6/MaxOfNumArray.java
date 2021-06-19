package gauravk.Assignment_3_prg5_6;


import java.util.Scanner;

/*#3
 * Program 6:  From given array return max number.
input : 22,35,65,88,11,23,45
output : 88
 */

public class MaxOfNumArray {

	int max = 0;
	
	void findNumMax(int[] arr) {
		for(int index=0; index<arr.length; index++) {
			if(arr[index]>max)
				max = arr[index];
		}
	}
	
	void display() {
			System.out.println("Maxmum number from array of numbers is "+max);
	}
	
	public static void main(String[] args) {
		MaxOfNumArray maxOfNumArray = new MaxOfNumArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please tell us how many numbers you want to analyse.");
		int a = sc.nextInt();
		int[] arr2 = new int[a];
		for(int index=0; index<a; index++) {
			System.out.println("Enter "+(index+1)+" number");
			arr2[index]=sc.nextInt();
		}
		maxOfNumArray.findNumMax(arr2);
		maxOfNumArray.display();
	}
}