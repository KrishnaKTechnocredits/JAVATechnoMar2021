package monika.Array_Coding_Exam;

import java.util.ArrayList;

/*Test - 17 :
Program 1 : return arrayList of triplet having maximum sum, index overlapping is not allowed.
input : [1,10,2,3,1,11,4,2,1] --> 8 --> length - 2, index = index+3
output : 3,1,11 -> 15

Program 2 : triplet having maximum sum, index overlapping is allowed.
input : [1,10,2,3,1,11,4,2,1]
output : 11,4,2 -> 17


Program 3 : triplet having maximum sum, index overlapping is not allowed.
input : [1,10,2,3,1,11,4,2,1,33,2] 
output : 11,4,2 -> 17*/
public class ReturnMaxSumOfTriplet {
	// Withoutoverlapping
	public static ArrayList<Integer> getMaxTripletWithoutOverlapping(int[] arr) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		int tempSum = 0;
		int var1 = 0, var2 = 0, var3 = 0;
		for (int index = 0; index < arr.length; index += 3) {
			if (arr[index] + arr[index + 1] + arr[index + 2] > tempSum) {
				tempSum = arr[index] + arr[index + 1] + arr[index + 2];
				var1 = arr[index];
				var2 = arr[index + 1];
				var3 = arr[index + 2];
			}
		}
		al.add(var1);
		al.add(var2);
		al.add(var3);
		return al;
	}

	// With overlapping index
	public static ArrayList<Integer> getMaxTripletWithOverlapping(int[] arr) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		int tempSum = 0, count = 1;
		int var1 = 0, var2 = 0, var3 = 0;
		for (int index = 0; index < (arr.length); index++) {
			if (arr.length - count >= 3) {
				if ((arr[index] + arr[index + 1] + arr[index + 2]) > tempSum) {
					tempSum = arr[index] + arr[index + 1] + arr[index + 2];
					var1 = arr[index];
					var2 = arr[index + 1];
					var3 = arr[index + 2];
				}
			}
			count++;
		}
		al.add(var1);
		al.add(var2);
		al.add(var3);
		return al;
	}

	// Overlapping not allowed and elements are unequal
	public static ArrayList<Integer> getMaxTripletWithoutOverlappingUnequal(int[] arr) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		int tempSum = 0, count = 1;
		int var1 = 0, var2 = 0, var3 = 0;
		for (int index = 0; index < arr.length; index += 3) {
			int i = arr.length - count;
			if (i >= 3) {
				if (arr[index] + arr[index + 1] + arr[index + 2] > tempSum) {
					tempSum = arr[index] + arr[index + 1] + arr[index + 2];
					var1 = arr[index];
					var2 = arr[index + 1];
					var3 = arr[index + 2];
				}
			}count+=3;
		}
		al.add(var1);
		al.add(var2);
		al.add(var3);
		return al;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 10, 2, 3, 1, 11, 4, 2, 1 };
		// Without overlapping
		ArrayList<Integer> al = getMaxTripletWithoutOverlapping(arr);
		System.out.println("Program1 : max triplet without overlapping with even elements : "+al);
		// With overlapping
		ArrayList<Integer> alWithOverlapping = getMaxTripletWithOverlapping(arr);
		System.out.println("Program2 : max triplet with overlapping with even elements : "+alWithOverlapping);

		int[] arrProgram3 = { 1, 10, 2, 3, 1, 11, 4, 2, 1, 33, 2 };
		// Without overlapping
		ArrayList<Integer> alNew = getMaxTripletWithoutOverlappingUnequal(arrProgram3);
		System.out.println("Program3 : max triplet without overlapping with even elements : "+alNew);
	}

}
