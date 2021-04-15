package bhavana_assignment_17;
/*return a difference between sum of even number and odd numbers.	
	From given numbers, count the odd and even numbers.
	input : 10,23,26,27,88,87,65 
    output : evenSum - oddSum
	
	int getDifference(int[] input){
	
	}*/
public class SumOddEven {

	int evenSum,oddSum,evenCount,oddCount;
	
	void evenOddSum() {
		int arr[]= {10,23,26,27,88,87,65};
		for(int index=0;index<arr.length;index++) {
			if(arr[index]%2==0) 
				evenSum=evenSum+arr[index];
			else
				oddSum=oddSum+arr[index];
			}
		System.out.println("Sum of Even numbers:"+evenSum+" \nSum of odd numbers is:"+oddSum);
	}
	
	public static void main(String[] args) {
		SumOddEven so=new SumOddEven();
		so.evenOddSum();
	}
}
