package monika.Array_Coding_Exam;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*1. return all the arm-strong number from given array.
input: [153,279,371,303,407]
output: [153,371,407]

public ArrayList<Integer> getArmStrongNumber(int numbser[]){
	//write your logic
}*/
public class Test13_ReturnAllArmStrongNum {

	public ArrayList<Integer> getArmStrongNumber(int[] number) {

		ArrayList<Integer> arrList1 = new ArrayList<Integer>();
		for (int i : number) {
			int temp = i;
			int sum = 0;
			while (temp > 0) {
				int mod = temp % 10;
				sum += (mod * mod * mod);
				temp = temp / 10;
			}
			if (sum == i) {
				arrList1.add(i);
			}
		}

		ArrayList<Integer> arrList = new ArrayList<Integer>();
		int temp = number[0];
		for (int index = 0; index < number.length; index++) {
			int sum = 0;
			while (temp > 0) {
				int mod = temp % 10;
				sum += (mod * mod * mod);
				temp = temp / 10;
			}
			if (sum == number[index]) {
				arrList.add(sum);
			}
			if (index < number.length - 1) {
				temp = number[index + 1];
				// sum = 0;
			}
		}
		 System.out.println("IndexLoop : "+arrList);
		return arrList1;
	}

	public static void main(String[] args) {
		Test13_ReturnAllArmStrongNum obj = new Test13_ReturnAllArmStrongNum();
		int[] number = { 153, 279, 371, 303, 407 };
		ArrayList<Integer> outputList = obj.getArmStrongNumber(number);
		System.out.println("EnhancedLoop : " + outputList);
	}

}
