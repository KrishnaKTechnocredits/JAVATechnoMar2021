package sandesh.OWN_Practice_Sandesh_1;

public class ReverseNumberModLogic {

	public static void main(String[] args) {
		int num = -123456;
		int eachDigit;
		System.out.print("Reverse of number " + num + " is -: ");
		while(num != 0) {
			if (num >= 0) {
				eachDigit = num%10;
				System.out.print(eachDigit);
				num = num/10;
			}
			else {								// to handle numbers less than zero else it would print
				eachDigit = num%10;				// -6-5-4-3-2-1 as reverse of -123456	
				System.out.print(eachDigit);
				num = (-1*num)/10;
			}
		}
	}
}
