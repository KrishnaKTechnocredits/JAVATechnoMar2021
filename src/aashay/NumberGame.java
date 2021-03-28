package aashay;
/*
 * Create a class named as NumberGame with following method.
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

class NumberGame{
	

	void findMaxNumber(int num1,int num2,int num3){
		if(num1 > num2 && num1 > num3){
			System.out.println("Maximum number is:"+num1);
		} else if(num2 > num1 && num2 > num3){
			System.out.println("Maximum number is:"+num2);
		} else if(num3 > num2 && num3 > num1){
			System.out.println("Maximum number is:"+num3);
		}else{
			System.out.println("Maximum number could not found, All given numbers equal numbers");
		}
	}
	
	void findMinNumber(int num1,int num2,int num3){
		if(num1 < num2 && num1 < num3){
			System.out.println("Minimum number is:"+num1);
		} else if(num2 < num1 && num2 < num3){
			System.out.println("Minimum number is:"+num2);
		} else if(num3 < num2 && num3 < num1){
			System.out.println("Minimum number is:"+num3);
		}else{
			System.out.println("Minimum number could not found, All given numbers equal numbers");
		}
	}
	
	public static void main(String [] args){
		NumberGame numberGame = new NumberGame();
		numberGame.findMaxNumber(13,4,19);
		numberGame.findMaxNumber(4,4,4);
		numberGame.findMinNumber(13,4,19);
		numberGame.findMinNumber(4,4,4);
	}
	
	




}