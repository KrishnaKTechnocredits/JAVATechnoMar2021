package monika;

/*Assignment 4 : 25th March 2021
1. Create a class named as NumberGame with following method.
a. findMaxNumber()
method should take 3 parameters and print the maximum number from given 3 numbers.
if all numbers are same print "Maximum number could not found, All given numbers are equals".
b. findMinNumber()
method should take 3 parameters and print the minimum number from given 3 numbers.
if all numbers are same print "Minimum number could not found, All given numbers equal numbers".
Sample input : 13,4,19
Sample output : Maximum number is 19
Minimum number is 4

Sample input : 13,13,13
Sample output : Maximum number could not found, All given numbers are identical
Minimum number could not found, All given numbers are identical*/

class NumberGame{
void findMaxNumber(int num1,int num2, int num3){
	if(num1>num2 && num1>num3){
		System.out.println("max no. is "+num1);
	}else if(num2 > num3){
		System.out.println("max no. is "+num2);
	}else if(num1 == num2 && num2 == num3){
		System.out.println("Maximum number could not found, All given numbers are equals");
	}else
		System.out.println("max no. is "+num3);
}
void findMinNumber(int x,int y, int z){
	if(x<y && x<z){
		System.out.println("min no. is "+x);
	}else if(y<x && y<z){
		System.out.println("min no. is "+y);
	}else if(x == y && y == z){
		System.out.println("Minimum number could not found, All given numbers are equals");
	}else
		System.out.println("min no. is "+z);
}
public static void main(String[] args){
	NumberGame numberGame = new NumberGame();
	numberGame.findMaxNumber(13,24,19);
	numberGame.findMinNumber(13,4,19);
	numberGame.findMaxNumber(12,12,12);
	numberGame.findMinNumber(12,12,12);
}
}