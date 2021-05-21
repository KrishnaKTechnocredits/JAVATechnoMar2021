package monika.Array_Coding_Exam;
/*Program 2: Print Fibinacci series up to 8 numbers. [10 mins]
output : 0 1 1 2 3 5 8 13 
0+1 = 1, first+2nd = 3rd index = 0,1
1+1 = 2, 2nd +3rd = 4th index = 1,2
1+2 = 3, 3rd +4th = 5th index 2,3
*
*/
public class Mk_FindUnique_Test8 {
	int[] printFibSeries(int inputFirst, int inputSec) {
		int[] arr = new int[8];
		arr[0] = inputFirst;
		arr[1]=inputSec;
		int count = 0;
		for(int index=2;index<arr.length;index++) {
			arr[index] = arr[count] + arr[count+1];
			count++;
		}
		return arr;
	}

	public static void main(String[] args) {
		Mk_FindUnique_Test8 obj = new Mk_FindUnique_Test8();
		int[] arr = obj.printFibSeries(0, 1);
		for(int index=0;index<arr.length;index++) {
			System.out.println(arr[index]);
		}
	}

}
