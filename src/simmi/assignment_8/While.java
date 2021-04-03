package simmi;

public class While {
	
	
	void even(int num1, int num2) {
		int num = num1;
		while(num <= num2) {
			if(num % 2 == 0) 
			System.out.println("Number is Even: " + num);
			num++;
		}
	}
	
	void divide(int num1, int num2) {
		int num = num1;
		while(num <= num2) {
			if(num % 5 == 0) 
			System.out.println("The number divisible by 5 is: " + num);
			num++;
		}
	}
	
	void divide1(int num1, int num2){
		int num = num1;
		while(num <= num2) {
			if(num % 5 == 0 && num % 3 == 0) 
			System.out.println("The number divisible by 5 and 3 is: " + num);
			num++;
		}
	}
	
	void divide2(int num1, int num2) {
		int num = num1;
		while(num <= num2) {
			if(num % 7 == 0 || num % 13 == 0) 
			System.out.println("The number divisible by 7 or 13 is: " + num);
			num++;
		}
	}
	
	public static void main(String[] args) {
		While numbers = new While();
		numbers.even(10,15);
		numbers.divide(10,30);
		numbers.divide1(5,18);
		numbers.divide2(5,40);
		
	}	
}
