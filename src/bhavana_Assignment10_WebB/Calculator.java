package bhavana_Assignment10_WebB;

public class Calculator {

	int add(int a,int b) {
		return a+b;	
	}
	
	int subract(int a,int b) {
		return a-b;
	}
	
	int multiplication(int a,int b) {
		return a*b;
	}
	
	int dividion(int a,int b) {
		return a/b;
	}
	
	void printTotalAnswer(int addAns,int subAns,int mulAns,int divAns) {
		int total=addAns+subAns+mulAns+divAns;
		System.out.println("Total is:"+total);
	}
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		int addAns=cal.add(10, 20);
		int subAns=cal.subract(40, 10);
		int mulAns=cal.multiplication(12, 12);
		int divAns=cal.dividion(12, 4);
		cal.printTotalAnswer(addAns, subAns, mulAns, divAns);
	}
}
