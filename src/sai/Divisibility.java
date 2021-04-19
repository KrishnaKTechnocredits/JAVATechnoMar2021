package sai;

/*
 * Assignment 6 : 30th March 2021
 * Divisibility by 2, 3, 5, 7, 13
 */

class Divisibility{
	
	void evenNumbers(int start, int end){
		System.out.println("Even numbers are :");
		for(int i=start;i<=end;i++){
			if(i%2==0){
				System.out.println(i);
			}
		}
	}
	
	void divisibleBy5(int start, int end){
		System.out.println("Divisible by 5, numbers are :");
		for(int i=start;i<=end;i++){
			if(i%5==0){
				System.out.println(i);
			}
		}
	}
	
	void divisibleBy5and3(int start, int end){
		System.out.println("Divisible by 5 & 3, numbers are: ");
		for(int i=start;i<=end;i++){
			if(i%5==0 && i%3==0){
				System.out.println(i);
			}
		}
	}
	
	void divisibleBy7or13(int start, int end){
		System.out.println("Divisible by 7 or 13 numbers are : ");
		for(int i=start;i<=end;i++){
			if(i%7==0){
				System.out.println(i + " is divisible by 7");
			}
			else if(i%13==0){
				System.out.println(i + " is divisible by 13");
			}
		}
	}
	
	public static void main(String[] args){
		Divisibility divisibility = new Divisibility();
		divisibility.evenNumbers(10,15);
		divisibility.divisibleBy5(10,30);
		divisibility.divisibleBy5and3(5,18);
		divisibility.divisibleBy7or13(5,40);
	}
}