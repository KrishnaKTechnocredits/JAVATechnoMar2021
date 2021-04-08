/*Create a class named as NumberGame with following method.
a. findMaxNumber()
method should take 3 parameters and print the maximum number from given 3 numbers.
if all numbers are same print "Maximum number could not found, All given numbers are equals".

b. findMinNumber()
method should take 3 parameters and print the minimum number from given 3 numbers.
if all numbers are same print "Minimum number could not found, All given numbers equal numbers".*/


package simmi.assignment_1_5;

class NumberGame{
	
	void findMaxNumber(int num1, int num2, int num3){
	if(num1 > num2 && num1 > num3){
		System.out.println("First number is maximum " + num1);
	}
	else if(num2 > num3){
		System.out.println("Second number is maximum " + num2);
		}
			else if(num1 == num2 && num2 == num3){
				System.out.println("All three numbers are equal");
			}
				else{
					System.out.println("Third number is maximum " + num3);
				}
	}
	
	void findMinNumber(int num1, int num2, int num3){
	if(num1 < num2 && num1 < num3){
		System.out.println("First number is minimum " + num1);
	}
	else if(num2 < num3){
		System.out.println("Second number is minimum " + num2);
		}
			else if(num1 == num2 && num2 == num3){
				System.out.println("All three numbers are equal");
			}
				else {
					System.out.println("Third number is minimum " + num3);
				}
	}
					
	public static void main(String[] args){
		NumberGame numberGame = new NumberGame();
		numberGame.findMaxNumber(14,6,9);
		numberGame.findMaxNumber(6,6,6);
		numberGame.findMinNumber(6,7,1);
		numberGame.findMinNumber(9,9,9);
	}
}