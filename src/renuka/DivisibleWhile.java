package renuka;

public class DivisibleWhile {

	void evenNumbers(int total){
		System.out.println("Even numbers are :");
		int count = 1;
		int i=10;
		while(count<=total){
			if(i%2==0){
				System.out.println(i);
				count  = count+1;
			}
			i++;
		}
	}

	void divisibleBy5(int total){
		System.out.println("Divisible by 5, numbers are :");
		int count=1;
		int i=10;
		while(count<=total){
			if(i%5==0){
				System.out.println(i);
				count = count+1;
			}
			i++;
		}
	}

	void divisibleBy5and3(int total){
		System.out.println("Divisible by 5 & 3, numbers are: ");
		int count=1;
		int i = 10;
		while(count<=total){
			if(i%5==0 && i%3==0){
				System.out.println(i);
				count = count+1;
			}
			i++;
		}
	}

	void divisibleBy7or13(int total){
		System.out.println("Divisible by 7 or 13 numbers are : ");
		int count=1;
		int i = 10;
		while(count<=total){
			if(i%7==0){
				System.out.println(i + " is divisible by 7");
				count = count+1;
			}
			i++;
			if(i%13==0){
				System.out.println(i + " is divisible by 13");
				count = count+1;
			}
			i++;
		}
	}

	public static void main(String[] args){
		DivisibleWhile dw = new DivisibleWhile();
		dw.evenNumbers(10);
		dw.divisibleBy5(10);
		dw.divisibleBy5and3(5);
		dw.divisibleBy7or13(5);
	}
}
