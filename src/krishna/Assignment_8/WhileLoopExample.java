package krishna.Assignment_8;

public class WhileLoopExample {
	
	void evenNum(int start, int end) {
		while (start<=end) {
			if(start%2==0){
				System.out.println("Even number is: "+start);
			}
			start++;
		}
		System.out.println();
	}
	
	void divisibleBy5(int start, int end) {
		while (start<=end) {
			if(start%5==0){
				System.out.println("Number divisible by 5: "+start);
			}
			start++;
		}
		System.out.println();
	}
	
	void divisibleBy5And3(int start, int end) {
		while (start<=end) {
			if(start%5==0 && start%3==0){
				System.out.println("Number divisible by both 5 & 3 is : "+start);
			}
			start++;
		}
		System.out.println();
	}
	
	void divisibleBy7Or13(int start, int end) {
		while (start<=end) {
			if(start%7==0){
				System.out.println(start+" is divisible by 7");
			}
			if(start%13==0){
				System.out.println(start+" is divisible by 13 ");
			}
			start++;
		}
		
		System.out.println();
	}
			
	public static void main(String[] args) {
		WhileLoopExample whileLoopExample = new WhileLoopExample();
		whileLoopExample.evenNum(10,15);
		whileLoopExample.divisibleBy5(10,30);
		whileLoopExample.divisibleBy5And3(5,18);
		whileLoopExample.divisibleBy7Or13(5,40);
	}
}
