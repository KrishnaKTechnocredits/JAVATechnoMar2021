//Assignment 6- 30 march 2021 even-div by..

package kajal;

public class Numbers {
	int num1;
	int num2;
	
	void evennumbers(int start, int end) { 
		num1 = start;
		num2 = end;
		
	 	for(num1=start; num1<= num2; num1++) {
			if(num1 % 2 == 0)
				System.out.println("Even numbers are:" + num1);
		}
	}
	
	void divisibleby5(int start, int end) {
		 num1 = start;
		 num2 = end;
		 
		for(num1=start; num1 <= num2; num1++) {
			if(num1 % 5 == 0)
				System.out.println("Divisible by 5 numbers are:" + num1);
		}
	}
	
	void divisibleBy5and3(int start, int end) {
		 num1 = start;
		 num2 = end;
		 
		for(num1=start; num1 <= num2; num1++) {
			if(num1 % 5 == 0 && num1 % 3 == 0)
				System.out.println("Divisible by 5 and 3 numbers are:" + num1);
		}
		
	}
	
	void divisibleBy7or13(int start, int end) {
		 num1 = start;
		 num2 = end;
		 
		for(num1=start; num1 <= num2; num1++) {
			if(num1 % 7 == 0 || num1 % 13 ==0)
				System.out.println("Divisible by 7 and 13 numbers are:" + num1);
		}
			
	}
	
	public static void main(String [] args) {
		Numbers numbers = new Numbers();
		numbers.evennumbers(10,15);
		numbers.divisibleby5(10,30);
	    numbers.divisibleBy5and3(5,18);
		numbers.divisibleBy7or13(5,40);
		
	}
}

