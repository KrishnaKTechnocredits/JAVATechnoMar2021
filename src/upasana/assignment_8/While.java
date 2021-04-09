package upasana.assignment_8;

public class While {
	public void even(int sIndex,int eIndex) {
		System.out.println("Even numbers are:");
		int i = sIndex;
		while(i<=eIndex) {
			if(i%2==0)
				System.out.println(i);
			i++;
		}
		System.out.println(" ");

	}

	public void divByFive(int sIndex,int eIndex) {
		System.out.println("Divisible by 5, numbers are:");
		int i = sIndex;
		while(i<=eIndex) {
			if(i%5==0)
				System.out.println(i);
			i++;
		}
		System.out.println(" ");
	}

	public void divByFiveAndThree(int sIndex,int eIndex) {
		System.out.println("Divisible by 5 & 3, numbers are:");
		int i = sIndex;
		while(i<=eIndex) {
			if(i%5==0 && i%3 ==0)
				System.out.println(i);
			i++;
		}
		System.out.println(" ");
	}

	public void divBySevenOrThirteen(int sIndex,int eIndex) {
		System.out.println("Divisible by 7 or 13, numbers are:");
		int i = sIndex;
		while(i<=eIndex) {
			if(i%7==0 || i%13 ==0)
				if(i%7==0)
					System.out.println(i +" is divisible by 7");
				else
					System.out.println(i +" is divisible by 13");
			i++;
		}
		System.out.println(" ");
	}

	public static void main(String[] args) {
		While obj = new While();
		obj.even(10,15);
		obj.divByFive(10,30);
		obj.divByFiveAndThree(5,18);
		obj.divBySevenOrThirteen(5, 40);
	}

}