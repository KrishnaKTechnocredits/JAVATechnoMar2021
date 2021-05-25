/*
  return highest missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10};
output : 8
 */
package ravindra_J.coding_exam_7;

public class HighestMissNoArray {
	int temp=0;
	int maxNo(int arr1[]) {
		for(int index=0;index<arr1.length;index++) {
			if(temp<arr1[index]) {
				temp=arr1[index];		
			}		
		}
		return temp;
	}
	int highestMissingNo(int arr[]) {
		int[] arr1= new int[arr.length];
		int i=0;
		for(int num=1;num<=10;num++) {
			boolean falg=false;
			for(int index=0;index<arr.length;index++) {
				if(num==arr[index]) {
					falg=true;
					break;
				}
			}
			if(falg==false) {
				arr1[i]=num;
				i++;
			}
		}
		return maxNo(arr1);
	}

	public static void main(String[] args) {
		HighestMissNoArray highestmissnosarrya = new HighestMissNoArray();
		int[] input={1,3,4,7,9,10};
		int output=highestmissnosarrya.highestMissingNo(input);
		System.out.println("Max No is:= "+output);
	}

}
