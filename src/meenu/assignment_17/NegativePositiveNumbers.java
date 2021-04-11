package meenu.assignment_17;

/*From given numbers, count the negative and positive numbers.
input : 10,23,26,-27,-88,87,-65 
output : negative -> 3
         positive -> 4
*/

public class NegativePositiveNumbers {
	
	int getCount(int[] arrayOfNumbers) {
		int positiveCount = 0;
		int index = 0;
		while(index<arrayOfNumbers.length) {	
			if(arrayOfNumbers[index]>0)
			   positiveCount++;
			index++;
		}	
		return positiveCount;			
	}

	public static void main(String[] args) {
		int[] arrayOfNumbers = {10,23,26,-27,-88,87,-65};
		NegativePositiveNumbers negativePositiveNumbers = new NegativePositiveNumbers();
		int posCount = negativePositiveNumbers.getCount(arrayOfNumbers);
		System.out.println("count of positive number in array: "+posCount);
		System.out.println("count of negative number in array: "+(arrayOfNumbers.length - posCount));

	}

}
