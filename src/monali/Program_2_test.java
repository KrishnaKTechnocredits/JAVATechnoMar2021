package monali;

public class Program_2_test {
	
	void diffOfFamilyMember(int[] array) {
		
		int diff = 0;
		int[] num = new int[array.length];
			for(int i = 0; i <array.length; i++) {
			for(int index = i+1; index <array.length; index++) {
				diff = array[index] - array[i];

			}
		}
		System.out.println("difference between age of two family member is "+diff);
	}
	



	
	public static void main(String[] args) {
		Program_2_test program = new Program_2_test();
		int[] array = {20,35,45,47,50};
		program.diffOfFamilyMember(array);
	}
}
		
	
	