/*Shift all Zero's at the end.

input : [1,3,0,3,0,6,0,9,23,45];
output : [1,3,3,6,9,23,45,0,0,0]*/

package nikita.codingExam9;

public class Zeros {
	
	int temp=0;
	
	int[] sortZero(int[] input){
		
	int[] output=new int[input.length];
	int index1=0;
	for(int index=0;index<input.length;index++) {
		
		if(input[index]!=0) {
			temp=input[index];
			input[index]=temp;
			output[index1]=input[index];
			index1++;
		}	
			
		}
	return output;
	
	}

public static void main(String[] args) {
	
	int[] input= {1,3,0,3,0,6,0,9,23,45};
	//Zeros z=new Zeros();
	int [] output= new Zeros().sortZero(input);
	for(int index=0;index<input.length;index++)
		System.out.println(output[index] + " ");
	
}
}
