package amrutaM.arrayAssignments.AugArrayAssignments;

/* program 3 : 
 * write a method which returns 5 smaller numbers of the given number. 
 * input : 50 
 * output : 49, 48, 47, 46, 45 
*/
public class Assignment13_Program3 {

	int[] get5SmallerNumbers(int input) {
		int smallerNumber[] = new int[5];
		for (int index = 0; index < 5; index++) {
			smallerNumber[index]=--input;
		}
		return smallerNumber;

	}

	public static void main(String[] args) {
		int input = 50;  
		Assignment13_Program3 assignment13_Program3 = new Assignment13_Program3();
		int [] smallerNumbers = assignment13_Program3.get5SmallerNumbers(input);
		System.out.println("5 smaller numbers than " +input+ " are - ");
		for(int index=0;index<smallerNumbers.length;index++) {
			System.out.println(smallerNumbers[index]);
		}
		
	}

}
