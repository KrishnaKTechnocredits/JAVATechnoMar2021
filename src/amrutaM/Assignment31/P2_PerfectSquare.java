package amrutaM.Assignment31;
/*Program 2 : verify given number is a perfect square.
input : 25 
output : 25 is perfect square.*/
public class P2_PerfectSquare {

	void isNumberPerfectSquare(double number) {
		double result = Math.sqrt(number);
		if(result*result == number) {
			System.out.println(number+" Number is perfect square!!");
		}else {
			System.out.println(number+" Number is not a perfect square!!");
		}
		
	}
	public static void main(String[] args) {
		P2_PerfectSquare p2_PerfectSquare= new P2_PerfectSquare();
		p2_PerfectSquare.isNumberPerfectSquare(36);
		p2_PerfectSquare.isNumberPerfectSquare(50);
	}

	
}
