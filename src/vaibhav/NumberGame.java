/*Java Assignment 4: 25th March 2021

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

package vaibhav;

class NumberGame{
	
	void findMaxNumber(int a, int b, int c){
		if( a>b && a>c ){
			System.out.println("Maximum Number is " + a);
		}else if( b>a && b>c){
			System.out.println("Maximum Number is " + b);
		}else if( c>a && c>b){
			System.out.println("Maximum Number is " + c);
		}else{
			System.out.println("Maximum number could not found, All given numbers are equals");
		}
	}
	
	void findMinNumber(int a, int b, int c){
		if( a<b && a<c ){
			System.out.println("Minimum Number is " + a);
		}else if( b<a && b<c){
			System.out.println("Minimum Number is " + b);
		}else if( c<a && c<b){
			System.out.println("Minimum Number is " + c);
		}else{
			System.out.println("Minimum number could not found, All given numbers are equals");
		}
	}
	public static void main(String[] args){
		NumberGame numberGame = new NumberGame();
		numberGame.findMaxNumber(9,5,10);
		numberGame.findMinNumber(9,5,10);
		numberGame.findMaxNumber(8,8,8);
		numberGame.findMinNumber(8,8,8);
	}
}	
	