package upasana;

public class Numbers {
	
	public void even(int sIndex,int eIndex) {
		System.out.println("Even numbers are:");
		for(int i = sIndex; i<=eIndex;i++) {
			if(i%2==0)
				System.out.println(i);
		}
		System.out.println(" ");
		
	}
	
	public void divByFive(int sIndex,int eIndex) {
		System.out.println("Divisible by 5, numbers are:");
		for(int i = sIndex; i<=eIndex;i++) {
			if(i%5==0)
				System.out.println(i);
		}
		System.out.println(" ");
	}
	
	public void divByFiveAndThree(int sIndex,int eIndex) {
		System.out.println("Divisible by 5 & 3, numbers are:");
		for(int i = sIndex; i<=eIndex;i++) {
			if(i%5==0 && i%3 ==0)
				System.out.println(i);
		}
		System.out.println(" ");
	}
	
	public void divBySevenOrThirteen(int sIndex,int eIndex) {
		System.out.println("Divisible by 7 or 13, numbers are:");
		for(int i = sIndex; i<=eIndex;i++) {
			if(i%7==0 || i%13 ==0)
				if(i%7==0)
					System.out.println(i +" is divisible by 7");
				else
					System.out.println(i +" is divisible by 13");
		}
		System.out.println(" ");
	}
	
	public static void main(String[] args) {
		Numbers numbers = new Numbers();
		numbers.even(10,15);
		numbers.divByFive(10,30);
		numbers.divByFiveAndThree(5,18);
		numbers.divBySevenOrThirteen(5, 40);
	}

}
