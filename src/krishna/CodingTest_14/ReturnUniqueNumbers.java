package krishna.CodingTest_14;

/*2. Return all the unique numbers from given array.
input: [1,8,6,3,4,5,2,3,6,9,8,4]
output: [1,8,6,3,4,5,2,9]
public ArrayList<Integer> getUniqueNumbers(int words[]){
        //write your logic
}*/
import java.util.ArrayList;

public class ReturnUniqueNumbers {

	static int[] arr = { 1, 8, 6, 3, 4, 5, 2, 3, 6, 9, 8, 4 };

	public static ArrayList<Integer> getUniqueNumbers(int words[]) {
		ArrayList<Integer> newArr = new ArrayList<Integer>();

		for (int temp : words) {
			if (!newArr.contains(temp))
				newArr.add(temp);
		}
		return newArr;
	}

	public static void main(String[] args) {
		ArrayList<Integer> output = ReturnUniqueNumbers.getUniqueNumbers(arr);
		System.out.println("The unique numbers from given array : " + output);
	}

}
