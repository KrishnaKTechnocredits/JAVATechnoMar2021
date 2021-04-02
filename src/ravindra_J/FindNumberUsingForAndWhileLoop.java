/*Write only one program having following methods. [4 methods in same program]

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
package ravindra_J;
public class FindNumberUsingForAndWhileLoop {
	int startNum, endNum, index;

	void DisplayEvenNumber(int num1,int num2) {

		startNum = num1;
		endNum = num2;
		System.out.print("Even No's Are :- ");
		for(index =0;startNum <= endNum; index++, startNum++) { 
			while(startNum % 2 == 0) {
				System.out.print(""+startNum+" ");
				startNum++;
			}
		}
		System.out.println(" ");
	}
	
	void DisplayDivisibleByFive(int num1,int num2) {

		startNum = num1;
		endNum = num2;
		System.out.print("Numbers Divisible By 5 between " +startNum+ " and " + endNum+ " Are :- ");
		for(index =0;startNum <= endNum; index++, startNum++) { 
			while(startNum % 5 == 0) {	
				System.out.print("" +startNum +" ");
				startNum++;
			}
		}
		System.out.println(" ");
	}

	void DisplayDivisibleByFiveAndThree(int num1,int num2) {

		startNum = num1;
		endNum = num2;
		System.out.print("Numbers Divisible By 5 & 3 between " +startNum+ " and " + endNum+ " Are :- ");
		for(index =0;startNum <= endNum; index++, startNum++) { 
			while(startNum % 5 == 0 && startNum %  3 == 0) {	
				System.out.print("" +startNum +" ");
				startNum++;
			}
		}
		System.out.println(" ");
	}
	
	void DisplayDivisibleBySevenAndThirteen(int num1,int num2) {

		startNum = num1;
		endNum = num2;
		System.out.print("Numbers Divisible By 7 & 13 between " +startNum+ " and " + endNum+ " Are :- ");
		for(index =0;startNum <= endNum; index++, startNum++) { 
			while(startNum % 7 == 0 || startNum %  13 == 0) {
				System.out.println(" ");
				System.out.print(startNum+" is divisible by " +startNum+ " ");
				startNum++;
			}
		}
	}
	public static void main(String []args) {
		FindNumberUsingForAndWhileLoop findnumberusingforandwhileloop = new FindNumberUsingForAndWhileLoop();
		findnumberusingforandwhileloop.DisplayEvenNumber(11, 20);
		findnumberusingforandwhileloop.DisplayDivisibleByFive(10, 30);
		findnumberusingforandwhileloop.DisplayDivisibleByFiveAndThree(5, 18);
		findnumberusingforandwhileloop.DisplayDivisibleBySevenAndThirteen(5, 40);
	}
}
// 11 15 11
