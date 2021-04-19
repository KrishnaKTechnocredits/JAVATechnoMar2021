package bhavana_assignment_17;

public class PositiveNegative {
/*From given numbers, count the negative and positive numbers.
input : 10,23,26,-27,-88,87,-65 
output : negative -> 3
         positive -> 4 */
	
	void countPositiveNegative() {
		int[] arr= {10,23,26,-27,-88,87,-65};
		int positiveCount=0,negativeCount=0;
		
		for(int index=0;index<arr.length;index++) {
			if(arr[index]<0)
				negativeCount++;
			else
				positiveCount++;
		}
		System.out.println("Count of negative numbers is:"+negativeCount+"\nCount of positive numbers is:"+positiveCount);
	}
	
	public static void main(String[] args) {
		PositiveNegative pn=new PositiveNegative();
		pn.countPositiveNegative();
	}
}
