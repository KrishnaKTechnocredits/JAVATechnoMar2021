package neha_Patil;

public class Number {
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
        Number num = new Number();
		num.evenNum(10,15);
		num.divisibleBy5(10,30);
		num.divisibleBy5And3(5,18);
		num.divisibleBy7Or13(5,40);
	}

}
