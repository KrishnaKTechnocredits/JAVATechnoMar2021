/*Programming Test - 12 : 22nd May'2021

1) ArrayList<Integer> filerNumber(ArrayList<Integer> arr) [15 mins]
all the numbers, which is div by 3 or by 5 or by 3 & 5.

input : [10,2,3,6,15,44,32]
output : 10,3,6,15
*/
package sourabh.CodingExam_12_ArrayList;

import java.util.ArrayList;

public class FindNumbers {
	ArrayList<Integer> getFindNumbers(ArrayList<Integer> numberList) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int index = 0; index < numberList.size(); index++) {
			if (numberList.get(index) % 3 == 0 || numberList.get(index) % 5==0 || numberList.get(index) % 3==0 && numberList.get(index) % 5==0 )
				output.add(numberList.get(index));
		}		
		return output;
	}
	public static void main(String[] args) {
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		numberList.add(10);
		numberList.add(2);
		numberList.add(3);
		numberList.add(6);
		numberList.add(15);
		numberList.add(44);
		numberList.add(32);
		
		FindNumbers findNumbers= new FindNumbers();
		ArrayList<Integer> output= findNumbers.getFindNumbers(numberList);
		System.out.println(output);
	}
}
