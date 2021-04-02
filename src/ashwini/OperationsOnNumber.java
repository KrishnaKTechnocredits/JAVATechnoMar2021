package ashwini;

public class OperationsOnNumber {
	void printEven(int start,int end){
		for(int index=start; index<=end ; index++){
			if(index%2 == 0)
			System.out.println("even number between 10-15 are- "+index);
		}
	}
	
	void numberDivisibleBy5(int start , int end){
		for(int index=start; index<=end ; index++){
			if(index%5==0)
			System.out.println("Numbers divisible by 5 between 10-30 are- "+index);
		}
	}
		
		void numberDivisibleBy5And3(int start, int end){
			for(int index=start; index<=end ; index++){
				if(index%5==0 && index%3==0)
				System.out.println("Numbers divisible by 5 and 3 between  5 to 18 are- "+index);
			}
		}
		
		void numberDivisibleBy7Or3(int start, int end){
			for(int index=start; index<=end ; index++){
				if(index%7==0 || index%13==0)
				System.out.println("Numbers divisible by 5 or 3 between  5 to 18 are- "+index);
			}
		}
	

	public static void main(String[] args) {
		OperationsOnNumber operationNumber = new OperationsOnNumber();
		operationNumber.printEven(10,15);
		operationNumber.numberDivisibleBy5(10,30);
		operationNumber.numberDivisibleBy5And3(5,18);
		operationNumber.numberDivisibleBy7Or3(5,40);

	}

}
