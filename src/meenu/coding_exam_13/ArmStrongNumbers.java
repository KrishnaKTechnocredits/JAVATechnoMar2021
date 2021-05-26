package meenu.coding_exam_13;

import java.util.ArrayList;

/*1. return all the arm-strong number from given array.
input: [153,279,371,303,407]
output: [153,371,407]                    
 */
public class ArmStrongNumbers {
	
	public ArrayList<Integer> getArmStrongNum(ArrayList<Integer> numberList){
		ArrayList<Integer> ArmStrongNumList = new ArrayList<Integer>();
		for(int numbers : numberList) {
			int tempNum = numbers;
			int r = 0;
			int outputNum = 0;
			while(tempNum>0){
				r = tempNum%10;
				outputNum = outputNum +(r*r*r);
				tempNum = tempNum/10;				
			}
			if(outputNum == numbers)
				ArmStrongNumList.add(numbers);
		}	
		return ArmStrongNumList;
	}

	public static void main(String[] args) {
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		numberList.add(153);
		numberList.add(279);
		numberList.add(371);
		numberList.add(303);
		numberList.add(407);
		
		ArmStrongNumbers t131 = new ArmStrongNumbers();
		System.out.println(t131.getArmStrongNum(numberList));
	}
}
