/*
Programming Test - 9 [15 mins]
Shift all Zero's at the end.

input : [1,3,0,3,0,6,0,9,23,45];
output : [1,3,3,6,9,23,45,0,0,0]
*/
package sourabh.CodingExam_9;

public class ShiftAllZeroAtEnd {
	int[] getShiftAllZeroAtEnd(int[] arrInput) {
		int[] arrOutput= new int[arrInput.length];
		int indexOutput=0;
		for(int index=0; index<arrInput.length; index++) {
			if(arrInput[index]!=0){
			arrOutput[indexOutput]= arrInput[index];
			indexOutput++;
			}
		}
		return arrOutput;		
	}
	public static void main(String[] args) {
		ShiftAllZeroAtEnd shiftAllZeroAtEnd= new ShiftAllZeroAtEnd();
		int[] arrInput= {1,3,0,3,0,6,0,9,23,45};
		int[] arrOuput= shiftAllZeroAtEnd.getShiftAllZeroAtEnd(arrInput);
		for(int index=0; index<arrOuput.length; index++) {
		System.out.print(arrOuput[index]+" ");
		}
	}
}
