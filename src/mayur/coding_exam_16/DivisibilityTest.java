package mayur.coding_exam_16;
import java.util.HashMap;

public class DivisibilityTest {
	HashMap<Integer, Integer> getDivisibilityTest(int [] arr){
		HashMap<Integer, Integer> Divisible = new HashMap<Integer, Integer>();
		for(int index = 0; index<arr.length; index++) {
			int num = arr[index];
			if(num % 3 == 0) {
				if(Divisible.containsKey(num))
					Divisible.put(num, Divisible.get(num)+1);
				else
					Divisible.put(num, 1);
			}
		}
		return Divisible;
	}

	public static void main(String[] args) {
		DivisibilityTest div = new DivisibilityTest(); 
		int [] arr = {6,2,6,6,3,4,15,3,3,5,5,12,13,17,12};
		HashMap<Integer, Integer> output = div.getDivisibilityTest(arr);
		System.out.println("Digits divided by 3 are "+output);
	}
}
