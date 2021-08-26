package amrutaM.StringAssignment19;

/*program 4: 
sum of all numbers in given statement. 
input = "10 10 20 30"; 
output : 70
*/
public class Program4_sumOfAllNumbers {

	void getSumOfAllNumbers(String input) {
		String[] numbers = input.split(" ");
		int sum = 0;
		for (int index = 0; index < numbers.length; index++) {
			sum = sum + Integer.parseInt(numbers[index]);
		}
		System.out.println("Sum of the given numbers = " + sum);
	}

	public static void main(String[] args) {
		String input = "10 10 20 30";
		System.out.println("Input string of numbers is "+input);
		Program4_sumOfAllNumbers program4 = new Program4_sumOfAllNumbers();
		program4.getSumOfAllNumbers(input);
	}
}
