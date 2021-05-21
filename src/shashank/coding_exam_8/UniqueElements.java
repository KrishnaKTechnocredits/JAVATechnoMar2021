package shashank.coding_exam_8;

/*Programming Test - 8 :


Program 1: Return Unique elements from given array. [30 mins max]
input : {10,2,3,10,3,55,61,2};
Ouput : {10,2,3,55,61}
Hint : create new array Called output, insert eligible numbers and return output array.
Hint : Method should take int array as parameter and return an array.
*/
public class UniqueElements {

	public int[] uniqueElementsInArray(int array[]) {
		boolean flag = false;
		int[] output = new int[array.length];
		for (int index = 0; index < array.length; index++) {
			flag = false;
			for (int innerIndex = index + 1; innerIndex < array.length; innerIndex++) {
				if (array[index] == array[innerIndex])
					flag = true;
			}
			if (flag == false)
				output[index] = array[index];
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 2, 3, 10, 3, 55, 61, 2 };
		UniqueElements uniqueElements = new UniqueElements();
		int uniqueArr[] = uniqueElements.uniqueElementsInArray(arr);
		System.out.println("Unique Elements in given array is ");
		for (int index = 0; index < uniqueArr.length; index++) {
			if (uniqueArr[index] != 0)
				System.out.print(uniqueArr[index] + " ");
		}
	}

}
