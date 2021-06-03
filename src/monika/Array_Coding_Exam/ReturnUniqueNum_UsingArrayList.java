package monika.Array_Coding_Exam;

/*2. Return all the unique numbers from given array.
input: [1,8,6,3,4,5,2,3,6,9,8,4]
output: [1,8,6,3,4,5,2,9]
public ArrayList<Integer> getUniqueNumbers(int words[]){
	//write your logic*/
//}
import java.util.ArrayList;

public class ReturnUniqueNum_UsingArrayList {

	// Did not worked
	ArrayList<Integer> getUniqueArr1(int[] words) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		for (int index = 0; index < words.length; index++) {
			arrList.add(words[index]);
		}
		//ArrayList<Integer> arrOutput = new ArrayList<Integer>();
		for (int num : words) {
			if (arrList.indexOf(num) != arrList.lastIndexOf(num)) {
				arrList.remove(num);
				//arrOutput.add(num);
			} /*else if(arrList.indexOf(num) == arrList.lastIndexOf(num))
				arrOutput.add(num);*/
		}
		return arrList;
	}
	
	//To find unique elements in the array
	boolean getUniqueNum(int[] arr, int num){
		int count = 0;
		for(int index=0;index<arr.length;index++) {
			if(num == arr[index]) {
				count++;
				if(count == 2)
					return false;
					//break;
			}
		}
		return true;
	}
	
	ArrayList<Integer> getUniqueArr(int[] arr){
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		for(int index=0;index<arr.length;index++) {
			boolean result = getUniqueNum(arr, arr[index]);
			if(result)
				arrList.add(arr[index]);
		}
	return arrList;	
	}
	//End of unique elements proram

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnUniqueNum_UsingArrayList obj = new ReturnUniqueNum_UsingArrayList();
		int[] arr = { 1, 8, 6, 3, 4, 5, 2, 3, 6, 9, 8, 4 };
		ArrayList<Integer> outputArrayList = obj.getUniqueArr(arr);
		System.out.println(outputArrayList);
	}

}
