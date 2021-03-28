package meenu;

/* Assignment_4 -> Program_1: Create a class named as NumberGame with following method.
a. findMaxNumber()
method should take 3 parameters and print the maximum number from given 3 numbers.
if all numbers are same print "Maximum number could not found, All given numbers are equals".

b. findMinNumber()
method should take 3 parameters and print the minimum number from given 3 numbers.
if all numbers are same print "Minimum number could not found, All given numbers equal numbers".
*/

class NumberGame{
	
	void findMaxNumber(int a, int b, int c){
		if((a == b) && (b ==c)){
			System.out.println("Maximum number could not found, All given numbers are identical");
		}else if(a>b && a>c){
			System.out.println("Maximum number is "+a);
		}else if(b>c){
			System.out.println("Maximum number is "+b);
		}else{
			System.out.println("Maximum number is "+c);
		}			
	}
	
	void findMinNumber(int a,int  b, int c){
		if ((a == b) && (b == c)){
			System.out.println("Minimum number could not found, All given numbers are identical");
		}else if(a<b && a<c){
			System.out.println("Minimum number is "+a);
		}else if(b<c){
			System.out.println("Minimum number is "+b);
		}else{
			System.out.println("Minimum number is "+c);
		}			
	}
	
	public static void main(String[] args){
		NumberGame numberGame = new NumberGame();
		numberGame.findMaxNumber(13,4,19);
		numberGame.findMaxNumber(13,13,13);
		numberGame.findMinNumber(13,4,19);
		numberGame.findMinNumber(13,13,13);
	}
}	

