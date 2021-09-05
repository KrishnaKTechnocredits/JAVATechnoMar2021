package amrutaM.Assignment27;

import java.util.Arrays;

/*WAP to find 2 arrays are identical or not.  
int[] arr1 = {10,12,55,32,17}; 
int[] arr2 = {10,12,55,32,17}; 
output : Identical*/
public class P1_Identical {

	void checkIdentical(int[] arr1, int[] arr2) {
		boolean flag = true;
		if (arr1.length == arr2.length) {
			for (int index = 0; index < arr1.length; index++) {
				if (arr1[index] == arr2[index]) {
					flag = true;
				} else if (arr1[index] != arr2[index]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println("Arrays are identical");
			} else {
				System.out.println("Arrays are unidentical");
			}
		}else if(arr1.length!=arr2.length){
			System.out.println("Arrays are unidentical");
		}
	}
	
	public static void main(String[] args) {
		int[] arr1 = { 10, 12, 55, 32, 17 };
		int[] arr2 = { 10, 12, 55, 32, 17};
		
		int[] array1 = {10,12,55,32,17,99};
		int[] array2 = {10,12,55,32,17}; 
		
		int[] arr11 = {10,12,55,32,17}; 
		int[] arr12 = {10,12,99,32,17}; 
		
		P1_Identical p1_Identical = new P1_Identical();
		p1_Identical.checkIdentical(arr1, arr2);
		p1_Identical.checkIdentical(array1, array2);
		p1_Identical.checkIdentical(arr11, arr12);
	}
}
