package krishna;

public class NumberOperations{

	void evenNum(int start, int end) {
		for(int i=start;i<=end;i++) {
			if(i%2==0){
				System.out.println("Even number is: "+i);
			}
		}
		System.out.println();
	}
	void oddCheck(int start, int end) {
		for(int i=start;i<=end;i++){
			if(i%5==0){
				System.out.println("Number divisible by 5 is : "+i);
			}
		}
		System.out.println();
	}
	void divisibleBy5And3(int start, int end) {
		for(int i=start;i<=end;i++){
			if(i%5==0 && i%3==0){
				System.out.println("Number divisible by both 5&3 is : "+i);
			}
		}
		System.out.println();
	}
	void divisibleBy7Or13(int start, int end) {
		for(int i=start;i<=end;i++){
			if(i%7==0){
				System.out.println( i+" is divisible by 7");
			}
			if(i%13==0){
				System.out.println( i+" is divisible by 13");
			}
		}
	}
	public static void main(String[] args) {
		NumberOperations numberOperations = new NumberOperations();
		numberOperations.evenNum(10,15);
		numberOperations.oddCheck(10,30);
		numberOperations.divisibleBy5And3(5,18);
		numberOperations.divisibleBy7Or13(5,40);
	}
}
