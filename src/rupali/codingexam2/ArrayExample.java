/*
 * Program 2 :
WAP to provide the difference between a Younger and an elder member of the family. 
Age is provided in the form of an array.
Sample Input: 7 12 56 62 25
Sample Output: 55
 */
package rupali.codingexam2;

public class ArrayExample {
	int getagediff(int[] input) {
		int min=input[0],max=input[0];
		for(int i=0;i<input.length;i++) {
			if(max<input[i])
				max=input[i];
			if(min>input[i])
				min=input[i];
		}
		return max-min;
	}
	public static void main(String[] args) {
		int[] input= {7,12,56,62,25};
		ArrayExample arrayExample=new ArrayExample();
		int output=arrayExample.getagediff(input);
		System.out.println(output);
	}

}
