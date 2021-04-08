package ashtha.Assignment8;

public class NumberPrint {
		
		void printEvenNumbers (int endIndex ) {
			int count = 1;			
			int num =1;
			while (count<=endIndex){
				if (num%2==0) {
					System.out.println(num);
					count++;
				}
				num++;
			}
		}
		
		void printMultipleOfFive (int endIndex) {
			int count = 1;
			int num = 1;
			while (count<=endIndex){
				if(num%5==0) {
					System.out.println(num);
					count++;
				}
				num++;
			}	
		}
		
		void printMultipleofFiveAndThree (int endIndex) {
			int count = 1;
			int num = 1;
			while(num<=endIndex) {
				if(num%3==0 && num%5==0) {
					System.out.println(num);
					count++;
				}
				num++;
			}
		}
		
		void printMultipleofSevenOrThirteen (int endIndex) {
			int count = 1;
			int num = 1;
			while(count<=endIndex){
				if(num%7==0) {
					System.out.println(num+" is divisible by 7");
					count++;
				}else if(num%13==0) {
					System.out.println(num+" is divisible by 13");
					count++;
				}
				num++;
			}
		}
		
		public static void main(String[] args) {
			NumberPrint numberPrint = new NumberPrint();
			System.out.println("The even numbers are:");
			numberPrint.printEvenNumbers(5);
			System.out.println("The numbers divisible by 5 are:");
			numberPrint.printMultipleOfFive(10);
			System.out.println("The numbers divisible by 3 and 5 are:");
			numberPrint.printMultipleofFiveAndThree(20);
			System.out.println("The numbers divisible by 7 and 13 are:");
			numberPrint.printMultipleofSevenOrThirteen(10);	
		}
	}

