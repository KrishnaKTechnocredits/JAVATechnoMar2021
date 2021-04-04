package nikita;

public class calculator {

	int add(int x,int  y) {
		int q=x+y;
		return q;
	}
	
	int substract(int x, int y) {
		int q=x-y;
		return q;
	}
	
	int multiply(int x, int y) {
		int q=x*y;
		return q;
	}
	
	int division(int x, int y) {
		int q=x/y;
		return q;
	}
	
	void printTotalAnswer(int addans, int subans, int mulans, int divans) {
		int total= addans+ subans+ mulans+ divans;
		System.out.println("The total of number is :" + total);
		
	}
	
	public static void main(String[] args) {
		calculator c1= new calculator();
		int addans= (c1.add(10, 20)); //30
		int subans=(c1.substract(20, 18));//2
		int mulans=(c1.multiply(5, 6));// 30
		int divans=(c1.division(10, 5));//2
		
		c1.printTotalAnswer(addans, subans, mulans, divans);
		
	}

}
