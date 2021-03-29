/*Assignment no 4
 * 1. Create a class named as NumberGame with following method.
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
add appropiate logic for b and c.*/

package pravin;
class NumberGame {

	void findMaximumNumber(int a,int b,int c){
		if (a>b && a>c){
			System.out.println("The maximum number from given 3 numbers is "+a);
		}else if(b>c){
			System.out.println("The maximum number from given 3 numbers is "+b);
		}else if(a == b && b == c){
			System.out.println("Maximum number could not found, All given numbers are equals");
		}else {
			System.out.println("The maximum number from given 3 numbers is "+c);
		}
	}
	void findMinimumNumber(int a,int b,int c){
		if (a<b && a<c){
			System.out.println("The minimum number from given 3 numbers is "+a);
		}else if(b<c){
			System.out.println("The minimum number from given 3 numbers is "+b);
		}else if(a == b && b == c){
			System.out.println("Maximum number could not found, All given numbers are equals");
		}else {
			System.out.println("The minimum number from given 3 numbers is "+c);
		}
	}
	public static void main(String[]args){
		NumberGame numberGame = new NumberGame();
		numberGame.findMaximumNumber(20,2,15);
		numberGame.findMinimumNumber(20,2,15);
		numberGame.findMaximumNumber(13,13,13);
	}
}

