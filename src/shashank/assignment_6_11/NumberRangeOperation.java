/* Write only one program having following methods. [4 methods in same program]

1. On user define range print all even numbers.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 15
Output : Even numbers are:
		 10
		 12
		 14	

2. On user define range print all numbers which is divisible by 5.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 30
Output : Divisible by 5, numbers are:
		 10
		 15
		 20
		 25
		 30	

3. On user define range print all numbers which is divisible by 5 and divisible by 3.
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 18
Output : Divisible by 5 & 3, numbers are:
		 15

4. On user define range print all numbers which is divisible by 7 or 13.
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 40
Output : Divisible by 7 or 13, numbers are:
		 7 is divisible by 7
		 13 is divisible by 13
		 14 is divisible by 7
		 21 is divisible by 7
		 26 is divisible by 13
		 28 is divisible by 7
		 35 is divisible by 7
		 39 is divisible by 13
*/

package shashank.assignment_6_11;

public class NumberRangeOperation {

	public void evenNumber(int startIndex, int endIndex) {
		System.out.println("Even Numbers in given range " + startIndex + " and " + endIndex + " are follows:-");
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 2 == 0) {
				System.out.print(index + " ");
			}
		}
	}

	public void divisibleByFive(int startIndex, int endIndex) {
		System.out.println(
				"\nNumbers divsible by 5 in given range " + startIndex + " and " + endIndex + " are follows:-");
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 5 == 0)
				System.out.print(index + " ");
		}
	}

	public void divisibleByFiveAndThree(int startIndex, int endIndex) {
		System.out.println(
				"\nNumbers divsible by 5 and 3 in given range " + startIndex + " and " + endIndex + " are follows:-");
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 5 == 0 && index % 3 == 0)
				System.out.print(index + " ");
		}
	}

	public void divisibleBySevenAndThirteen(int startIndex, int endIndex) {
		System.out.println(
				"\nNumbers divsible by 7 and 13 in given range " + startIndex + " and " + endIndex + " are follows:-");
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 7 == 0)
				System.out.println(index + " is divisible 7 ");
			else if (index % 13 == 0)
				System.out.println(index +" is divisible 13");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberRangeOperation numberRangeOperation = new NumberRangeOperation();
		numberRangeOperation.evenNumber(10, 15);
		numberRangeOperation.divisibleByFive(10, 30);
		numberRangeOperation.divisibleByFiveAndThree(5, 18);
		numberRangeOperation.divisibleBySevenAndThirteen(5, 40);
	}

}
