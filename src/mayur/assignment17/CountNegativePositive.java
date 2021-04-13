package mayur.assignment17;

public class CountNegativePositive {
	void find(int[] input) {
		int pCount = 0;
		int nCount = 0;
		for(int index = 0; index<input.length;index++) {
			if(input[index]>0)
				pCount++;
			else
				nCount++;
		}
		
		System.out.println("Count of positive numbers is: " +pCount);
		System.out.println("Count of negative numbers is: " +nCount);
		
	}
		
	public static void main(String[] args) {
		CountNegativePositive np = new CountNegativePositive();
		int[] input = {10,23,26,-27,-88,87,-65};
		np.find(input);
	}
}
	
	
		
	
	
