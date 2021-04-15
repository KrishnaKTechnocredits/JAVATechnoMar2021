package ashwini.arrayAssignment17;

/*Program 1:  From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65 
output : even -> 3
      odd ->  array.length - evenCount */


public class FindingEvenAndOddNumbers {
	int evenCount=0, oddCount=0;
	void evenOddNumber(int[] input) {
		for(int index=0; index<input.length ; index++) {
			//System.out.println(input[index]);
			if(input[index]%2==0) {
				System.out.println("even number is :"+input[index]);
			    evenCount++;
			}
			else {
				//oddCount=input.length-evenCount;
				System.out.println("odd numbers is:"+input[index]);
				oddCount++;
			}

		}
		System.out.println("Count of even number is- "+evenCount);
		System.out.println("Count of odd number is- "+oddCount);
	}
	

	public static void main(String[] args) {
		int[] array = {10,23,26,27,88,87,65};
		FindingEvenAndOddNumbers evenOdd = new FindingEvenAndOddNumbers();
		evenOdd.evenOddNumber(array);
		
		
	}

}
