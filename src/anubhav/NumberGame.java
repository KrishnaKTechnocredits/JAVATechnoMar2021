/* Create a class named as NumberGame with following method.
a. findMaxNumber()
method should take 3 parameters and print the maximum number from given 3 numbers.
if all numbers are same print "Maximum number could not be found, All given numbers are equals".

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
add appropiate logic for b and c.*/
package anubhav;

class NumberGame{
		
	void findMaxNumber(int number1, int number2, int number3){
		if(number1>number2 && number1>number3){
			System.out.println("Maximum number is " + number1);
		}else if(number2>number3 && number2>number1){
			System.out.println("Maximum number is " + number2);
		}else if(number3>number1 && number3>number2){
			System.out.println("Maximum number is " + number3);
		}else{
			System.out.println("Maximum number could not found, All given numbers are equals");
		}
	}
	
	void findMinNumber(int number1, int number2, int number3){
		if(number1<number2 && number1<number3){
			System.out.println("Minimum number is " + number1);
		}else if(number2<number3 && number2<number1){
			System.out.println("Minimum number is " + number2);
		}else if(number3<number1 && number3<number2){
			System.out.println("Minimum number is " + number3);
		}else{
			System.out.println("Minimum number could not found, All given numbers are equals");
		}
	}
	
	public static void main (String[] args){
		NumberGame numberGame= new NumberGame();
		numberGame.findMaxNumber(14,13,12);
		numberGame.findMinNumber(14,13,12);
		numberGame.findMaxNumber(13,13,13);
		numberGame.findMinNumber(13,13,13);
	}
}
