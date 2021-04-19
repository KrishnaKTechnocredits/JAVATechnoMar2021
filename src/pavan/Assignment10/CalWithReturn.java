/*
 Write a class called calculator with following functionality.
a. add
b. subtraction
c. division
d. multiplication
e. printTotalAnswer.

Method a,b,c,d should have 2 parameters and return int value.
printTotalAnswer method should have 4 parameters and doesnt return anything.
Note : do not create any instance variable.
 */

package pavan.Assignment10;

public class CalWithReturn {

	int add(int a, int b){
		int add= a+b;
		return add; 
	}
	int sub(int a, int b){
		int sub= a-b;
		return sub; 
	}
	int mul(int a, int b){
		int mul= a*b;
		return mul; 
	}
	int div(int a, int b){
		int div= a/b;
		return div; 		
	}
	void totalAnswer(int sumans, int minuans,int mulans,int divans) {
		int	total = (sumans+minuans+mulans +divans);
		System.out.println("Total of all returns " + total);		
	}
	public static void main (String[]Args){
		CalWithReturn cali = new CalWithReturn();
		 int sumans= cali.add(30, 20);
		 int minusans= cali.sub(30, 10);
		 int mulans= cali.mul(30, 10);
		 int divans= cali.div(20, 5);
		 cali.totalAnswer(sumans, minusans, mulans, divans);
	}
}
