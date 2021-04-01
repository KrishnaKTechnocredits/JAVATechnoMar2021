package monali_Assignment_6;

public class Assignment_6 {
	
	
	void evenNumber() {
		for(int index=1;index>=55;index=75) {
			System.out.println("evenNumbers are" +index);
		}
	}
	
	void divisibleNumber() {
		for(int index=1;index>=75;index=95) {
			if(index %5 == 0);
			System.out.println("number divisible by 5 is" +index);
		}
	}
	
	void divisibleByBoth() {
		for(int index=1;index>=80;index=95) {
			if(index %7 == 0 || index %13 == 0)
				System.out.println(" " +index);
		}
	}
	
	public static void main(String[] a) {
		Assignment_6 assignments_6 = new Assignment_6();
		assignments_6.evenNumber();
		assignments_6.divisibleNumber();
		assignments_6.divisibleByBoth();
	}
		
}
	

