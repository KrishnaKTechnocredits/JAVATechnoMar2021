package simmi;

public class Numbers {
	
	int num;
	
	void even(int num1, int num2) {
		for(int i = num1; i<= num2; i++) {
			if(i % 2 == 0) {
			num = i;
			System.out.println("Number is Even: " + num);
			}
		}
	}
	
	void divide(int num1, int num2) {
		for(int i = num1; i<= num2; i++) {
			if(i % 5 == 0) {
			num = i;
			System.out.println("The number divisible by 5 is: " + num);
			}
		}
	}
	
	void divide1(int num1, int num2){
		for(int i = num1; i<= num2; i++) {
			if(i % 5 == 0 && i % 3 == 0) {
			num = i;
			System.out.println("The number divisible by 5 and 3 is: " + num);
			}
		}
	}
	
	void divide2(int num1, int num2) {
		for(int i = num1; i<= num2; i++) {
			if(i % 7 == 0 || i % 13 == 0) {
			num = i;
			System.out.println("The number divisible by 7 or 13 is: " + num);
			}
		}
	}
	
	public static void main(String[] args) {
		Numbers numbers = new Numbers();
		numbers.even(10, 15);
		numbers.divide(10, 30);
		numbers.divide1(5, 18);
		numbers.divide2(5, 40);
		
	}	
}
