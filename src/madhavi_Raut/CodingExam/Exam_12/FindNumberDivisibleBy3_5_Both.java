package madhavi_Raut.CodingExam.Exam_12;

/*1) ArrayList<Integer> filerNumber(ArrayList<Integer> arr) [15 mins]
all the numbers, which is div by 3 or by 5 or by 3 & 5.
input : [10,2,3,6,15,44,32]
output : 10,3,6,15*/
import java.util.ArrayList;

public class FindNumberDivisibleBy3_5_Both {
	
	ArrayList<Integer> getNumberDivisibleBy3_5_Both(ArrayList<Integer> num) {
		ArrayList<Integer> newArrayList = new ArrayList<Integer>();
		for (int index = 0; index < num.size(); index++) {
			if (num.get(index) % 3 == 0 || num.get(index) % 5 == 0) {
				newArrayList.add(num.get(index));
			}
		}
		return newArrayList;
	}

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(10);
		num.add(2);
		num.add(3);
		num.add(6);
		num.add(15);
		num.add(44);
		num.add(32);
		
		System.out.println("Below are the numbers divisble by 3 or 5 or both:");
		System.out.println(new FindNumberDivisibleBy3_5_Both().getNumberDivisibleBy3_5_Both(num));
	}
}
