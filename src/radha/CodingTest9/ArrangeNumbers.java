/*
Programming Test - 9 [15 mins]
Shift all Zero's at the end.

input : [1,3,0,3,0,6,0,9,23,45];
output : [1,3,3,6,9,23,45,0,0,0]
 */
package radha.CodingTest9;

public class ArrangeNumbers {
	
	int[] shiftZeros(int[] inputArr) {
		int[] outputArr = new int[inputArr.length];
		int count=0;
		for(int index=0;index<inputArr.length;index++) {
			if(inputArr[index]!=0) {
				outputArr[count]=inputArr[index];
				count++;
			}
		}
		return outputArr;
	}
	
	public static void main(String[] args) {
		ArrangeNumbers shiftZero = new ArrangeNumbers();
		int[] arr = {1,3,0,3,0,6,0,9,23,45};
		int [] output = shiftZero.shiftZeros(arr);
		System.out.println("Array after shifting zeros is: ");
		for(int index=0; index<output.length;index++) {
			System.out.print(output[index]+" ");
		}
	}
}