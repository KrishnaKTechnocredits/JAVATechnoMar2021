package dipali;

import java.util.Scanner;

public class Assignment14P2 {
	
	public int add(int num1 , int num2){
		int addSum=num1+num2;
		return addSum;
	}
	
	public int sub(int num1,int num2){
		int subSum=num1-num2;
		return subSum;
	}

	public int multiply(int num1 , int num2){
		int multSum=num1*num2;
		return multSum;
	}
	
		public int div(int num1 , int num2){
		int divSum=num1/num2;
		return divSum;
	}
		
	public void printTotalAnswer(int addSum, int subSum, int multSum, int divSum) {
		int total=addSum+subSum+multSum+divSum;
		System.out.println("Total of all operations is "+total);
	}

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			Assignment14P2 assignment14p2=new Assignment14P2();
			int num1=scanner.nextInt();
			int num2=scanner.nextInt();
			int addSum = assignment14p2.add(num1, num2);
			int subSum = assignment14p2.sub(num1, num2);
			int multSum = assignment14p2.multiply(num1, num2);
			int divSum = assignment14p2.div(num1, num2);
			assignment14p2.printTotalAnswer(addSum, subSum, multSum, divSum);
		}
	}
}


