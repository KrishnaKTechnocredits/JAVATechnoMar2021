package gauravk.Assignment_3_prg5_6;


import java.util.Scanner;

/*#3
 * Program 7:  From given array return min number.
input : 22,35,65,88,11,23,45
output : 11
 */

public class MinOfNumArray {

	int min = 0;
	
	void findNumMin(int[] arr) {
		for(int index=0; index<arr.length; index++) {
			if(arr[index]<min)
				min = arr[index];
		}
	}
	
	void display() {
			System.out.println("Minimum number from array of numbers is "+min);
	}
	
	public static void main(String[] args) {
		MinOfNumArray minOfNumArray = new MinOfNumArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please tell us how many numbers you want to analyse.");
		int a = sc.nextInt();
		int[] arr2 = new int[a];
		for(int index=0; index<a; index++) {
			System.out.println("Enter "+(index+1)+" number");
			arr2[index]=sc.nextInt();
		}
		minOfNumArray.findNumMin(arr2);
		minOfNumArray.display();
	}
}