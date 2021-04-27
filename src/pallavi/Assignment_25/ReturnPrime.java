package pallavi.Assignment_25;

/*Program 1: Write a method which will return first 5 prime numbers from given range. Main method should print the output.
Input : Start Index -> 10
        End Index -> 50
Output : 11 13 17 19 23*/
public class ReturnPrime {

	int output[]=new int[5];
	int[] prime(int startIndex, int lastIndex) {
		 int count=0;
		for (int index = startIndex; index <= lastIndex; index++) {
			boolean flag = true;
			for (int num = 2; num < index / 2; num++) {
				if (index % num == 0) {
					flag = false;
					break;
				}
			}

			if (flag== true && count!=5) {
				output[count]=index;
				count++;
			
			}
		}
		return output;

	}
	public static void main(String[] args) {
		ReturnPrime returnPrime = new ReturnPrime();
		int[] newOutput=returnPrime.prime(10, 50);
	
		 for(int index=0;index<5;index++) {
			 System.out.println(newOutput[index]);
		 }

	}

}
