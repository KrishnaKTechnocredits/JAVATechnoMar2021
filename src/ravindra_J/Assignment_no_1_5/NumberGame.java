/*Assignment 4 : 25th Mar 2021
 1. Create a class named as NumberGame with following method.
a. findMaxNumber()
method should take 3 parameters and print the maximum number from given 3 numbers.
if all numbers are same print "Maximum number could not found, All given numbers are equals".
b. findMinNumber()
method should take 3 parameters and print the minimum number from given 3 numbers.
if all numbers are same print "Minimum number could not found, All given numbers equal numbers".
Sample input : 13,4,19
Sample output : Maximum number is 13
Minimum number is 4
Sample input : 13,13,13
Sample output : Maximum number could not found, All given numbers are identical
Minimum number could not found, All given numbers are identical
hint : To compare max,
if(a>b && a>c)
sop("a max");
add appropiate logic for b and c.
 */

package ravindra_J.Assignment_no_1_5;

class NumberGame{
	void findMaxNumber(double num1, double num2, double num3){
		if(num1 == num2 && num2 == num3){
			System.out.println("Maximum number could not found, All given numbers are identical");
		}
		else if(num1 >= num2 && num1>=num3){
			System.out.println("Maximum number from given 3 number is - "+num1);
		}
		else if(num2>=num3){
			System.out.println("Maximum number from given 3 number is - "+num2);
		}
		else{
			System.out.println("Maximum number from given 3 number is - "+num3);
		}
		
	}
		void findMinNumber(double num1, double num2, double num3){
			if(num1 == num2 && num2 == num3){
				System.out.println("Minimum number could not found, All given numbers are identical");
			}
			else if(num1<= num2 && num1<=num3){
				System.out.println("Minimum number from given 3 number is - "+num1);
			}
			else if(num2<=num3){
				System.out.println("Minimum number from given 3 number is - "+num2);
			}
			else{
				System.out.println("Minimum number from given 3 number is - "+num3);
			}
		}
	
	public static void main(String []args){
		NumberGame numbergame = new NumberGame();
		numbergame.findMaxNumber(20,2,2);
		numbergame.findMinNumber(20,2,2);
		numbergame.findMaxNumber(8.85,45.85,45.85);
		numbergame.findMinNumber(22.3,22.2,22.2);
	}
	
	
	
}