package madhavi_Raut.CodingExam.Exam_13;

import java.util.ArrayList;

/*1. return all the arm-strong number from given array.
input: [153,279,371,303,407]
output: [153,371,407]

public ArrayList<Integer> 
getArmStrongNumber(int numbers[]){
	//write your logic
}*/
public class FindArmstrong {

	ArrayList<Integer> getArmstrongNumber(int numArr[]) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		for (int index = 0; index < numArr.length; index++) {
			int num = numArr[index];
			int temp = num, sum = 0;
			while (!(temp == 0)) {
				int mod = temp % 10;
				temp = temp / 10;
				sum += mod * mod * mod;
			}
			if (num == sum) {
				arrList.add(num);
			}
		}
		return arrList;
	}

	public static void main(String[] args) {
		int[] numArr = { 153, 279, 371, 303, 407 };
		System.out.println("Below are armstrong numbers from given array:");
		System.out.println(new FindArmstrong().getArmstrongNumber(numArr));
	}	
}
