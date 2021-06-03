package monika.Array_Coding_Exam;

/*2. Return all the unique numbers from given array.
input: [1,8,6,3,4,5,2,3,6,9,8,4]
output: [1,8,6,3,4,5,2,9]
public ArrayList<Integer> getUniqueNumbers(int words[]){
	//write your logic
}*/
import java.util.ArrayList;

public class Test14_ReturnUniqueElements {
	ArrayList<Integer> getUniqueArr(int[] arr) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		for (int index = 0; index < arr.length; index++) {
			if (!arrList.contains(arr[index])) {
				arrList.add(arr[index]);
			}
		}
		return arrList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test14_ReturnUniqueElements obj = new Test14_ReturnUniqueElements();
		int[] arr = { 1, 8, 6, 3, 4, 5, 2, 3, 6, 9, 8, 4 };
		ArrayList<Integer> outputArrayList = obj.getUniqueArr(arr);
		System.out.println(outputArrayList);
	}
}
