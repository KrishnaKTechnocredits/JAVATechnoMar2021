package monika.Array_Coding_Exam;

/*Program 1: Return Unique elements from given array. [30 mins max]
input : {10,2,3,10,3,55,61,2};
Ouput : {10,2,3,55,61}
Hint : create new array Called output, insert eligible numbers and return output array.
Hint : Method should take int array as parameter and return an array.*/
public class Test8_FindUniqueElements {

	String[] getUniqueElements(int[] arr) {
		int count = 0;
		String temp = "";
		String[] output = new String[(arr.length)];
		for (int index = 0; index < arr.length; index++) {
			temp = temp + String.valueOf(arr[index]) + " ";
		}
		for (int index = 0; index < temp.length();) {
			String s1 = temp.substring(0, 2).trim();
			int i = temp.indexOf(s1);
			int j = temp.lastIndexOf(s1);
			if (i != j) {
				output[count] = s1;
				// System.out.println(output[count]);
				count++;
				temp = temp.replaceAll(s1, "");
				temp = temp.trim();
			} else {
				output[count] = s1;
				temp = temp.replaceAll(s1, "");
				temp = temp.trim();
				count++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Test8_FindUniqueElements obj = new Test8_FindUniqueElements();
		int[] arr = { 10, 2, 3, 10, 3, 55, 61, 2 };
		String[] result = obj.getUniqueElements(arr);
		for (int index = 0; index < result.length; index++) {
			if (result[index] != null)
				System.out.println(result[index]);
		}
	}

}
