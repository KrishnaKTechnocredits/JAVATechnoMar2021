/*
Assignment 4 : 25th Mar 2021

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


2. Create a class named as Student, which have methods like below.
a. studentName()
b. gainedMark()

Expectations:
• If student gain mark above 90% display student name with grade A+
• If student gain marks between 80% to 90% display name with grade A
• If student gain marks between 70% to 80% display name with grade B+
• If student gain marks between 60% to 70% display name with grade B
• If student gain marks below 60% display name with grade C

Sample input : Student name - Maulik, mark - 75
Sample output : Maulik received grade B+
 */

package amruta.Assignment_4;

class NumberGame{

		void findMaxnumber(int a, int b,int c){
			if(a>b && a>c){
				System.out.println("Maximum number is : "+a);
			}else if(b>a && b>c){
				System.out.println("Maximum number is : "+b);
			}else if(c>a && c>a){
				System.out.println("Maximum number is : "+c);
			}else{
				System.out.println("Maximum number could not found, all given numbers are same.");
			}
		}
		void findMinNumber(int a, int b, int c){
				if(a<b && a<c){
				System.out.println("Minimum number is : "+a);
			}else if(b<a && b<c){
				System.out.println("Minimum number is : "+b);
			}else if(c<a && c<a){
				System.out.println("Minimum number is : "+c);
			}else{
				System.out.println("Minimum number could not found, all given numbers are same.");
			}	
		}
		public static void main(String[] args){
			NumberGame numbergame = new NumberGame();
			numbergame.findMaxnumber(5,6,9);
			numbergame.findMinNumber(5,6,9);
			numbergame.findMaxnumber(3,3,3);
			numbergame.findMinNumber(3,3,3);
		}
}