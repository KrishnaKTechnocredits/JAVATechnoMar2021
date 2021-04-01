package rupali;

public class Assignment8 {
	
	void isEven(int evencount) {
		System.out.println("All EVEN numbers between");
		 int i=1;
		 int count=1;
		 while(count<=evencount) {
			if(i%2 == 0) {
			System.out.println(i);
			count++;
			}
			i++;
		 }
	}
	
	void isDivisibleby5(int divisorcountfor5 ) {
		System.out.println("All numbers divisible by 5 are");
			int i=1;
			int count=1;
			while(count<=divisorcountfor5) {
				if(i%5==0) {
				System.out.println(i);
				count++;
				}
				i++;
			}
	}
	
	void isDivisibleby5n3(int divisorcountfor5n3) {
		System.out.println("All numbers divisible by 5 are");
		int i=1;
		int count=1;
		while(count<=divisorcountfor5n3) {
			if(i%5==0 && i%3==0) {
			System.out.println(i);
			count++;
			}
			i++;
		}
	}
	
	void isDivisibleby7or13(int divisorcountfor7n13) {
		System.out.println("All numbers divisible by 5 are");
		int i=1;
		int count=1;
		while(count<=divisorcountfor7n13) {
			if(i%7==0 || i%13==0) {
			System.out.println(i);
			count++;
			}
			i++;
		}
	}
	
	public static void main(String[] args) {
		Assignment8 assignment8= new Assignment8();
		assignment8.isEven(10);
		assignment8.isDivisibleby5(5);
		assignment8.isDivisibleby5n3(7);
		assignment8.isDivisibleby7or13(5);
		}
}





