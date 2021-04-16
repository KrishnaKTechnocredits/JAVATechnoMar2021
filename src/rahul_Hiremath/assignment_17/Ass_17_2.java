/*Program 2: return a difference between sum of even number and odd numbers.	
	From given numbers, count the odd and even numbers.
	input : 10,23,26,27,88,87,65 
    output : evenSum - oddSum*/

package rahul_Hiremath.assignment_17;

public class Ass_17_2 {

	int evenTotal = 0;
	int oddTotal = 0;

	void even(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				evenTotal = evenTotal + array[i];
			}
		}
		System.out.println("Even total is: " + evenTotal);
	}

	void odd(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				oddTotal = oddTotal + array[i];
			}
		}
		System.out.println("Odd total is: " + oddTotal);
	}

	int difference() {
		int difference = evenTotal - oddTotal;
		return difference;
	}

	public static void main(String[] args) {
		Ass_17_2 ass_17_2 = new Ass_17_2();
		int[] array = { 10, 23, 26, 27, 88, 87, 65 };
		ass_17_2.even(array);
		ass_17_2.odd(array);
		int difference = ass_17_2.difference();
		System.out.println("Difference is: " + difference);
	}
}