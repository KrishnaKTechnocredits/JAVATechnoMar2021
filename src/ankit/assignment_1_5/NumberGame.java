/*1. Create a class named as NumberGame with following method.
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

package ankit.assignment_01_5;
class NumberGame{
	
	void findMaxNumber(int x, int y, int z){
		if(x==y && x==z){
			System.out.println("Maximum number could not found, All given numbers are identical");
		}
		else if(x>y && x>z){
			System.out.println("Maximum number is : "+x);
		}
		else if(y>x && y>z){
			System.out.println("Maximum number is : "+y);
		}
		else{
			System.out.println("Maximum number is : "+z);
		}
	}
	void findMinNumber(int x, int y, int z){
		if(x==y && x==z){
			System.out.println("Minimum number could not found, All given numbers are identical");
		}
		else if(x<y && x<z){
			System.out.println("Minimum number is : "+x);
		}
		else if(y<x && y<z){
			System.out.println("Minimum number is : "+y);
		}
		else{
			System.out.println("Minimum number is : "+z);
		}
	}
	
	public static void main(String[] args){
		NumberGame numberGame = new NumberGame();
		numberGame.findMaxNumber(20,10,10);
		numberGame.findMinNumber(1,1,1);		
	}
}