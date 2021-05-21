package monika.Assignment23_PrimeNoPrograms;

public class PractisePrimeNo {
	
	static boolean isPrimeFlag = true;
	static void FindPrimeOrNot(int input) {
		if(input > 1) {
			for(int n = 2;n<input;n++) {
				if(	input % n == 0)
					isPrimeFlag = false;
			}
		}
	}
	
	static void m1() {
		if(isPrimeFlag)
			System.out.println("No. is Prime");
		else
			System.out.println("No. is ot prime");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindPrimeOrNot(3);
		m1();

	}

}
