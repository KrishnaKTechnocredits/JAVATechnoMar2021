package prachi.Coding_Exam_9;

/*"Shift all Zero's at the end.

input : [1,3,0,3,0,6,0,9,23,45];
output : [1,3,3,6,9,23,45,0,0,0]"
 */

public class ShiftZeros {
	static int[] arrInput= {1,3,0,3,0,6,0,9,23,45};
	
	int[] getShiftZeros(int[] arrInput) {
		int[] outputArr= new int[arrInput.length];
		int indexOutput=0;
		
		for(int index=0; index<arrInput.length; index++) {
			if(arrInput[index]!=0){
				outputArr[indexOutput]= arrInput[index];
			indexOutput++;
			}
		}
		return outputArr;		
	}
	
	public static void main(String[] args) {
		ShiftZeros shift= new ShiftZeros();
		int[] arrOuput= shift.getShiftZeros(arrInput);
		for(int index=0; index<arrOuput.length; index++) {
		System.out.print(arrOuput[index]+" ");
		}
	}
}
