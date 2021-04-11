package dipali;

public class Calculator2 {
	
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
		Calculator2 calculator2=new Calculator2();
		int addSum=calculator2.add(50, 10);
		int subSum=calculator2.sub(50, 10);
		int multSum=calculator2.multiply(5, 10);
		int divSum=calculator2.div(50, 10);
		calculator2.printTotalAnswer(addSum, subSum ,multSum, divSum);
	}

}
