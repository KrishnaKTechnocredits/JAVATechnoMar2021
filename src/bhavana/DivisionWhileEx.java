package bhavana;

public class DivisionWhileEx {

	void evenNumbers(int startRange,int stopRange) {
		int i=startRange;
		while(i<=stopRange) {
			if(i%2==0)
				System.out.println(i);
				i++;
		}
	}
	
	void divisibleBy5(int startRange,int stopRange) {
		int i=startRange;
		while(i<=stopRange) {
			if(i%5==0)
				System.out.println(i);
				i++;
		}
	}
	
	void divisibleBy5and3(int startRange,int stopRange) {
		int i=startRange;
		while(i<=stopRange) {
			if(i%3==0 && i%5==0)
				System.out.println(i);
				i++;
		}
	}
	
	void divisibleBy7or13(int startRange,int stopRange) {
		int num1=7;
		int num2=13;
		int i=startRange;
		while(i<=stopRange) {
			if(i%num1==0)
				System.out.println(i+"is divisible by"+num1);
			else if(i%num2==0)
				System.out.println(i+"is divisible by"+num2);
			i++;
		}
	}
	public static void main(String[] args) {
		DivisionWhileEx dwe=new DivisionWhileEx();
		dwe.evenNumbers(10,15);
		dwe.divisibleBy5(10, 30);
		dwe.divisibleBy5and3(5, 18);
		dwe.divisibleBy7or13(5, 40);
	}
	
}