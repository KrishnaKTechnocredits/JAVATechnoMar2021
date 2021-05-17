package madhavi_Khasbage.Coding_Exam_8;
/*Programming Test - 8 :
Program 1: Return Unique elements from given array. [30 mins max]
input : {10,2,3,10,3,55,61,2};
Ouput : {10,2,3,55,61}
Hint : create new array Called output, insert eligible numbers and return output array.
Hint : Method should take int array as parameter and return an array.

Program 2: Print Fibinacci series up to 8 numbers. [10 mins]
output : 0 1 1 2 3 5 8 13 */

public class FindUniqueNumInArray {
	int[] getUniqueArray(int[] array) {
		int[] unqArray = new int[array.length];
		int cnt = 0;
		int cnt1 = 0;
		for (int index = 0; index < array.length; index++) {
			for (int indexIn = 0; indexIn < index; indexIn++) {
				if (array[index] == array[indexIn]) {
					cnt = 1;
					break;
				}
			}

			if (cnt == 0) {
				unqArray[cnt1] = array[index];
				cnt1++;
			}
			cnt = 0;
		}		
		return unqArray;
	}

	String getFibonacciSeries(int range) {		
		String strOutPut = "";		
		int cnt1 = 0, cnt2 = 1, cnt3 = 0;	
		strOutPut = cnt1 + " " + cnt2 + " ";
		for (int index = 2; index < range; index++) {
			cnt3 = cnt1 + cnt2;
			strOutPut += cnt3 + " ";
			cnt1 = cnt2;
			cnt2 = cnt3;
		}
		return strOutPut;
	}

	public static void main(String[] args) {
		FindUniqueNumInArray returnUniqueArray1 = new FindUniqueNumInArray();
		int[] array = { 10, 11, 2, 3, 10, 3, 55, 61, 2, 11 };
		int[] arrayOutPut = returnUniqueArray1.getUniqueArray(array);		
		System.out.println("Below are the unique elements from given array:");
		
		for (int index1 = 0; index1 < arrayOutPut.length; index1++) {			
			if(arrayOutPut[index1]!=0)
			System.out.println(arrayOutPut[index1]);
		}

		System.out.println("\nBelow is the fibonacci series up to 8 number:");		
		System.out.println(returnUniqueArray1.getFibonacciSeries(8));

	}

}
