package madhavi_Khasbage.Coding_exam_13;
import java.util.ArrayList;
import java.util.Arrays;
public class ArmStrongNumber {
	ArrayList<Integer> getArmStrongNumber(int arr[]) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		int n1 = 0, n2 = 0, result = 0, temp = 0;
		for (int index = 0; index < arr.length; index++) {
			n1 = arr[index];
			temp = arr[index];
			while (n1 > 0) {
				n2 = n1 % 10;
				n1 = n1 / 10;
				result = result + (n2 * n2 * n2);
			}
			if (temp == result) {
				arrList.add(arr[index]);				
			}
			result = 0;
		}
		return arrList;
	}

	public static void main(String[] args) {
		ArmStrongNumber armStrongNumber = new ArmStrongNumber();
		int[] arr = { 153, 279, 371, 303, 407 };
		System.out.println("Input:" + Arrays.toString(arr));
		ArrayList<Integer> arrList = armStrongNumber.getArmStrongNumber(arr);
		System.out.println("These are the ArmStrong number from give array : " + arrList);
	}
}
