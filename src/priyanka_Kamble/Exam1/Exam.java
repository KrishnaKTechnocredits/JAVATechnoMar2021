package priyanka_Kamble.Exam1;

public class Exam {
	
	int target = 9;

	void getindex(int[] arr) {
		for (int index = 0; index < arr.length; index++) {
			for (int innerIndex = 1; innerIndex < arr.length; innerIndex++) {
				if (arr[index] + arr[innerIndex] == target) {
					System.out.println(" Target Value " + arr[index] + "appearing at Index : " + index);

				}
			}
		}

	}

	public static void main(String[] args) {
		 int[] arr = {11,2,15,7,4};
		new Exam().getindex(arr);
	}

}