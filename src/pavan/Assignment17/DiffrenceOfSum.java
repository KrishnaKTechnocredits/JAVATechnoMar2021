/*
 Program 2: return a difference between sum of even number and odd numbers.	
	From given numbers, count the odd and even numbers.
	input : 10,23,26,27,88,87,65 
 */

package pavan.Assignment17;

public class DiffrenceOfSum {
	int evencount=0;
	int additionofeven=0;
	int oddcount=0;
	int additionofodd=0;
	void countNumbers(int[]args) {
		for (int index=0; index<7;index++) {
			if (args[index]%2==0){
				evencount++;             
				additionofeven = args[index]+additionofeven;	
				

			}
		}//System.out.println(additionofeven);
		
		for (int index=0; index<7; index++) {
			if (args[index]%2!=0){
				oddcount++;
				additionofodd= args[index]+additionofeven;
			}
		}//System.out.println(additionofodd);
	}
	void display() {
		int c = (additionofeven- additionofodd);
		System.out.println("diffrence Even and odd numbers is: "+ c);
	}
	
	public static void main(String[] args) {
		
		int[]num= {10,23,26,27,88,87,65};
		DiffrenceOfSum diffrenceOfSum= new DiffrenceOfSum();
		diffrenceOfSum.countNumbers(num);
		diffrenceOfSum.display();
	}

}
