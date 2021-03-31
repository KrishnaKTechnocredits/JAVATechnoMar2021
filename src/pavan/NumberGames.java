/*
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
 */

package pavan;
class NumberGames{
	int fnum,snum,tnum;
	
	void setDetails(int a, int b, int c){
		fnum=a;
		snum=b;
		tnum=c;
	}	
	void findMaxNumber(){
		if (fnum>snum && fnum>tnum){
			System.out.println("The Biggest number is: "+fnum);
		}else if(snum>fnum && snum>tnum){
			System.out.println("The Biggest number is: "+snum);
		}else if (tnum>fnum && tnum>snum){
			System.out.println("The Biggest number is: "+tnum);
		}
		else{
			System.out.println("Maximum/minimum number could not found, All given numbers are identical");
		}
	}
	void findMinNum(){	
		if (fnum<snum && fnum<tnum){
			System.out.println("The Smaller number is :" + fnum);
		}else if (snum<fnum && snum<tnum){
			System.out.println("the Smaller Number is:"+ snum);
		}else if (tnum<fnum && tnum<snum){
			System.out.println("the Smaller Number is:"+ tnum);
		}			
	}	
	public static void main(String[] args){
		NumberGames numbergames= new NumberGames();
		numbergames.setDetails(11,200,11);
		numbergames.findMaxNumber();
		numbergames.findMinNum();
	}		
}