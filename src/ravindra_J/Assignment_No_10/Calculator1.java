/*Java Assignment-10 : 3rd April 2021
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

package ravindra_J.Assignment_No_10;

public class Calculator1 {

	int add(int x,int y){
		return x+y;
	}

	int sub(int x,int y){
		return x-y;
	}

	int multi(int x,int y){
		return  x*y;
	}

	int divi(int x,int y){
		return  x/y;
	}

	void printTotalAnswer(int a,  int s, int m , int d){
		int total = a+s+m+d;
		System.out.println(total);		
	}

	public static void main(String[] args) {
		Calculator1 calculator1 = new Calculator1();
		int add = calculator1.add(6,5);//11
		int sub = calculator1.sub(6,3);//3
		int multi = calculator1.multi(8,3);//24
		int divi = calculator1.divi(69,3);//23
		calculator1.printTotalAnswer(add, sub, multi, divi);//61
	}
}
