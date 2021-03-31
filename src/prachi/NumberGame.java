package prachi;

//Assignment_4_Program_1
//1. Create a class named as NumberGame with following method.
//a. findMaxNumber()
//method should take 3 parameters and print the maximum number from given 3 numbers.
//if all numbers are same print "Maximum number could not found, All given numbers are equals".

//b. findMinNumber()
//method should take 3 parameters and print the minimum number from given 3 numbers.
//if all numbers are same print "Minimum number could not found, All given numbers equal numbers".

//Sample input : 13,4,19
//Sample output : Maximum number is 13
//Minimum number is 4

//Sample input : 13,13,13
//Sample output : Maximum number could not found, All given numbers are identical
//Minimum number could not found, All given numbers are identical

//hint : To compare max,
//if(a>b && a>c)
//sop("a max");
//add appropiate logic for b and c.

class NumberGame{	
	 
	void findMaxNumber(int num1, int num2, int num3){
	    if (num1==num2 && num1==num3){
		    System.out.println("Maximum number could not found, All given numbers are equals");
	    }
	    else if (num1>num2 && num1>num3){
		    System.out.println(+num1+ " is the max number");
		}
	    else if (num2>num3){
		    System.out.println(+num2+ " is the max number");
		}
	    else{
			System.out.println(+num3+" is the max number");
		}
	}	
	void findMinNumber(int num1, int num2, int num3){
		 if (num1== num2 && num2== num3){
			 System.out.println("Minimum number could not found, All given numbers equal numbers");
		 }
	     else if (num1<num2 && num1<num3){
			 System.out.println(+num1+ " is the min number");
		 }
		 else if(num2<num2 && num2<num3){
			 System.out.println(+num2+ " is the min number");
		 }
		 else if(num3<num1 && num3<num1){
			 System.out.println(+num3+ " is the min number");
	     }	 
	}
	public static void main(String[] args){
		NumberGame numbergame = new NumberGame();
		numbergame.findMaxNumber(12, 12, 12);
		numbergame.findMaxNumber(12, 13, 14);
        numbergame.findMinNumber(10, 10, 10);
		numbergame.findMinNumber(10, 20, 30);
	}
}