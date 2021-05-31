/*
 * Assignment - 30 : 4th May'2021

WAP to find Second max from given array
int[] arr = {10,33,43,55,97,11,3};
ouput : 55 

 */
package rupali.assignment30;

public class SecondMax {
	int getsecondmax(int[] input) {
		int max=0;
		int i,j;
		for(i=0;i<input.length;i++) {
			for(j=i+1;j<input.length;j++) {
				if(input[i]>input[j]) {
					max=input[i];
					input[i]=input[j];
					input[j]=max;
				}
			}
		}
		System.out.println(input[i-2]);
		return input[i-1];
	}
	
	public static void main(String[] args) {
		int[] arr = {10,33,43,55,97,11,3};
		SecondMax secondmax=new SecondMax();
		int output=secondmax.getsecondmax(arr);
		System.out.println(output);
	}

}
