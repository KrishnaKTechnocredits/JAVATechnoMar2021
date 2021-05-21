/*
 Program 1: Return Unique elements from given array. [30 mins max]
input : {10,2,3,10,3,55,61,2};
Ouput : {10,2,3,55,61}
Hint : create new array Called output, insert eligible numbers and return output array.
Hint : Method should take int array as parameter and return an array.

Program 
 */
package ravindra_J.coding_exam_8;

public class UniqueElement {
	
	int[] uniEleFromArray(int arr[]) {
		int temp[]=new int[arr.length];
		int index1=0;
		for(int i=0;i<arr.length;i++) {
			int num1=arr[i];
			boolean flag=false;
			for(int index=0;index<i;index++) {
				int num2=arr[index];
				if(num1==num2) {
					flag=true;
					break;	
				}
			}
			if(flag==false) {
				temp[index1]=num1;
				index1++;
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		UniqueElement uniqueelement = new UniqueElement();
		int[] input={10,2,3,10,3,55,61,2};
		int output[]=uniqueelement.uniEleFromArray(input);
		for(int i=0;i<output.length;i++) {
			if(output[i]!=0)
			System.out.print(output[i]+" ");
		}

	}
}
